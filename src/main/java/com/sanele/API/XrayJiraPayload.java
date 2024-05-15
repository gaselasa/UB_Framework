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


    String cucumberJsonResult;

    @Autowired
    XrayPropertiesModel xrayPropertiesModel;



    public void readJsonFile() throws Exception {

        this.cucumberJsonResult = readFileAsString(xrayPropertiesModel.getJsonfile());
    }

    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }


}




