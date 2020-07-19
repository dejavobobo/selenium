package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
WebDriver driver;


public Loginpage(WebDriver driver) {
	this.driver=driver;
}
//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(how = How.NAME, using = "login")
	WebElement SignInButton;

	public void enterusername(String userName) {
		UserName.sendKeys(userName);
	}
	public void enterpassword(String password) {
		Password.sendKeys(password);	
	}
	public void signin() {
		SignInButton.click();}	
	// Methods to interact with the elements
//	public void login(String userName, String password) {
//	UserName.sendKeys(userName);
//	Password.sendKeys(password);
//	SignInButton.click();
//	}
//
//	public String getPageTitle() {
//	return driver.getTitle();
}

	
	
	
	
	
	


