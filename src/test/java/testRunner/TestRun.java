package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/Features/Login.feature",
        glue = "stepDefenitions",
        dryRun = false,
        plugin = {"pretty", "html:test-outputs.html"}
)


public class TestRun {
}
