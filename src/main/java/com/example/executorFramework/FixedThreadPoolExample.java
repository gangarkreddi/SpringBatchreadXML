package com.example.executorFramework;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int count =0;count <=10 ;count++)
        executorService.execute(new Task(count));
    }
}
class Task implements Runnable{
    int count = 0;
    Task(int count){
        this.count = count ;
    }
    @Override
    public void run() {
        System.out.println("In side task   "+count );
    }
}