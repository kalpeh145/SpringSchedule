package com.schedules.spring_schedule.modular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ScheduledTaskService {

    private final DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

    @Scheduled(fixedDelay = 5000)
    public void execute () throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("code is being executed..." +formatter.format(LocalDateTime.now()));


    }

}
