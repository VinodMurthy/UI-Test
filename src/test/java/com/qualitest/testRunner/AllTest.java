package com.qualitest.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue = {"com.qualitest.StepDef","com.qualitest.Hooks"},
        features = "src/test/resources/Feature"
		)
public class AllTest {

}
