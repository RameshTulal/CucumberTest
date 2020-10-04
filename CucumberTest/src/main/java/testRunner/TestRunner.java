package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:/Ramesh/Selenium/SeleniumWorkSpace/CucumberTest/src/main/java/Features/login.feature",
		glue = {"stepDefinations"},
		plugin = {"pretty","html:target/cucumber-html-report"}
		 )
	public class TestRunner{
}
