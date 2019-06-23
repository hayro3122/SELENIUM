import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.americangolf.co.uk/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Actions act= new Actions(driver);
//	
//		act.moveToElement(driver.findElement(By.cssSelector("#header-navigation > div.header-navigation-left > ul > li:nth-child(2) > a"))).build().perform();
//		driver.findElement(By.cssSelector("#CLUBS_1 > ul > li:nth-child(3) > ul > li > a")).click();
//		driver.quit();
		driver.get("https://www.johnlewis.com/");
		act.moveToElement(driver.findElement(By.cssSelector("#root > header > nav > ul > li:nth-child(1) > a"))).build().perform();
		driver.findElement(By.cssSelector("#root > header > nav > ul > li.primary-link-list-item--23ac8.primary-link-list-active--fcbc2 > div > div > ul > li:nth-child(2) > div > ul > li:nth-child(4) > a")).click();
		driver.quit();
	}

}
