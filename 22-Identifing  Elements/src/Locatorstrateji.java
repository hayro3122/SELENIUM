import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorstrateji {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("Kmal");
		driver.findElement(By.name("passwd")).sendKeys("1234");
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("a new account")).click();
		driver.close();
	}

}
