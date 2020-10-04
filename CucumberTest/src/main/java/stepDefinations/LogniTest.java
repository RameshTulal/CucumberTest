package stepDefinations;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LogniTest {
	WebDriver driver = null;	
	
@Given("^user is on login page$")
public void user_is_on_login_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html");  
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
}

@When("^SUT title is Free CRM$")
public void sut_title_is_Free_CRM() {  
	String ExpectdStr = "Selenium Easy - Charts Mouse Hover";
	Assert.assertEquals(ExpectdStr, driver.getTitle());   
}

@Then("^user enters username and password$")
public void user_enters_username_and_password() {
    WebElement linkLogin = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]"));
    linkLogin.click();
    driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]")).click();
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button()  {
	Assert.assertEquals("str", "str");        
}

@Then("^verify home page displayed$")
public void verify_home_page_displayed() {
	Assert.assertEquals("str123", "str");     
}

@Then("^close SUT$")
public void close_SUT() {
    // Write code here that turns the phrase above into concrete actions
   driver.close();
}



}
