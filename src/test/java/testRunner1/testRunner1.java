package testRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\features\\LoginScenarioTestCase.feature",
glue="StepDefination1",
plugin={"pretty","html:target/cucumber-reports.html"},
monochrome=true)

public class testRunner1 {
	
	
	
	
	
	

}
