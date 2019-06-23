package testcase2;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	@Test(enabled=false)
	public void assertion() {
		
		String actalTitle="yahoo";
		String Excepted="yahoo";
		
		System.out.println("A");
		
		Assert.assertEquals(actalTitle, Excepted);
		
		System.out.println("B");
		
		Assert.assertTrue(2>1, "Error");
		
	}
	@Test
	public void softassertion() {
		SoftAssert soft= new SoftAssert();
		String actalTitle="yahoo";
		String Excepted="yahoo1";
		
		System.out.println("A");
		
		soft.assertEquals("actalTitle", "Excepted");
		
		System.out.println("B");
	
		soft.assertAll();
		
		
	}

}
