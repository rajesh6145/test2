package test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.LoginAmazon.HomePage;
import pom.LoginAmazon.LoginPage;
import pom.WebDriver.MyDriver;
import pom.product.Product;

@Listeners(utility.MyListner.class)
public class Test_LoginFunc {
	SoftAssert ssert = new SoftAssert();

	static WebDriver driver;
	HomePage obj_HomePage = new HomePage(driver);;
	LoginPage obj_Loginpage = new LoginPage(driver);
	Product obj_Product = new Product(driver);

	static {
		MyDriver.setDriver();
		driver = MyDriver.getDriver();
	}

	@AfterSuite
	public void closeDriver() {
		driver.close();
	}

	@Test(priority = 1, groups = { "grp1" })
	public void test_moveToSignInPage() {
		obj_HomePage.moveToSignInPage();
		Reporter.log("moved to sign in page succesfullys");
	}

	@Test(priority = 2, groups = { "grp2" })
	public void test_loginWith_BlankUID_BlankPass() {
		obj_Loginpage.loginWith_BlankUID_BlankPass();
	}

	@Test(priority = 3)
	public void test_loginWith_BlankPass() {
		obj_Loginpage.loginWith_BlankPass();
	}

	@Test(priority = 4, groups = { "grp1" })
	public void test_loginWith_InvalidEmail_BlankPass() {
		obj_Loginpage.loginWith_InvalidEmail_BlankPass();
	}

	@Test(priority = 5)
	public void test_loginWith_UnRegisteredEmail_password() {
		obj_Loginpage.loginWith_UnRegisteredEmail_password();
	}

	@Test(priority = 6, groups = { "grp2" })
	public void test_loginWith_validEmail_WrongPass() {
		obj_Loginpage.loginWith_validEmail_WrongPass();
	}

	@Test(priority = 7)
	public void test_loginWith_SuccessfullLogin() {
		obj_Loginpage.loginWith_SuccessfullLogin();
	}

	@Test(priority = 8, groups = { "grp2" })
	public void test_fetchPrice() {
		obj_Product.getPriceOF();
	}

}
