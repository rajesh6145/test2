package com.runExeFile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiThread extends Thread {
	
	
	
	
	public void run() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		driver.close();
	}
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			MultiThread t  = new MultiThread();
			t.start();
			}
	}
	
	
}
