package com.Adobe_FlashBuilds.Download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author raverma
 *
 */
public class SjStrore {
	WebDriver driver;
	/** Define WebDrivre instance */
	SjStrore obj_SjStrore;

	/**
	 * Constructor for SjStrore
	 * 
	 * @param driver
	 */
	public SjStrore(WebDriver driver) {
		this.driver = driver;
	}

	public void goToBuildPathFor(String BuildPath) {
		driver.get(BuildPath);
		// return obj_SjStrore;
	}

	public void andDownloadBuild(String BuildName) {
		try {
			driver.findElement(By.linkText(BuildName)).click();

		} catch (Exception e) {
			driver.findElement(By.partialLinkText(BuildName)).click();
		}
	}

}
