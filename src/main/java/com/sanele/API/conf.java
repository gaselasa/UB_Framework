package com.sanele.API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class conf {

    @Bean
    public ResponseSpecification requestBuilder(){

        return  new ResponseSpecBuilder().expectStatusCode(200).build();

    }
   @Bean
    public RequestSpecification requestSpec(){
        return  new RequestSpecBuilder().build();
    }



}
