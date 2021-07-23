package com.runner2a;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dell\\eclipse-workspace\\CucumberSample\\src\\test\\resources\\Features\\Adactin2a.feature",glue= {"org.com.stepdefinition2a"},dryRun=false,monochrome=true)
public class TestRunnerClass {

}
