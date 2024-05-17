package com.restAssured.TestingApi.Steps;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;



@CucumberOptions(
        features = "src/test/resources",
        glue ="com.restAssured.TestingApi.Steps",
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }


)

public class CucumberSpringContextConfig extends AbstractTestNGCucumberTests {

}
