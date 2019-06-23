import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.priceline.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Select s= new Select(driver.findElement(By.id("rooms")));
		//s.selectByIndex(2);
		//s.selectByValue("7");
		//print everything from list
		//List<WebElement> options=s.getOptions();
		//System.out.println(options.size());
		
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		Select s = new Select(driver.findElement(By.id("selenium_commands")));
		s.selectByIndex(0);
		s.selectByIndex(3);
		
		List<WebElement> allSelected = s.getAllSelectedOptions();
		System.out.println(allSelected.size());
		for(WebElement e : allSelected) {
			System.out.println(e.getText());
		}
		
		
	}

}
