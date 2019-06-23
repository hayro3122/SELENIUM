import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		
		driver.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys("6");
		driver.findElement(By.xpath("//*[@ng-model='operator']/option[2]"));
		driver.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id ='gobutton']")).click();
		

	}

}