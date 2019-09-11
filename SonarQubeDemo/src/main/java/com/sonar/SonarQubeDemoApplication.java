package com.sonar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author VISHAL Main class using String utility class
 */
@SpringBootApplication
public class SonarQubeDemoApplication {

	/**
	 * Logger to log messages
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(SonarQubeDemoApplication.class);

	/**
	 * Entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SonarQubeDemoApplication.class, args);
	}

}
