package com.sanele.API;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

@Component

public class XrayJiraPayload {

    public void jsonPayload() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
     TT t= new TT();


        TT object =  mapper.readValue(new File("src/main/resources/test.json"),
                TT.class);
        System.out.println(object.toString());

    }
}
@Data
class t{

    String client_id;
    String    client_secret;


}

@Data
class TT {
private String keyword;
private String name;
private float line;
private String description;
ArrayList<Object> tags = new ArrayList<Object>();
private String id;
private String uri;
ArrayList<Object> elements = new ArrayList<Object>();



}
