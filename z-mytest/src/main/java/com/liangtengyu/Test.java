package com.liangtengyu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: lty
 * @Date: 2021/2/2 12:52
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User) c.getBean("user");
		System.out.println(user);
	}
}
