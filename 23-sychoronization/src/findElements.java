import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.cnn.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		
//		List<WebElement> links= driver.findElements(By.tagName("a"));
//		WebElement link=links.get(10).getText();
//		System.out.println(link);
//		System.out.println(links.size());
//		driver.close();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
//		for(WebElement link:links) {
//			if(link.getText().equals("Clothing & Shoes")) {
//				link.click();
//				break;
//			}
//		}
		
		for (int i=0; i<links.size();i++) {
			if(links.get(i).isDisplayed()) {
		System.out.println(links.get(i).getText());
		
		
	}
		
	}
		driver.close();
}
}