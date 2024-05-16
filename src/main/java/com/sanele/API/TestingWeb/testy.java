package com.sanele.API.TestingWeb;


import lombok.Data;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@ConfigurationProperties(prefix = "page")
@Configuration
@Data
public class testy {



   private String name;

  @Autowired
   WebDriver driver;


   @Bean
   public Map<String,By> webElementMap(){
      HashMap<String,By> specificObjectMap = new HashMap<>();
      specificObjectMap.put(this.name,By.xpath(name));


      return specificObjectMap;




   }



//   public By testsome(){
//      //driver.get("https://www.google.com");
//
//      // return (WebElement)By.xpath("//textarea[@id='APjFqb']");
//   }

}
