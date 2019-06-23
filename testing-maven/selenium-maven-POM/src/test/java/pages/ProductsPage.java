package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public  ProductsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy()
	public List<WebElement> productsNames; 
	
}
