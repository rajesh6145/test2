package pom.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

	static WebDriver driver;
	static MyDriver obj_IntializeDriver;

	public static void setDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();

			

		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

}
