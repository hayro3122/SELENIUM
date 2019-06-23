import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abcNewsGo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://abcnews.go.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//get the box
		WebElement topStory = driver.findElement(By.cssSelector("#leadoff>.headlines.inbox.single.row-item>ul"));
		
		//get the list items
		List<WebElement> links = topStory.findElements(By.tagName("li"));
		
		for(int i=0; i<links.size(); i++) {
			links.get(i).click();
			driver.navigate().back();
			topStory = driver.findElement(By.cssSelector("#leadoff>.headlines.inbox.single.row-item>ul"));
			links = topStory.findElements(By.tagName("li"));
			
			
			
		}

	}

}
