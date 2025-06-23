package com.psa.backend;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.psa.backend.dao.ProductVersionDAO;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.psa.backend",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class RunCucumberTest {
}
