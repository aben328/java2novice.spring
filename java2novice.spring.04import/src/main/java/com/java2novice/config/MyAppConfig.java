package com.java2novice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ JdbcConfig.class, BusinessConfig.class })
public class MyAppConfig {

}
// See more at: http://java2novice.com/spring/java-based-config-import/#sthash.KIi0yRzF.dpuf