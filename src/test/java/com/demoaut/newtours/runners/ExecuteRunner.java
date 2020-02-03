package com.demoaut.newtours.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features/Default.feature", 
glue = "com.demoaut.newtours.step_definitions", 
snippets = SnippetType.CAMELCASE, 
tags = "@TestCaseRegister")

public class ExecuteRunner {

}