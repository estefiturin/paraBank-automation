package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                glue = "src/test/java/steps",
                plugin = { "pretty", "html:target/cucumber-reports"},
                tags = "@GestionarCuenta")
public class TestRunner {



}
