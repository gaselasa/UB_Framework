package com.sanele.API;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

@Component
@Data
public class XrayJiraPayload {




    @Autowired
    XrayPropertiesModel xrayPropertiesModel;


    public JSONObject getXrayPayload(){

        return new JSONObject("{\n" +
                "    \"client_id\": \"9691D6A1A2E54B4DA6407DF003CA9450\",\n" +
                "    \"client_secret\": \"53aba90ed8066e63edbbb6772768eb9def258b3ae12d19e23d111d237f0d0cc2\"\n" +
                "}");





    }


    public String readJsonFile() throws Exception {

          return readFileAsString(xrayPropertiesModel.getJsonfile());

    }

    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }


}




