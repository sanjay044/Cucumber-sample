package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.page.SearchHotelPage;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\LoginPage\\LoginPage.feature",
glue="org.step",
monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE,
plugin= {
		"html:target\\htmlReports",
		"junit:target\\xmlReport.xml",
		"json:target\\jsonReport.json"
})

public class TestRunnerClass {
@AfterClass
public static void report() {
	ReportingClass.generateReport("target\\jsonReport.json");
}

}
