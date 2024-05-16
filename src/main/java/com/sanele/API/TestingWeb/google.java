package com.sanele.API.TestingWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class google {

  @Autowired
    WebDriver driver;


//    public google(WebDriver driver){
//        //PageFactory.initElements(driver, this);
//
//     //   this.driver = driver;
//    }
//    @Autowired
//     HashMap map;



    //By name = y.testsome();

       // By.xpath("//textarea[@id='APjFqb']");



    public  void search(){
        driver.get("https://www.google.com");





    }

   public void searchf(){

        try{
         //   driver.findElement((By) map.get("")).sendKeys("springboot");

        } catch (RuntimeException t){
            System.out.println(t.getMessage());
        }
     //  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).;
    }


}
