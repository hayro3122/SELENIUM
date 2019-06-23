package POMDesign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.WebOrderLoginPage;



public class WebOrderLoginTest {
	
	WebDriver driver =null;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
	}
	@Ignore
	@Test
	public void loginPage() {
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	}
	
	@AfterTest
	public void closeUp() {
		driver.quit();
	}
	@Ignore
	@Test
	public void loginUsingPOM() {
	WebOrderLoginPage loginPage= new WebOrderLoginPage(driver);
	loginPage.username.sendKeys("Tester");
	loginPage.password.sendKeys("test");
	loginPage.loginButton.click();
	
	}
	@Test
	public void loginStatusUsingPOM() {
	WebOrderLoginPage loginPage= new WebOrderLoginPage(driver);
	loginPage.username.sendKeys("Tester1");
	loginPage.password.sendKeys("test2");
	loginPage.loginButton.click();
	String errorMsg= loginPage.loginStatus.getText();
	Assert.assertEquals("Invalid Login or Password.", errorMsg);
	}

}
