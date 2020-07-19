package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import page.Loginpage;
import util.browser;

public class LoginSteps {
	WebDriver driver;
	Loginpage login;
	
	
	@Given("^I am on techfios site$")
	public void i_am_on_techfios_site() throws Throwable {
	    driver=browser.startBrowser();
	     login=PageFactory.initElements(driver,Loginpage.class);
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		login=PageFactory.initElements(driver,Loginpage.class);
	   login.enterusername("demo@techfios.com");
	   login.enterpassword("abc123");
	   
	}

	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
		
	    login.signin();
	    
	    throw new PendingException();
	}


	
	
	
}

