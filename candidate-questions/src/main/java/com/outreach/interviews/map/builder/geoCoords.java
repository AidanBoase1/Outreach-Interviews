package com.outreach.interviews.map.builder;

//Had a lot of errors with mvn which wasted a major chunk of my time.
//Thank you for the opportunity, I will be sure to try again
//When I have more experience.


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.outreach.interviews.map.enums.MapModes;
import com.outreach.interviews.map.enums.MapOperations;
import com.outreach.interviews.map.enums.MapRegions;


public class geoCoords{
	public static class geoCoords{

	private final String URL = "https://maps.googleapis.com/maps/api/";
	private Sting destination;


	public destination getDest(){
		this.destination = destination;
		return destination;
	}
	private final String getAPIKey() {
		return "AIzaSyAW0D4KOwyWK51x-Awks59RhQKuX9X3Fu4";
	}	

	}
}
