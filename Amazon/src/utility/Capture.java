package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capture {
	

	public static  void screenShot_saveAt(WebDriver driver, String nameOfFile) {
		TakesScreenshot takescreenShot = (TakesScreenshot) driver;
		File src = takescreenShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./ScreenShots/" + nameOfFile + ".png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
