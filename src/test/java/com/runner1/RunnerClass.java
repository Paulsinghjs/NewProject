package com.runner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dell\\eclipse-workspace\\CucumberSample\\src\\test\\resources\\Features\\Adactin1.feature",glue= {"org.com.stepdefinition"},dryRun=true)
public class RunnerClass {

}
