package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NewDepositPage {
WebDriver driver;
public NewDepositPage(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how=How.XPATH,using="//*[@id=\"select2-account-container\"]")
WebElement ACCOUNT_DROPDOWN_FIELD;
@FindBy(how=How.XPATH,using="//*[@id=\"description\"]")
WebElement DESCRIPTION_FIELD;
@FindBy(how=How.XPATH,using="//*[@id=\"amount\"]")
WebElement AMOUNT_FIELD;
@FindBy(how=How.XPATH,using="//*[@id=\"submit\"]")
WebElement SUBMIT_FIELD;
public void selectfromdropdown() {
	Select sel=new Select(ACCOUNT_DROPDOWN_FIELD);
	sel.selectByVisibleText("Mean680");
}
public void insertdescription(String description) {
	DESCRIPTION_FIELD.sendKeys(description);
	
}

public void insertamount(String amount) {
	AMOUNT_FIELD.sendKeys(amount);	
}

public void clicksubmitdepositbutton() {
	SUBMIT_FIELD.click();	
}


}
