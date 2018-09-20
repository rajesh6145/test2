package pom.product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Purchase {
	
	@FindBy(how=How.XPATH, using="//a[@id='nav-link-shopall'][contains(text(),'Shop by')]") WebElement shopByCategory;
	@FindBy(how= How.XPATH, using=".//*[@id='shopAllLinks']/tbody/tr/td[2]/div[2]/ul/li[1]/a") WebElement mensFashion;

}
