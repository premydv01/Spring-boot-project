package com.bootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bootcore.beans.Robot;

@SpringBootApplication
 /*
  * insted of writing these three Annotation SpringBoot provided one annotation @SpringBootApplication 
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.bootcore.beans")

*/
public class BootCoreApplication {
	public static void main(String[] args) {
		int x=20;
		int y=10;
		ApplicationContext context=SpringApplication.run(BootCoreApplication.class, args);
		                         //new AnnotationConfigApplicationContext(BootCoreApplication.class);
		Robot robot=context.getBean(Robot.class);
		System.out.println(robot);
//
	}

}
