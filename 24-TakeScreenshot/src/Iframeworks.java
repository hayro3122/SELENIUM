import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeworks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		int total= driver.findElements(By.tagName("iframe")).size();
		System.out.println(total);
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a")).click();
		
		Set<String> allWinID= driver.getWindowHandles();
		Iterator<String> it = allWinID.iterator();
		String first=it.next();
		String second=it.next();
		driver.switchTo().window(second);
	
		driver.findElement(By.xpath("//*[@id=\'awf_field-93653884\']")).sendKeys("haslan3111112@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\'af-submit-image-482158182\']")).click();
		driver.quit();
	}

}
