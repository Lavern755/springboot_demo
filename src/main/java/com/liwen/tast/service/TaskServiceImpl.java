package com.liwen.tast.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 
 * @author lw
 *使用注解方式,实现定时任务
 */
@Component
public class TaskServiceImpl implements TaskService {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	
	@Scheduled(initialDelay=1000,fixedDelay=2000)
	public void firstTask() {
		System.out.println("第一个定时任务执行了" + sdf.format(new Date()));
	}
	
	@Scheduled(cron="*/5 * * * * ?")
	public void secondTask() {
		System.err.println("第二个定时任务执行了" + sdf.format(new Date()));
	}

}
