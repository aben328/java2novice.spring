package com.java2novice.beans;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * In case, if you have many spring beans with initialization and destory method, then you need to define init-method
 * and destroy-method on each individual spring bean. Spring provides an alternative and flexible way to configure this.
 * You can define only once with same method signature and you can use across all spring beans. You need to configure
 * default-init-method and default-destroy-method attributes on the <beans> element. This example shows how to configure
 * it.
 * @author java2novice
 * @date 2015年12月2日下午5:33:14
 */
public class NetworkManager {

	private HttpURLConnection connection;
	private String urlStr;

	public void setUrlStr(String urlStr) {
		this.urlStr = urlStr;
	}

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
