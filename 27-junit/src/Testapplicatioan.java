import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Testapplicatioan {
	
	@Test
	public void testLogin() {
		System.out.println("testing login");
	}
	//@Ignore
	@Test
	public void testRegister() {
		System.out.println("Testing regieter");
	}
	
	@Before
	public void openbrowser() {
		System.out.println("Openning browser");
	}
	@After
	public void closebrowser() {
		System.out.println("Clossing browser");
	}
	@BeforeClass
	public static void init() {
		System.out.println("openning enviroment");
	}
	@AfterClass
	public static void closeDown() {
		System.out.println("clossing enviroment");
	}
}
