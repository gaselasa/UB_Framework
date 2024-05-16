package com.sanele.API;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XrayJiraPage {




    @Autowired
    APIUtils apiUtils;


    public boolean authenticateClient(){
    ;
        apiUtils.process_Post_Xray_Token();
       return true;
    }

    public void TestMethod(){
        apiUtils.TestMethod();

    }

    public void getXrayToken(){
        apiUtils.process_Post_Xray_Token();
        System.out.println("dfsdfsd\n" +apiUtils.xraytoken );

    }
    public void  authenticateClientBasic(){


    }

    public void authenticateClientDigest(){



    }


    public void sendXrayCucumberResult(){

    }

    public JSONObject getJiraIssueResult(){

      return  null;

    }


}
