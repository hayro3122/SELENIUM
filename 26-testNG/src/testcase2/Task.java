package testcase2;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {
	
	@BeforeMethod
	public void login() {
		System.out.println("successfully login");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Successfuly logout");
	}
	@Test(priority=1)
	public void register() {
		System.out.println("Register successfully completed");
	}
	
	@Test(priority=2, dependsOnMethods= {"register"})
	public void search() {
		System.out.println("search successfully completed");
		throw new SkipException("reason");
	}
	@Test(priority=3,dependsOnMethods= {"search"})
	public void buy() {
		System.out.println("buy successfully completed");
	}
	@Test(priority=4,dependsOnMethods= {"buy"})
	public void pay() {
		System.out.println("pay successfully completed");
	}
	
	
	
	
	
	
	

}
