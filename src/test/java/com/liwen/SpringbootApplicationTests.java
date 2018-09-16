package com.liwen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.liwen.yml.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	
	@Autowired
	private Person person; // 注入person

	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
