package POMDesign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AllOrderPage;
import pages.WebOrderLoginPage;

public class AllOrderTest {
	
	WebDriver driver =null;
	WebOrderLoginPage loginpage;
	AllOrderPage allOrderpage;
	String userID = "Tester";
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
	}
	@AfterTest
	public void closeUp() {
		driver.quit();
	}
	@Test
	public void labelsVerification() {
		loginpage = new WebOrderLoginPage(driver);
		AllOrderPage allOrdersPage = new AllOrderPage(driver);
		Assert.assertEquals(driver.getTitle(), "Web Orders Login","Login Page is not displayed.Application is down");
		
		loginpage.username.sendKeys(userID);
		loginpage.password.sendKeys("test");
		loginpage.loginButton.click();
		Assert.assertTrue(allOrdersPage.webOrders.isDisplayed(),"Web Orders is not displayed");
		Assert.assertTrue(allOrdersPage.listOfAllOrders.isDisplayed(),"ListofAllOrders is not displayed");
		Assert.assertEquals(allOrdersPage.welcomeMsg.getText().replace(" | Logout", ""),"Welcome, " + userID + "!");
		Assert.assertTrue(allOrdersPage.viewAllOrders.isDisplayed(),"View All Orders is not displayed");
		Assert.assertTrue(allOrdersPage.orderTab.isDisplayed(),"Order Tab is not displayed");
		Assert.assertTrue(allOrdersPage.viewAllProducts.isDisplayed(),"View All Products is not displayed");
		
		allOrdersPage.logout();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
