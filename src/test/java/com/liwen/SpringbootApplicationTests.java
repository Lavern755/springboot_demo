package com.liwen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import com.liwen.yml.Person;
//@ImportResource(locations = {"classpath:beans.xml"}) // 引入配置文件，这种方式不推荐使用
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Person person; // 注入person

	@Autowired
	private
	ApplicationContext aoc;
	
	@Test
	public void testHelloService() {
		boolean containsBean = aoc.containsBean("helloService");
		System.out.println(containsBean);
	}
	
	@Test
	public void contextLoads() {
		System.out.println(person);
	}
	
	@Test
	public void testLog() {
		// 日期级别从低到高,springboot默认开启info级别的日志
		logger.trace("这是trace级别的日志");
		logger.debug("这是debug级别的日志");
		logger.info("这是info级别的日志");
		logger.warn("这是warn级别的日志");
		logger.error("这是error级别的日志");
	}

}
