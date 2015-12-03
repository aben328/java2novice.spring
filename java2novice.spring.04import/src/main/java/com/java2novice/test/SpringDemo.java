package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java2novice.bean.MyBusinessService;
import com.java2novice.bean.MyJdbcService;
import com.java2novice.config.MyAppConfig;

// See more at:http:// java2novice.com/spring/java-based-config-import/#sthash.KIi0yRzF.dpuf

public class SpringDemo {

	public static void main(String a[]) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
		MyJdbcService jdbc = (MyJdbcService) context.getBean("jdbcService");
		jdbc.createJdbcConnection();
		MyBusinessService busServ = (MyBusinessService) context.getBean("bussService");
		busServ.runMyBusiness();
	}
}
