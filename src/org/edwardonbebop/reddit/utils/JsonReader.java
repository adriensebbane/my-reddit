package org.edwardonbebop.reddit.utils;

import java.io.IOException;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JsonReader {

	public static final String TAG = "MyReddit.utils";

	public static ObjectMapper MAPPER = null;

	public JsonReader() {
		if (MAPPER == null) {
			MAPPER = new ObjectMapper();
		}
	}

	public <T> T readJson(String json, Class<T> theClass) {
		ObjectReader reader = MAPPER.reader(theClass);
		T result = null;
		try {
			Log.d(TAG, "Parsing: " + json);
			result = reader.readValue(json);
		} catch (IOException e) {
			Log.e(TAG, "Could not read Json, returning null result.");
			e.printStackTrace();
		}
		return result;
	}
}