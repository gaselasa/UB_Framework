package com.sanele.API;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "xray")
@Data
@Component

public class XrayPropertiesModel {
   String username;

   @Value("${xray.password:kdkkd}")
  private String password;
    String baseuri;
    String token;

}
