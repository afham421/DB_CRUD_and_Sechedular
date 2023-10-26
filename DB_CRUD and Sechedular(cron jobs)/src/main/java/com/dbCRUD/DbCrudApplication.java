package com.dbCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@SpringBootApplication
@EnableScheduling
public class DbCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbCrudApplication.class, args);
	}

//	@Bean   // is sary ki bjay hm properties main yeh bhi use ker sakty hain #spring.task.scheduling.pool.size=5
//	public TaskScheduler taskScheduler() {
//		ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
//		threadPoolTaskScheduler.setPoolSize(5);
//		threadPoolTaskScheduler.setThreadNamePrefix("ThreadPoolTaskScheduler");
//		return threadPoolTaskScheduler;
//	}

}
