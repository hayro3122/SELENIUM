import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("login1")).sendKeys("Mike");
		driver.findElement(By.name("proceed")).click();
		
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		driver.switchTo().defaultContent();
	
		driver.findElement(By.id("password")).sendKeys("Ertu123");
		driver.findElement(By.name("proceed")).click();
		driver.close();
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
