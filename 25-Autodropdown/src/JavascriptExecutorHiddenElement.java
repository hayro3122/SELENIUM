import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorHiddenElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hotwire.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys("New");
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("farefinder-hotel-destination-input")).sendKeys(Keys.ENTER);
		System.out.println("Selenium ile :"+driver.findElement(By.id("farefinder-hotel-destination-input")).getAttribute("value"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script="return document.getElementById(\"farefinder-hotel-destination-input\").value;";
		
		String text=(String) js.executeScript(script);
		System.out.println("Javascript ile : "+text);

	}

}
