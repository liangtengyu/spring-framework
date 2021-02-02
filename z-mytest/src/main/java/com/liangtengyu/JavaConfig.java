package com.liangtengyu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: lty
 * @Date: 2021/2/2 12:51
 */
@Configuration
@ComponentScan
public class JavaConfig {
	@Bean
	public User user(){
		return new User(1, "梁");
	}
}
