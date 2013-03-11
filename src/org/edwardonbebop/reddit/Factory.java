package org.edwardonbebop.reddit;

import java.io.IOException;

import android.util.Log;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.CoreConnectionPNames;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * A class that is responsible for application elements instantiation.
 */
public class Factory {


	public static final String TAG = "MyReddit.Factory";

	private static JsonFactory JSON_FACTORY_INSTANCE = null;
	
	public static HttpGet getHttpGetRequest(String url) {
			HttpGet request = new HttpGet(url);
			HttpParams parameters = request.getParams();
			parameters.setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 15000);
			parameters.setIntParameter(CoreConnectionPNames.SO_TIMEOUT, 15000);
			request.addHeader("Accept-Encoding", "gzip");
			return request;
	}

	public static HttpClient getHttpClient() {
		DefaultHttpClient client = new DefaultHttpClient();
		return client;
	}

	public static HttpClient getHttpClient(HttpParams params) {
		DefaultHttpClient client = new DefaultHttpClient(params);
		return client;
	}

	public static JsonFactory getJsonFactory() {
		if(JSON_FACTORY_INSTANCE == null) {
			JSON_FACTORY_INSTANCE = new JsonFactory();
		}
		return JSON_FACTORY_INSTANCE;
	}

	public static JsonParser getJsonParser(String json) {
		JsonFactory factory = getJsonFactory();
		JsonParser parser = null;
		try {
			parser = factory.createJsonParser(json);
		} catch (IOException e) {
			Log.e(TAG, "Could not create JsonParser, returning null instance.");
			e.printStackTrace();
		}
		return parser;
	}
}