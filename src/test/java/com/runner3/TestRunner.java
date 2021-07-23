package com.runner3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dell\\eclipse-workspace\\CucumberSample\\src\\test\\resources\\Features\\Adactin3.feature",glue= {"org.com.stepdefinition2"},dryRun=true)
public class TestRunner {

}
