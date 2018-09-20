package allaink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class FindAllLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://labs.stage.adobe.com/");
	
		
		//java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		System.out.println(links.size());
		for (int i = 0; i<links.size(); i=i+1)
		{
 
			System.out.println(links.get(i).getText());
			verifyLink(links.get(i).getAttribute("href"));
 
		}
		
		

		driver.close();
	}
	
	public static void verifyLink(String linkURL) {
		
		try {
			URL url = new URL(linkURL);
			HttpURLConnection httpUrlConnection = (HttpURLConnection)url.openConnection();
			httpUrlConnection.setConnectTimeout(4000);
			httpUrlConnection.connect();
			if(httpUrlConnection.getResponseCode()==200) {
				System.out.println(linkURL+" - " +httpUrlConnection.getResponseMessage());
			}
			if(httpUrlConnection.getResponseCode()== HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkURL+ " - "+ httpUrlConnection.getResponseMessage() +" - "+ httpUrlConnection.getResponseCode());
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
