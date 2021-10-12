package com.vkstech.actuator.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    @Scheduled(fixedRate = 10000)
    public void runScheduler() {
        System.out.println("Scheduler is running...");
    }
}
