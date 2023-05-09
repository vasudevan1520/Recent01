package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags= {"@Login"},snippets = SnippetType.CAMELCASE, dryRun = false, plugin = { "pretty",
		"json:target/Hello.json" }, monochrome = true, features =" src\\test\\resources", glue="com.stepdefinition")

public class TestRunner {
//	@AfterClass
//	public static void afterClass() {
//		Reporting.generateJVMReport(
//				"C:\\Users\\user\\eclipse-workspace\\vasu\\OMRBranchAdactinAutomation\\target\\Hello.json");
//
//	}
	
	
	

}
