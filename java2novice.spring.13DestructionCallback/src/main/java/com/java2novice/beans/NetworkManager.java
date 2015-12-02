package com.java2novice.beans;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkManager implements InitializingBean, DisposableBean {

	private HttpURLConnection connection;
	private String urlStr;

	public void setUrlStr(String urlStr) {
		this.urlStr = urlStr;
	}

	public void afterPropertiesSet() {

		System.err.println("Inside init() method...");
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

	public void destroy() {
		try {
			System.err.println("Inside destroy() method...");
			if (this.connection != null) {
				connection.disconnect();
			}
		} catch (Exception ex) {

		}
	}

	public void readData() {
		try {
			int responseCode = this.connection.getResponseCode();
			System.err.println("Response code: " + responseCode);
			/**
			 * do your business logic here
			 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
