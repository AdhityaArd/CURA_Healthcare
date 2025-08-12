package com.Tohsaka.Cucumber.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
        "src/test/resources/features/Authentication.feature",
        "src/test/resources/features/Booking.feature",
}, glue = {
        "com.Tohsaka.Cucumber.definitions.authentications",
        "com.Tohsaka.Cucumber.definitions.booking",
}, plugin = {
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})
public class RunnerCuraHealthcareTest extends AbstractTestNGCucumberTests{
}
