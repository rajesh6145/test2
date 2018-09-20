package roughPKG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Runtime.getRuntime().exec("C:\\Users\\raverma\\Desktop\\MyScripts/HandleAutomation.exe");
		driver.get("https://www.engprod-charter.net/");
		

	}

}
