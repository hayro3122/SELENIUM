import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> names = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println(names.size());
		
		List<WebElement> price = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(price.size());
		
		String companyName = "Jyoti";
		for(int i=0; i<names.size(); i++) {
			if (names.get(i).getText().equals(companyName)) {
				System.out.println(price.get(i).getText());
				break;
			}
		}
		//how many total column?
		int rows= driver.findElements(By.xpath("...")).size();
		System.out.println(rows);
		
		driver.quit();
	}

}
