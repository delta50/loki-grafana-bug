package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) throws InterruptedException{
		SpringApplication.run(DemoApplication.class, args);
		while(true){
            LOG.warn("Example log message.");
            LOG.error("Another log message.");
            Thread.sleep(1000);
        }
    }
}
