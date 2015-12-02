package com.java2novice.beans;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * In the previous example you have seen calling spring bean initialization and destroy methods using xml bean
 * configurations. This page shows how to configure spring bean initialization and destroy method calls using java
 * annotations @PostConstruct and @PreDestroy. These annotations are not belong to spring API, these are part of J2ee
 * library common-annotations.jar file.
 * @see more at: http://java2novice.com/spring/init-destroy-annotations/#sthash.EaYg5ndl.dpuf
 * @author java2novice
 */
public class NetworkManager {

	private HttpURLConnection connection;
	private String urlStr;

	public void setUrlStr(String urlStr) {
		this.urlStr = urlStr;
	}

	@PostConstruct
	public void init() {

		System.out.println("Inside init() method...");
		URL obj;
		try {
			obj = new URL(this.urlStr);
			// initialize http connection here
			this.connection = (HttpURLConnection) obj.openConnection();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void destroy() {
		try {
			System.out.println("Inside destroy() method...");
			if (this.connection != null) {
				connection.disconnect();
			}
		} catch (Exception ex) {

		}
	}

	public void readData() {
		try {
			int responseCode = this.connection.getResponseCode();
			System.out.println("Response code: " + responseCode);
			/**
			 * do your business logic here
			 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
