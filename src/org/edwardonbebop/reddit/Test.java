package org.edwardonbebop.reddit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.HttpResponse;
import org.apache.http.HttpEntity;

import org.edwardonbebop.reddit.utils.JsonReader;

public class Test extends Activity
{
	public static final String DEFAULT_TAG = "MyReddit";
    public static final String REDDIT_ROOT_URL = "http://www.reddit.com";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.default_layout);
        JsonReader reader = new JsonReader();
        HttpResponse response = this.getReddits();
        List<String> content = this.getContent(response);
        List<Thing> things = new ArrayList<Thing>();
        for(String line: content) {
        	Log.i(DEFAULT_TAG, "Line: " + line);
            Listing theThing = reader.<Listing>readJson(line, Listing.class);
            if (theThing != null) {
                Data data = theThing.getData();
                Child[] children = data.getChildren();
                int childCount = children.length;
                Log.i(DEFAULT_TAG, "Found " + childCount + " child elements.");
                for(Child currentChild: children) {
                    Thing currentThing = currentChild.getData();
                    things.add(currentThing);
                    Log.i(DEFAULT_TAG, "Kind: " + currentThing.getKind());
                    Log.i(DEFAULT_TAG, "Title: " + currentThing.getTitle());
                    Log.i(DEFAULT_TAG, "Url: " + currentThing.getUrl());
                    Log.i(DEFAULT_TAG, "Text: " + currentThing.getSelftext());
                    Log.i(DEFAULT_TAG, "Subreddit: " + currentThing.getSubreddit());
                }
            } else {
                Log.w(DEFAULT_TAG, "Got null result from parsing.");
            }
        }
        ListView redditListView = (ListView) findViewById(R.id.reddit_list_view);
        if(redditListView != null) {
            Log.d(DEFAULT_TAG, "Creating <ThingAdapter>.");
            
            ThingAdapter redditArrayAdapter = new ThingAdapter(
                this,
                android.R.layout.simple_list_item_1,
                things);
            redditListView.setAdapter(redditArrayAdapter);
        } else {
            Log.w(DEFAULT_TAG, "Cannot process <null> view.");
        }
    }

    public String createQuery(String subreddit, Integer count) {
        StringBuilder sb = new StringBuilder();
        sb.append(REDDIT_ROOT_URL);
        String theSubreddit = "listing";
        if (subreddit != null) {
            theSubreddit = subreddit;
        }
        int redditCount = 15;
        if(count != null && count > 0) {
            redditCount = count;
        }
        sb.append("/");
        sb.append(subreddit + ".json");
        sb.append("?limit=" + count);
        return sb.toString();
    }

    public HttpResponse getReddits() {
        // "http://www.reddit.com/new.json?limit=2"
        String url = this.createQuery("new", 2);
        HttpGet request = Factory.getHttpGetRequest(url);
        HttpClient client = Factory.getHttpClient();
        HttpResponse response = null;
        try {
        	response = client.execute(request);
        } catch(IOException e) {
        	Log.e(DEFAULT_TAG, "Error while executing the request.");
        	e.printStackTrace();
        }
        return response;
    }

    public List<String> getContent(HttpResponse response) {
    	HttpEntity entity = response.getEntity();
    	List<String> sample = new ArrayList<String>();
    	int maxLines = 100;
    	try {
            GZIPInputStream gzipis = new GZIPInputStream(entity.getContent());
            //InputStreamReader isr = new InputStreamReader(entity.getContent());
	    	InputStreamReader isr = new InputStreamReader(gzipis);
	    	BufferedReader reader = new BufferedReader(isr);
	    	String line = null;
	    	int lineCount = 0;
	    	while ((line = reader.readLine()) != null) {
	    		++lineCount;
	    		if(lineCount < maxLines) {
	    			sample.add(line);
	    		}
	    	}
	    	entity.consumeContent();
	    	Log.i(DEFAULT_TAG, "Got " + lineCount + " lines from response.");
    	} catch(IOException e) {
    		Log.e(DEFAULT_TAG, "Error while reading content.");
    		e.printStackTrace();
    	}
    	return sample;
    }
}
