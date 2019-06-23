package testcase2;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AllTestNG {
	
//	@BeforeSuite
//	public void suite() {
//		System.out.println("--before suite--");
//	}
//	@AfterSuite
//	public void suiteafter() {
//		System.out.println("--before suite--");
//	}
	@BeforeMethod
	public void method() {
		System.out.println("--Run Method--");
	}
	@AfterMethod
	public void eachMethod() {
		System.out.println("--each metho--");
	}
	@org.testng.annotations.BeforeTest
	public void Before() {
		System.out.println("----Run before Test----");
	}
	@AfterTest
	public void BeforeTest() {
		System.out.println("----Run after Test----");
	}
		
	@Test(priority=1)
	public void login() {
		System.out.println("Login sucsessfuly");
		throw new SkipException("Reason");
	}
	
	@Test(priority=2, dependsOnMethods= {"login"})
	public void TestCase() {
		System.out.println("selenium codes");
	}
	
	@Test(priority=3)
	public void Logout() {
		System.out.println("logout sucsessfuly");
	}
	
	
	
	
	
	
	
	
	
	

}
