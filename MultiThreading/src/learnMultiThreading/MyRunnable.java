package learnMultiThreading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyRunnable extends Thread{

	private static WebDriver driver;
	
	public MyRunnable(WebDriver driver) {
		this.driver=driver;
	}
	
	public void run() {
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='SIvCob']/a[1]")).click();
		System.out.println("thread started");
		
	}
	
	public static void main(String[] args) {
		
		for(int i= 1;i<=2;i++) {
			driver = new ChromeDriver();
			MyRunnable thread = new MyRunnable(driver);
			thread.start();
		}
		
	}

}
