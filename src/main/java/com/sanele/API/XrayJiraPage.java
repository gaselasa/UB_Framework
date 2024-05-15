package com.sanele.API;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XrayJiraPage {




    @Autowired
    APIUtils apiUtils;


    public boolean authenticateClient(){


       return true;
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
