package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java2novice.bean.MyColor;
import com.java2novice.bean.RedColor;

/**
 * Now here comes the java based configuration file. This class is equivalent(相等的，相当的，等效的; 等价的) of xml based
 * configuration file. You must annotate the class with @Configuration. The bean declaration can be achieved by
 * using @Bean annotation. - See more
 */
@Configuration
public class MyAppConfig {

	@Bean(name = "myColorBean")
	public MyColor getMyColors() {
		return new RedColor();
	}
}
