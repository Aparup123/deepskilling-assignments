package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger logger= LoggerFactory.getLogger(SpringLearnApplication.class);

	private static void displayCountry(){
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		Country country=context.getBean("country", Country.class);
		logger.debug("Country: {}", country);
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);
		logger.info("Application running.");
	}

}
