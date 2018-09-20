package pkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ClassA {

	static WebDriver driver;
	static File file;
	public static void main(String[] args) {
		
		XSSFWorkbook wb;
		
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\raverma\\SeleniumReq\\chromedriver.exe");
		String downloadFilepath = "C:\\Users\\raverma\\Desktop\\Today's Build";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver = new ChromeDriver(cap);
		
		driver.get("http://sjstore.corp.adobe.com/builds03/flashruntime/production_builds/flashruntime/27.0-zoe/play_27_0_r0_130/pepper_binaries/win32/release/installer/pepper_installers//");
		driver.findElement(By.xpath("//a[contains(text(),'Pepper Plugin_Raw Build.zip')]")).click();*/
		
		
		
		
		
		
		/*File myExcel = new File("Buildspath.xlsx");
		try {
			 wb = new XSSFWorkbook(myExcel);
			 XSSFSheet sheet = wb.getSheet("Sheet1");
			 
			 System.out.println(sheet.getLastRowNum());
		} catch (InvalidFormatException e) {
			System.out.println("Check File path");
		} catch (IOException e) {
			System.out.println("Excel File not found");
		}
		*/
		
		
		makeRootDirectory();
		
		
	}
	
	public void moveToBuildpath(String buildPath, String targetBuild) {
		driver.get(buildPath);
		driver.findElement(By.xpath("//a[contains(text(),'"+targetBuild+"')]")).click();	
	}
	
	public static void makeRootDirectory() {
		file = new File("C:\\Temp");
		file.mkdir();
	}
	
	public void makeFolderForConcernBuild(String Enviroment) {
		file = new File("C:\\Temp" + "Enviroment");
	}
	
	public static  void runExe(String path) {
		try {
			System.out.println("executeing exe file");
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
		} catch (IOException e) {
			System.out.println("exe file not found");
		}
	}
	
 
	

}
