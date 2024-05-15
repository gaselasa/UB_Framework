package com.sanele.API;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import lombok.Data;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.*;


@Component
@Data
public class APIUtils {


    @Autowired
    XrayPropertiesModel xrayPropertiesModel;

    @Autowired
    RequestSpecification requestSpec;

    @Autowired
    ResponseSpecification responseSpec;

    @Autowired
    XrayJiraPayload xrayJiraPayload;

   private String apiToken;


    public void s() {

        given().when().spec(requestSpec)
                .get("https://dog.ceo/api/breeds/list/all")
                .then().spec(responseSpec)
                .log()
                .all();



    }

    // post the cucumber Json after the Test are completed
    // precondition : client authenticated
    // Xray end-point defined properties files

    void  process_Post_Jira_Result(){


    }

    // Client_id and client_secret from properties files
    // Expected ApiToken Generated
    // End Point from properties

    void  process_Post_Xray_Token()
    {



    }




    // jira issue passed as the key
    // Jira end-point from properties files

    JSONObject process_Get_Jira_Issue(String key){


        return  null;

    }


}





