import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class assertion {
    @Rule
	public ErrorCollector err= new ErrorCollector();
	
	
	
	@Ignore
	@Test
	public void testApp() {
		System.out.println("A");
		Assert.assertEquals("Hello", "Hello111");
		//Assert.assertTrue(3>10);
		System.out.println("B");
	}
	
	@Test
	public void testApp2() {
		System.out.println("A");
		
		
		try {
			Assert.assertEquals("hello", "Hello");
			
		}catch  (Throwable t){
			err.addError(t);
			System.out.println("error");
			
		}
		System.out.println("B");
		
		try {
			Assert.assertTrue("Olmadi kardes", false);
		}catch(Throwable t) {
			err.addError(t);
		}
		
		
		
	}
	
	

}
