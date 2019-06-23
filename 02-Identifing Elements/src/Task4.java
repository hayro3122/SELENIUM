
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		
		
		driver.get("hhttp://www.newtours.demoaut.com/");

		//name locators 
		driver.findElement(By.name("userName")).sendKeys("Test1234567");
				
		// name locators 
		driver.findElement(By.name("password")).sendKeys("Test1234567");
				
		driver.findElement(By.name("login")).click();
				
	}

}
