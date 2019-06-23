import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.website.com/sign-in/");
		driver.findElement(By.name("username")).sendKeys("mike");
	    driver.findElement(By.name("password")).sendKeys("abc123");
	    driver.findElement(By.linkText("Log In")).click();
	    driver.close();

	}

}
