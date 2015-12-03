package com.java2novice.jobs;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Here is the example for the fixed delay, the time should be specified in milli seconds.
 * @author java2novice
 * @date 2015年12月3日下午6:02:51
 */
public class InventoryPullerJob {

	@Scheduled(fixedDelay = 5000)
	public void updateEmployeeInventory() {
		System.out.println("Started fixed delay job1");
		/**
		 * add your scheduled job logic here
		 */
	}

	/* Incase if you want to make an initial delay to start the job, you can specify "initialDelay". If you specify this
	 * value, the the very first time job will be started after the given delay. In the below example, the method is
	 * scheduled to run at every hour with initial start delay as 10 minutes. */

	@Scheduled(fixedRate = 6 * 6 * 1000, initialDelay = 1 * 6 * 1000)
	public void updateEmployeeInventory2() {
		System.out.println("Started fixed rate job2");
		/**
		 * add your scheduled job logic here
		 */
	}

	/* Here is the sample code for cron. You can use cron expression in the annotation. */
	@Scheduled(cron = "*/2 * * * * MON-FRI")
	public void updateEmployeeInventory3() {
		System.out.println("Started cron job3");
		/**
		 * add your scheduled job logic here
		 */
	}
}
// - See more at: http://java2novice.com/spring/schedule-job/#sthash.MjwPcpMd.dpuf