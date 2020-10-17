package com.mkyong;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartWebApplication {


	public static void main(String[] args) {
		SpringApplication.run(StartWebApplication.class, args);
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

//		StatusPrinter.print(lc);
	}

}