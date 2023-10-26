package com.dbCRUD.schedular;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class CustomSchedulerConfig {

    @Primary
    @Bean
    public ThreadPoolTaskScheduler customScheduler1() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(5); // Set the pool size as needed
        scheduler.setThreadNamePrefix("CustomScheduler1-");
        return scheduler;
    }

    @Bean
    public ThreadPoolTaskScheduler customScheduler2() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(3); // Set the pool size as needed
        scheduler.setThreadNamePrefix("CustomScheduler2-");
        return scheduler;
    }

}
