package com.liwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


//@EnableScheduling //开启定时任务
@SpringBootApplication  // 表明是一个springboot应用程序
public class SpringbootApplication {
	
	/**
	 * --spring.profiles.active=dev
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
