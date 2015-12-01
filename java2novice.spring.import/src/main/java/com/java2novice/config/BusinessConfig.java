package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java2novice.bean.MyBusinessService;

// See more at:http:// java2novice.com/spring/java-based-config-import/#sthash.KIi0yRzF.dpuf
@Configuration
public class BusinessConfig {

	@Bean(name = "bussService")
	public MyBusinessService getBusinessService() {
		return new MyBusinessService();
	}
}
