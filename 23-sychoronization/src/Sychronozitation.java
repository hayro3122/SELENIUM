import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sychronozitation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String value= driver.findElement(By.xpath("//*[@name='proceed']")).getAttribute("value");
		System.out.println("Value : "+value);
		String text=driver.findElement(By.cssSelector(".floatL.f12.margTop5")).getText();
		System.out.println("Text : "+text);
		driver.close();

	}

}
