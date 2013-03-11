package org.edwardonbebop.reddit;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.edwardonbebop.reddit.Thing;

public class ThingAdapter extends ArrayAdapter<Thing> {

    public static final String TAG = "MyReddit.ThingAdapter";

	public ThingAdapter(Context context, int textViewResourceId, List<Thing> things) {
        super(context, textViewResourceId, things);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	View theView = convertView;
    	if(theView == null) {
    		LayoutInflater inflater = LayoutInflater.from(this.getContext());
      		theView = inflater.inflate(R.layout.reddit_item, null);
    	}
    	Thing theThing = this.getItem(position);
    	if(theThing != null) {
			TextView title = (TextView) theView.findViewById(R.id.title);
            TextView url = (TextView) theView.findViewById(R.id.url);
      		if (title != null) {
                Log.i(TAG, "Updating <title> view[" + theThing.getTitle() + "].");
                title.setText(theThing.getTitle());
			} else {
                Log.w(TAG, "Got null <title> view.");
            }
			if(url != null) {
                Log.i(TAG, "Updating <url> view.");
				url.setText("URL: " + theThing.getUrl());
			} else {
                Log.w(TAG, "Got null <url> view.");
            }
    	}
    	return theView;
    }
}