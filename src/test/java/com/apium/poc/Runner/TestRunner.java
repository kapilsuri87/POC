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
		//tags= {"@Prod"}, 
		monochrome=false)

public class TestRunner {

}

//ORed			: tags = {"@Smoke, @Regression"} 	To add condition for OR operator 
//Anded			: tags = {"@Smoke", "@Regression"} 	To add condition for AND operator
//Ignore Case	: tags = {"~@Smoke", "@Regression"} To ignore a set of test cases use ~ operator