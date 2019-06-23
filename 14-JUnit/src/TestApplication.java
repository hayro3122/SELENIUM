import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestApplication {
	@Ignore
	@Test
	public void testLogin() {
		System.out.println("Testing Login");
		
	}
	@Test
	public void testRegister() {
		System.out.println("Testing Register");
		
	}
	@Before
	public void openBrowser() {
		System.out.println("Testing Register");
		
	}
	@After
	public void closeBrowser() {
		System.out.println("Testing Register");
		
	}
	@BeforeClass
	public static void init() {
		System.out.println("initializing test evviroment");
		
	}
	@AfterClass
	public static void closeDown() {
		System.out.println("Closing test environment");
		
	}
	
	
	
	
}
