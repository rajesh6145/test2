package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	static String userID;
	static String pass;
	static WebDriver driver;
	static BuyProduct objBuyPro;
	static Login objLogin;
	static {
		try {
			FileInputStream file = new FileInputStream("config.properties");
			Properties pro = new Properties();
			pro.load(file);
			userID = pro.getProperty("userid");
			pass = pro.getProperty("password");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	static {
		StartDriver();
		objLogin = new Login(driver);
		objBuyPro = new BuyProduct(driver);
	}

	public static void main(String[] args) {
		System.out.println(userID);
		System.out.println(pass);
		objLogin.loginAmazonWith(userID, pass);
		// objLogin.signOutAmazon();
		try {

			objBuyPro.AddProductThroughExcel();
		} catch (IOException e) {
			System.out.println("add product method kuch problem h");
		}

		System.out.println("product added from excel");
		objBuyPro.AddProductFromCategory();

		closeDriver();

	}

	public static void StartDriver() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void closeDriver() {
		driver.close();
	}

}
