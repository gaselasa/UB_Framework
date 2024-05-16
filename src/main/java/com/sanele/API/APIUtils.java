package com.sanele.API;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
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

   protected  String xraytoken;



    public void TestMethod() {

        given().when().spec(requestSpec)
                .get("https://dog.ceo/api/breeds/list/all")
                .then().spec(responseSpec)
                .log()
                .all();



    }


    // post the cucumber Json after the Test are completed
    // precondition : client authenticated
    // Xray end-point defined properties files

    void  process_Post_xray_Result() throws Exception {

        // https://xray.cloud.getxray.app/api/v2/import/execution/cucumber?KEYS=SCRUM-14
        given().auth().
                oauth2(xrayPropertiesModel.getXraytoken())
                .log().all().header("Content-Type","application/json")
                .body(xrayJiraPayload.readJsonFile())
                .post("https://xray.cloud.getxray.app/api/v2/import/execution/cucumber?KEYS=SCRUM-14")
                .prettyPrint();



    }


    // Client_id and client_secret from properties files
    // Expected ApiToken Generated
    // End Point from properties

   public void  process_Post_Xray_Token()
    {

       xraytoken = given().header("Content-Type", "application/json")
              .body(xrayJiraPayload.getXrayPayload().toString())
               .when()
               .post(xrayPropertiesModel.getBaseXrayUriAuth()).prettyPrint();





    }




    // jira issue passed as the key
    // Jira end-point from properties files

   public  void process_Get_Jira_Issue(String key)
   {



       given().auth()
               .basic(xrayPropertiesModel.username, xrayPropertiesModel.getJiraToken())
               .relaxedHTTPSValidation().log().all()
               .when().
               get("jira end point")
               .then()
               .log().all();


    }


}





