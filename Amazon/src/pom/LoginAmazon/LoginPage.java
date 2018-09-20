package pom.LoginAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

/**
 * @author raverma
 * 
 *         This class contains all the elements and related methods to test
 *         login page functionality.
 *
 */

public class LoginPage {
	WebDriver driver;
	String pageTitle_forgotpassPage = "Amazon Password Assistance";
	/**
	 * all webElement available on LoginPage
	 */
	@FindBy(how = How.XPATH, using = "//input[@id='ap_email'][@name='email']")
	WebElement emailOrPhoneNumberTxtBox;
	@FindBy(how=How.XPATH,using="//input[@id='ap_password'][@name='password']")
	WebElement passwordtxtBox;
	@FindBy(how = How.XPATH, using = "//a[@id='auth-fpp-link-bottom'][contains(text(),'Forgot Password')]")
	WebElement forgotpasswordLink;
	@FindBy(how = How.XPATH, using = "//input[@id='signInSubmit']")
	WebElement loginBtn;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox'][@value='true']")
	WebElement keepMeSignInCheckBox;
	@FindBy(how = How.XPATH, using = "//a[@id='createAccountSubmit'][contains(text(),'Create your Amazon account')]")
	WebElement createNewAccountBtn;
	@FindBy(how = How.XPATH, using = "//a[@class='a-link-normal'][contains(text(),'Conditions of Use')]")
	WebElement conditionOfUseLink;
	@FindBy(how = How.XPATH, using = "//a[@class='a-link-normal'][contains(text(),'Privacy Notice')]")
	WebElement privacyNoticeLink;
	@FindBy(how = How.XPATH, using = "//a[@class='a-link-normal'][contains(text(),'Help')]")
	WebElement helpLink;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'© 1996-2018, Amazon.com, Inc. or its affiliates')]")
	WebElement amazon_com_Inc_or_itsAffiliates;
	@FindBy(how = How.XPATH, using = "//div[@class='a-alert-content'][contains(text(),'Enter your email or mobile phone number')]")
	WebElement alert_EnterEmailorPhone;
	@FindBy(how = How.XPATH, using = "//div[@class='a-alert-content'][contains(text(),'Enter your password')]")
	WebElement alert_EnterPassword;
	@FindBy(how = How.XPATH, using = "//div[@class='a-alert-content']//span[contains(text(),'Your password is incorrect')]")
	WebElement alert_passwordNotCorrect;
	@FindBy(how = How.XPATH, using = "//div[@class='a-alert-content']//span[contains(text(),'We cannot find an account with that email address')]")
	WebElement alert_couldnotFindAcountWithEmail;

	/**
	 * LoginPage Constructor
	 * 
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public void loginWith_BlankUID_BlankPass() {
		clearFields();
		loginBtn.click();
		alert_EnterEmailorPhone.isDisplayed();
		alert_EnterPassword.isDisplayed();
	}
	
	public void  loginWith_BlankPass() {
		clearFields();
		emailOrPhoneNumberTxtBox.sendKeys("abc@gmail.com");
		loginBtn.click();
		alert_EnterPassword.isDisplayed();
	}
	
	public void loginWith_InvalidEmail_BlankPass() {
		clearFields();
		emailOrPhoneNumberTxtBox.sendKeys("abc@.com");
		loginBtn.click();
		alert_EnterPassword.isDisplayed();
	}
	public void loginWith_validEmail_WrongPass() {
		clearFields();
		//String title = driver.getTitle();
		emailOrPhoneNumberTxtBox.sendKeys("er.rajesh6145@gmail.com");
		passwordtxtBox.sendKeys("sdfsdsdf");
		try {
			alert_passwordNotCorrect.isDisplayed();
		} catch (Exception e) {
			//driver.getTitle().equals(title);
			System.out.println("alert_passwordNotCorrect not found");
		}
		
	}
	
	public void loginWith_UnRegisteredEmail_password() {
		clearFields();
		//String title= driver.getTitle();
		emailOrPhoneNumberTxtBox.sendKeys("asdsad.gmail.com");
		passwordtxtBox.sendKeys("fsdfdsdf");
		try {
			alert_couldnotFindAcountWithEmail.isDisplayed();	
		} catch (Exception e) {
			//driver.getTitle().equals(title);
			System.out.println("alert_couldnotFindAcountWithEmail not found");
		}
		
	}
	
	
	public void loginWith_SuccessfullLogin(){
		clearFields();
		emailOrPhoneNumberTxtBox.sendKeys("er.rajesh6145@gmail.com");
		passwordtxtBox.sendKeys("Shree@6145rama");
		loginBtn.click();
		PageFactory.initElements(driver, pom.product.Product.class);
	}
	
	public void checkForgotPasswordLink() {
		forgotpasswordLink.click();
		driver.getTitle().contains(pageTitle_forgotpassPage);
	}
	
	/**
	 * common method to clear all text fields
	 */
	public void clearFields() {
		emailOrPhoneNumberTxtBox.clear();
		passwordtxtBox.clear();
	}
	
	
	
	
	

}
