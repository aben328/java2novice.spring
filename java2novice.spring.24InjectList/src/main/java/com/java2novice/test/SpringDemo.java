package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java2novice.beans.FilmDirectors;

public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		FilmDirectors filmDir = (FilmDirectors) context.getBean("filmDirectors");
		filmDir.pringDirectors();
	}
}