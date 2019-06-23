import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assiignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("mike");
	    driver.findElementByCssSelector("#password").sendKeys("abc123");
	    driver.findElementByCssSelector("#Login").click();
	    driver.close();
	  

	}

}
