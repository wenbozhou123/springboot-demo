package com.bowen.springboot.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @AUTHOR zhoubo
 * @CREATE: 2019-07-17 3:32 PM
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.bowen.springboot")
public class Entry {

    public static void main(String[] args){
        SpringApplication.run(Entry.class, args);
    }


}
