package pom.LoginAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @author raverma
 * 
 *         Home page which is the very first page of Amazon.in.
 * 
 *         This class contains all the elements and related methods to test home
 *         page functionality.
 */
public class HomePage {

	WebDriver driver;
	/**
	 * all the web element available on the HomePage
	 */
	@FindBy(how = How.XPATH, using = "https://www.amazon.in/")
	WebElement url;
	@FindBy(how = How.XPATH, using = "//a[@id='nav-link-yourAccount']")
	WebElement helloSignIn;
	@FindBy(how = How.XPATH, using = "//div[@id='nav-flyout-yourAccount']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
	WebElement signIn;
	@FindBy(how = How.XPATH, using = "//div[@id='nav-flyout-yourAccount']//span[@class='nav-text'][contains(text(),'Sign Out')]")
	WebElement signOut;
	@FindBy(how = How.XPATH, using = "//a[@id='nav-link-yourAccount']/span[1][@class='nav-line-1']")
	WebElement hellousername;

	/**
	 * actions class object
	 */
	Actions action;

	/**
	 * Constructor of HomePage class
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	/**
	 * method to move signIn page by clicking over "helloSignIn" element
	 */
	public void moveToSignInPage() {

		helloSignIn.click();
		PageFactory.initElements(driver, LoginPage.class);
	}

	/**
	 * method to mouseOver on "helloSignIn" element
	 */
	public void moveToUsername() {

		action.moveToElement(hellousername).build().perform();
	}

	public void signOutAmazon() {
		if (hellousername.getText().contains("Hello,")) {
			action.moveToElement(hellousername).build().perform();
			signOut.click();
		}

	}

}
