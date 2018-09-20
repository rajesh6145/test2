package roughPKG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WidowManage {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowSize = rows.size();
		for (int i = 2; i <= rowSize; i++) {
			System.out.println("*****************");
			for (int j = 1; j <= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"))
					.size(); j++) {
				System.out.println(driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]")).getText());
			}
		}
		driver.navigate().to("http://toolsqa.wpengine.com/automation-practice-form/");

		Select select = new Select(driver.findElement(By.id("continents")));
		select.selectByIndex(1);
		select.selectByVisibleText("Africa");
		List<WebElement> options = select.getOptions();
		for(WebElement op: options) {
			System.out.println(op.getText());
		}
		
		driver.close();
		
		
		

	}

}
