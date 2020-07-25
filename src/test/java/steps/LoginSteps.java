package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashBoardpage;
import page.Loginpage;
import page.basepage;
import util.Assertion;
import util.browser;

public class LoginSteps extends basepage {
	WebDriver driver;
	Loginpage login;
	DashBoardpage dashboardPage;
	
	
	
	@Before
	public void beforeRun() {
	    driver=browser.startBrowser();
	    login=PageFactory.initElements(driver,Loginpage.class);
	    dashboardPage=PageFactory.initElements(driver, DashBoardpage.class);
	}
	
	
	@Given("^I am on techfios site$")
	public void i_am_on_techfios_site() {

	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
	   login.enterusername("demo@techfios.com");
	   login.enterpassword("abc123");
	   
	}
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String username, String password) throws Throwable {
		login.enterusername(username);
		login.enterpassword(password);
		screenShot(driver,"/Users/maranchandrasekaran/Documents/MyProjects/Workspace/Java_development/ScreenShotFile/test.jpg");
	}
	

	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
		
	    login.signin();
	}

	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() throws Throwable {
		String expected = "Dashboard- iBilling";	
		Assertion.equals("Wrong Page displayed", dashboardPage.getPageTitle(), expected);
	}
	
	@After
	public void afterRun() {
		browser.teardown();
	}
	
	
	
}

