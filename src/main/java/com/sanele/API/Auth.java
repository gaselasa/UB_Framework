package com.sanele.API;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.Data;
import org.apache.http.client.methods.RequestBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.*;


@Component
@Data
public class Auth {


    @Autowired
    XrayPropertiesModel xrayPropertiesModel;

    @Autowired
    RequestSpecification requestSpec;
    ;
    @Autowired
    ResponseSpecification responseSpec;


    public void s() {

        given().when().spec(requestSpec)
                .get("https://dog.ceo/api/breeds/list/all")
                .then().spec(responseSpec)
                .log()
                .all();



    }


}





