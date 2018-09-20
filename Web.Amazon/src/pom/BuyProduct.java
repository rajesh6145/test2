package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BuyProduct {

	static WebDriver driver;
	static String searchbar = "//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']";
	static String searchBtn = "//div[@class='nav-search-submit nav-sprite']/input[@type='submit']";
	static String productImage = "//ul[@id='s-results-list-atf']/li[1]//a[1]/img[1]";
	static String addToCartBtn = "//div[@class='a-box']//input[@id='add-to-cart-button']";
	static String selectSizeDP = "//select[@name='dropdown_selected_size_name']";

	public BuyProduct(WebDriver driver) {
		this.driver = driver;
	}

	public void AddProductThroughExcel() throws IOException {
		FileInputStream fis = new FileInputStream(new File("productList.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("ReqProductDetails");
		int totalRow = sheet.getPhysicalNumberOfRows();
		for (int r = 1; r < totalRow; r++) {
			String product = sheet.getRow(r).getCell(0).getStringCellValue();
			driver.findElement(By.xpath(searchbar)).clear();
			driver.findElement(By.xpath(searchbar)).sendKeys(product);
			driver.findElement(By.xpath(searchBtn)).click();
			System.out.println("product searched");
			String parentWindow = driver.getWindowHandle();
			System.out.println(parentWindow);
			driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
			try {
				driver.findElement(By.xpath(productImage)).click();
			} catch (Exception e) {
				driver.findElement(
						By.xpath("//h2[contains(text(),'" + sheet.getRow(r).getCell(0).getStringCellValue() + "')]"))
						.click();
			}

			System.out.println("product image clicked");

			for (String newWindow : driver.getWindowHandles()) {
				System.out.println(newWindow);
				if (newWindow.equalsIgnoreCase(parentWindow)) {
					System.out.println("****window string matched******");
					continue;
				} else {
					System.out.println("****new window string found*****");
					driver.switchTo().window(newWindow);
					System.out.println("switched to new Window");
					System.out.println(driver.getTitle());
					if (driver.findElement(By.xpath(addToCartBtn)).getAttribute("style")
							.equalsIgnoreCase("cursor: not-allowed;")) {
						selectSize(sheet.getRow(r).getCell(1).getStringCellValue());
					} else {

						driver.findElement(By.xpath(addToCartBtn)).click();
					}

					// verify if product is added
					if (driver.findElement(By.xpath("//h1[contains(text(),'Added to Cart')]")).isDisplayed()) {
						System.out.println("product added");
						driver.close();
					} else {
						System.out.println("product not added");
						driver.close();
					}

					driver.switchTo().window(parentWindow);
				}

			}
			wb.close();

		}

	}

	public void AddProductFromCategory() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-shopall']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'Sports, Fitness, Bags, Luggage')]"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'Football')]"))).click().perform();
	}
	
	
	
	
	
	
	public static void selectSize(String size) {
		System.out.println("Entered in selectSize method ");
		Select dropDown = new Select(driver.findElement(By.xpath(selectSizeDP)));
		dropDown.selectByVisibleText(size);
	}
}
