package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by abhayda on 24/08/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
                 tags = "@TableDriven",
                 format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class RunCukesTest {
}