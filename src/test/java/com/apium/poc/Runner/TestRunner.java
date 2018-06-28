package com.apium.poc.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/com/apium/poc/Feature/MyApplicationFeature.feature"},
		glue={"com/apium/poc/StepDefinition"},
		plugin={"html:target/cucumber-html-report"},
		dryRun = false,
		monochrome=false)

public class TestRunner {

}
