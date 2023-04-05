package selneiumTests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "", features="Features",glue={"StepDefinition"},
                 plugin = {},	
                 publish=true)
    
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    
}
