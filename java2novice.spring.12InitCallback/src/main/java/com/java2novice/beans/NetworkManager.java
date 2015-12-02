package com.java2novice.beans;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.InitializingBean;

/**
 * Spring comes with different options to call initialization method. 
 * In general, we need to initialize some resources during bean creation. 
 * You can achieve this by implementing org.springframework.beans.factory.InitializingBean inteface with in your spring bean. 
 * You need implement afterPropertiesSet() method, and write all initialization code with in this method.
 * An alternative approach has been given in the previous example How to invoke spring bean init and destory methods?.
 * 
 * @see more at: http://java2novice.com/spring/initialization-callback/#sthash.uo3BMPQw.dpuf
 *  
 * @author java2novice
 *
 * @date 2015年12月2日下午2:46:02
 */
public class NetworkManager implements InitializingBean {

	private HttpURLConnection connection;
	private String urlStr;

	public void setUrlStr(String urlStr) {
		this.urlStr = urlStr;
	}

	public void afterPropertiesSet() {

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