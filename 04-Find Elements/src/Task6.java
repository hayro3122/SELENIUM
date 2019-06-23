
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		WebElement link= links.get(9);
		System.out.println(link.getText());
		link.click();
		driver.close();
		driver.get("https://www.etsy.com/");
		
		List<WebElement> links1= driver.findElements(By.tagName("a"));
		for(WebElement x:links1) {
			if(x.getText().equals("Clothing & Shoes")) {
				x.click();
			}
		}
		driver.quit();
	}
}

