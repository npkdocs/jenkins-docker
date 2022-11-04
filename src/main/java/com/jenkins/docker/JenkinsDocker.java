package com.jenkins.docker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class JenkinsDocker {
    static Logger logger = LoggerFactory.getLogger(JenkinsDocker.class);

    @PostConstruct
    public void init() {
        logger.info("--------- Object Initiated -----------------");
    }

    public static void main(String[] args) {
        logger.info("--------- Appliation Execution Begins -----------------");
        SpringApplication.run(JenkinsDocker.class, args);
    }
}
