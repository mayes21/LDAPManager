package com.example.ldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by amabb on 24/03/17.
 */
@EnableAutoConfiguration
@ComponentScan("com.example.ldap")
public class StandAloneApp {

    public static void main(String[] args) {
        SpringApplication.run(StandAloneApp.class, args);
    }

}
