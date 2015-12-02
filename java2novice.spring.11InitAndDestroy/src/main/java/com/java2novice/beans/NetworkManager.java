package com.java2novice.beans;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * You can define initialization and destroy methods with in the spring bean. You can configure it using init-method,
 * and destroy-method in the xml based configuration file. These are part of spring bean life cycle. The initialization
 * method will be called immediately after bean creation, and destroy method will be called before killing the bean
 * instance. In this page the example class NetworkManager has an init() method which initializes http connection
 * object, and the destroy() method will be closing the http connection.
 * @author java2novice
 * @date 2015年12月2日上午11:46:17
 */
public class NetworkManager {

	private HttpURLConnection connection;

	public void init() {
		System.out.println("Inside init() method...");
		String url = "http://www.baidu.com/search?q=java2novice";
		URL obj;
		try {
			obj = new URL(url);
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
