package com.java2novice.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java2novice.services.EmailService;

public class SpringDemo {

	public static void main(String a[]) {

		InputStream is = null;
		String toAddr = "aben328@163.com";
		String fromAddr = "aben328@163.com";
		String subject = "My Test Mail";
		String body = "Test mail body";
		StringBuilder sb = new StringBuilder();
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		EmailService emailService = (EmailService) context.getBean("emailService");
		try {
			//在Java开发工具的project中使用相对路径,路径不以“/”开头；
			//@see http://lavasoft.blog.51cto.com/62575/265821/
			is = new FileInputStream(new File("src/main/resources/test.txt"));
			byte[] tmp = new byte[4 * 1024];
			int size = 0;
			while ((size = is.read(tmp)) != -1) {
				sb.append(new String(tmp, 0, size));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		emailService.sendEmail(toAddr, fromAddr, subject, body, sb.toString().getBytes());
	}
}
