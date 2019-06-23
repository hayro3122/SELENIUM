import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.priceline.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
//		Select s= new Select(driver.findElement(By.id("rooms")));
//		
//		System.out.println(s.getFirstSelectedOption().getText());
//		List<WebElement> dropdowns= s.getOptions();
//		System.out.println(dropdowns.size());
//		for(int i=0; i<dropdowns.size(); i++) {
//		System.out.println(dropdowns.get(i).getText());
//		driver.close();	
//	}
		driver.get("https://toolsqa.com/automation-practice-form/");
		
		Select s1= new Select (driver.findElement(By.id("......")));
		List<WebElement> allOption=s1.getAllSelectedOptions();
		System.out.println(allOption.size());
		
		for(WebElement option:allOption) {
			System.out.println(option.getText());
		}
		
		
		
		
		
		
}
}
