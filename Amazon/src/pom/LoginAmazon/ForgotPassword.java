package pom.LoginAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

	WebDriver driver;

	public ForgotPassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ap_email'][@name='email']")
	WebElement emailOrPhoneNumberTxtBox;
	@FindBy(how = How.XPATH, using = "//input[@id='continue'][@type='submit']")
	WebElement continueBtn;
	String pageTitle_forgotpassPage = "Amazon Password Assistance";

	public void enterEmail_or_Phone() {
		emailOrPhoneNumberTxtBox.sendKeys("");
		continueBtn.click();
	}

}
