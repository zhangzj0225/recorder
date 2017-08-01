package com.demo.recorder;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features/aa.feature"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
)
public class RunCukesTest {
}