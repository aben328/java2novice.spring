package com.java2novice.beans;

import java.util.List;

/**
 * his example shows how to inject List type into the spring bean.
 * @see http://java2novice.com/spring/inject-list-into-spring-bean/
 * @author java2novice
 * @date 2015年12月3日下午2:34:07
 */
public class FilmDirectors {

	private List<String> directorList;

	public List<String> getDirectorList() {
		return directorList;
	}

	public void setDirectorList(List<String> directorList) {
		this.directorList = directorList;
	}

	public void pringDirectors() {
		System.out.println(this.directorList);
	}
}