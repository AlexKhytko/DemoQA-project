package com.example.bookstore;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "com.example.bookstore.steps"
    )
    public class RunCucumberTest extends AbstractTestNGCucumberTests {
    }

