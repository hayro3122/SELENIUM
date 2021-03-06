import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskWebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		int totalrows = driver.findElements(By.xpath("//*[@class=\"su-table\"]/table/tbody/tr/td[1]")).size();
		System.out.println("Total Rows : "+totalrows);
		int totalcolumn = driver.findElements(By.xpath("//*[@class=\"su-table\"]/table/tbody/tr[1]/td")).size();
		System.out.println("Total Colums :" +totalcolumn);
		WebElement text1=driver.findElement(By.xpath("//*[@class=\"su-table\"]/table/tbody/tr[2]/td[3]"));
		System.out.println("Text1 :" +text1.getText());
		WebElement text2=driver.findElement(By.xpath("//*[@class=\"su-table\"]/table/tbody/tr[6]/td[1]"));
		System.out.println("Text2 :" +text2.getText());
		driver.quit();

	}

}
