package com.liwen;

import org.junit.Test;
import org.junit.runner.RunWith;
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

}
