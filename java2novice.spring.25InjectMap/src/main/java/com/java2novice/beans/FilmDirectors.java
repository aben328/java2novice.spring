package com.java2novice.beans;

/**
 * This example shows how to inject Map type into the spring bean.
 * @see http://java2novice.com/spring/inject-map-into-spring-bean/
 * @author java2novice
 * @date 2015年12月3日下午2:34:07
 */

import java.util.Map;

public class FilmDirectors {

	private Map<Integer, String> directorMap;

	public Map<Integer, String> getDirectorMapt() {
		return directorMap;
	}

	public void setDirectorMap(Map<Integer, String> directorMap) {
		this.directorMap = directorMap;
	}

	public void pringDirectors() {
		System.out.println(this.directorMap);
	}
}