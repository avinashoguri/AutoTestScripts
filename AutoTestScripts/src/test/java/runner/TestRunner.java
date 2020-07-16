package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(

		features="src/test/java/features/FC_Test.feature",
		glue="stepDefenations",
		tags = {"~@Ignore"},
		format= {
				"pretty",
				"html:test-htmloutput",
				"json:json_jsonoutput/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
				},
		monochrome = true,
		dryRun = false)
		


public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	}
