package pom.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Product {
	WebDriver driver;
	public Product(WebDriver driver) {
		PageFactory.initElements(driver, this); 
	}
	
	String myProduct="Moto G5S Plus (Lunar Grey, 64GB)";

	@FindBy(how = How.XPATH, using = "//input[@id='twotabsearchtextbox']")
	WebElement searchTxtField;

	@FindBy(how = How.XPATH, using = "//input[@class='nav-input'][@type='submit']")
	WebElement SearchSubmit;

	@FindBy(how = How.XPATH, using = "//a[@title='Moto G5S Plus (Lunar Grey, 64GB)']//ancestor::div[@class='a-row a-spacing-small']//following-sibling::div[@class='a-row']/div/div/a")
	WebElement price;

	public void getPriceOF() {
		searchTxtField.sendKeys(myProduct);
		SearchSubmit.click();
		String p = price.getText();
		System.out.println("the price of moto g5s+ is---"+ p);

	}

}
