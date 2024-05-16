package com.restAssured.TestingApi.Steps;


import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(classes = CucumberSpringContextConfig.class)
@CucumberOptions(
        features = "src/test/java/com.restAssured.TestingApi/Cucumber/Features",
        glue ="com.restAssured.TestingApi.Steps"


)
public class CucumberSpringContextConfig {

}
