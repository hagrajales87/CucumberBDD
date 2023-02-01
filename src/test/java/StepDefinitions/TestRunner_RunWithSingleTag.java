package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureWithTags",
        glue = {"StepDefinitions"},
        //tags = "(@smoke or @regression) and @important"
        //tags = "@regression and not @smoke"
        tags = "@completeRegression"
)
public class TestRunner_RunWithSingleTag {

}
