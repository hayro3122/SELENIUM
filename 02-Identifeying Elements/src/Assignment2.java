import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hayro\\Desktop\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://shop.honda.com/");
		String hondaTitle = driver.getTitle();
		driver.get("https://www.ferrari.com/");
		String ferrariTitle = driver.getTitle();
		
		System.out.println(hondaTitle+ferrariTitle);
		
		driver.close();
		driver.quit();

	}

}
