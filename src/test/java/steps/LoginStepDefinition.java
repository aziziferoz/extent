package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	 WebDriver driver;
	
	 @Given("^User is on the Techfios login page$")
	 public void user_is_on_Techfios_login_page(){
	 System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://drivrzfinancial.com/");
	 }
	
	@When("^User enters username as \"demo@techfios.com\"$")
	public void user_enters_username() {
		
	}
	
	@When("^User enters password as \"abc123\"$")
	public void user_enters_Password() {
		
	}
	
	@And("^User clicks on signin button$")
	public void user_click_on_signin_button() {
		
	}
	
	@After
	public void quite() {
		driver.quit();
	}
}