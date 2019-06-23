import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printabcnewslinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abcnews.go.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement box= driver.findElement(By.cssSelector("#row-1 > div>article>ul"));
		List<WebElement> links= box.findElements(By.tagName("li"));
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++) {
			links.get(i).click();
			driver.navigate().back();
			box= driver.findElement(By.cssSelector("#row-1 > div>article>ul"));
			links= box.findElements(By.tagName("li"));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
