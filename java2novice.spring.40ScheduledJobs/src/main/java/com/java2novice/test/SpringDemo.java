package com.java2novice.test;

import org.apache.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.jobs.InventoryPullerJob;

/**
 * Finally, add your logs with in the class level. You are done with your log settings. The application is ready for
 * logging.
 * @author java2novice
 * @date 2015年12月3日下午5:55:32
 */
public class SpringDemo {

	static final Logger logger = Logger.getLogger(SpringDemo.class);

	public static void main(String a[]) {
		logger.info("getting application context file...");
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		@SuppressWarnings("unused")
		InventoryPullerJob jobs = (InventoryPullerJob) context.getBean("myAppScheduleJobs");
		logger.info("getting bean reference...");
		logger.info("done...");
	}
}
