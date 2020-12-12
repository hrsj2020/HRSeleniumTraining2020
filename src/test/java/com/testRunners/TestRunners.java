package com.testRunners;

import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestRunners {
	//@RunWith(Cucumber.class)
	//features and glue is impotent
	@CucumberOptions(
			features = "src/test/resources/Feature/Orangelogin.feature",
					plugin = {"pretty",
							"html:Reports/cucumber-html-report", 
							"json:Reports/cucumber-html-report/jsonreport.json",
							"rerun:target/cucumber-reports/rerun.txt",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							//"testng:target/testng-cucumber-reports/cuketestng.xml",
							},
			glue= {"com.stepdefinitions"}
			
			
			//strict= true
						
			)
	public class TestRunner extends AbstractTestNGCucumberTests {
		//create the report-extent-config.xml
		 public void Extentsreport(){
		  Reporter.loadXMLConfig("/src/test/resources/Screenshots/Extent-config.xml");
		  Reporter.setSystemInfo("user", System.getProperty("user.name"));
		  Reporter.setSystemInfo("os", "Windows");
		  Reporter.setTestRunnerOutput("Project Natural Report");
		  }
	}
}
