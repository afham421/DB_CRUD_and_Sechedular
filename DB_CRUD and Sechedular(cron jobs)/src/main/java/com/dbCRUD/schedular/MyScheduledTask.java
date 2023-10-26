package com.dbCRUD.schedular;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//@EnableAsync  //is sy aik terteeb sy thread run hon gy
public class MyScheduledTask {
         Logger logger = LoggerFactory.getLogger(MyScheduledTask.class);


////    @Async  //is sy aik terteeb sy thread run hon gy
//    @Scheduled(fixedRate = 1000) // Run every seconds
//    public  void myTask() {
//        // Your task logic here
////        System.out.println("Scheduled task executed!");
//         logger.info("Scheduled task executed!");
//    }



     final TaskScheduler customScheduler1;
     final TaskScheduler customScheduler2;

    public MyScheduledTask(@Qualifier("customScheduler1") TaskScheduler customScheduler1,
                           @Qualifier("customScheduler2") TaskScheduler customScheduler2) {
        this.customScheduler1 = customScheduler1;
        this.customScheduler2 = customScheduler2;
    }


//    @Async
    @Scheduled(fixedRate = 1000)
    public void task1() {
        // Task logic for customScheduler1
                 logger.info("Scheduled task 1 executed!");

    }

//    @Async
    @Scheduled(fixedRate = 1000)
    public void task2() {
        // Task logic for customScheduler2
                 logger.info("Scheduled task 2 executed!");

    }

}

