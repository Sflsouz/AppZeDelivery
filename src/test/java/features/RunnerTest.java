package features;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "" }, features = { "src\\test\\java\\features" }, tags = { "@Test" }, plugin = { "pretty",
		"html:target/" }, monochrome = true, stepNotifications = true)

public class RunnerTest {

}
