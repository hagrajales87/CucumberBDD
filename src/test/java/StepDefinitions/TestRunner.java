package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/googleSearch.feature", glue={"StepDefinitions"}, monochrome = true,
                 plugin = {"pretty", "html:target/HtmlReports/report.html", "json:target/JSONReports/report.json","junit:target/JUnitReports/report.xml"}
                //plugin = {"pretty", "json:target/JSONReports/report.json"}
                //plugin = {"pretty", "junit:target/JUnitReports/report.xml"}
                )
public class TestRunner {

}
