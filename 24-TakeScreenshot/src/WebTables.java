import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.SocketHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"div_bse_gainer\"]/p/a")).click();
		
		List<WebElement> AllCompanyNames=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		//System.out.println(AllCompanyNames.size());
		
//		for(int i=0;i<AllCompanyNames.size();i++) {
//			System.out.println(AllCompanyNames.get(i).getText());
//		}
		
//		WebElement price= driver.findElement(By.xpath("//*[@class='dataTable']/tbody/tr[2]/td[4]"));
//		System.out.println(price.getText());
//		
//		for(WebElement company:AllCompanyNames) {		
//			System.out.println(company.getText());
//		}
		List<WebElement> prices= driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		
		String companyName="Vedanta";
		
//		for(int i=0; i<AllCompanyNames.size(); i++) {
//			if(AllCompanyNames.get(i).getText().equals(companyName)) {
//				System.out.println("Vedanta's price is " + prices.get(i).getText());
//				break;
//			}
//		}
		
		int rows= driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(rows);
		
	}

}
