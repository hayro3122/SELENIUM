import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login1")).sendKeys("user");
		driver.findElement(By.name("proceed")).click();
		Alert al= driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		driver.switchTo().defaultContent();
				
		driver.close();
	}

}
