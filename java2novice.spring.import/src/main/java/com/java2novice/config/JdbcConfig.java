package com.java2novice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java2novice.bean.MyJdbcService;

/**
 * See more at: http://java2novice.com/spring/java-based-config-import/#sthash.KIi0yRzF.dpuf
 */
@Configuration
public class JdbcConfig {

	@Bean(name = "jdbcService")
	public MyJdbcService getJdbcService() {
		return new MyJdbcService();
	}
}
