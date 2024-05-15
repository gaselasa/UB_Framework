package com.sanele.API;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestingApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestingApiApplication.class, args);
	}





	@Bean
		ApplicationRunner r(XrayJiraPayload page){

			  return at ->{
				  System.out.println("hhjfj");
			//	  page.jsonPayload();



			  };



		}



}
