package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Hard {

	@Test
	public void hard()
	{
	    System.out.println("Email enter");
	    System.out.println("Password Enter");
	    System.out.println("Login button click");
	    
	    String expected="Mahajan";
		String actual="Mahajan";
		Assert.assertEquals(actual, expected);
        
		System.out.println("Test Done");
	
	}

	@Test
	public void Test_2() {
		System.out.println("Test_2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
