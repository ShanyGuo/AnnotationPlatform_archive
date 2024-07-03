package com.example.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationApplication {

	private static final Logger log = LoggerFactory.getLogger(AnnotationApplication.class);

	public static void main(String[] args)
	{
		SpringApplication.run(AnnotationApplication.class, args);
		log.info("项目启动成功");

	}

}
