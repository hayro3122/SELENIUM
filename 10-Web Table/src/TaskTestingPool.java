import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTestingPool {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//rows
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='su-table']/table/tbody/tr/td[1]"));
		System.out.println("rows " + rows.size());
				
		//columns
		List<WebElement> columns = driver.findElements(By.xpath("//*[@class='su-table']/table/tbody/tr[1]/td"));
		System.out.println("Columns " + columns.size());
				
		//print byte a=100;
		System.out.println(driver.findElement(By.xpath("//*[@class='su-table']/table/tbody/tr[2]/td[3]")).getText());
				
		//print float;
		System.out.println(driver.findElement(By.xpath("//*[@class='su-table']/table/tbody/tr[6]/td[1]")).getText());
				
				
				
		
		
		
		driver.quit();

	}

}
