package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	static WebDriver driver;
	static Actions action;
	
	public Login(WebDriver driver) {
		this.driver= driver;
	}

	

	public void loginAmazonWith(String userID, String Pass) {

		action = new Actions(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("er.rajesh6145@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Shree@6145rama");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

	}

	public void signOutAmazon() {
		// check if user logged in successfully
		String str = driver
				.findElement(By.xpath("//a[@id='nav-link-yourAccount']/span[contains(text(),'Hello, rajesh')]"))
				.getText();
		if (str.equalsIgnoreCase("Hello, rajesh")) {
			System.out.println("logges in successfully...cross checked....am Signing out");
			action.moveToElement(
					driver.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Your Orders')]"))).build()
					.perform();

			driver.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'Sign Out')]")).click();

			if (driver.getTitle().equalsIgnoreCase("Amazon Sign In")) {
				System.out.println("sign out successfully.... am closing driver");
			} else {
				System.out.println("sign out nhi ho paya ");
			}
		} else {
			System.out.println("bhai login nhi hua,, code check kro");
		}

	}

}
