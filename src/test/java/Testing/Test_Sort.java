package Testing;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Sort {

	@Test
	public void Test_1() {
		SoftAssert soft =new SoftAssert();
		System.out.println("Email Enter");
		System.out.println("Password enter");
		System.out.println("Login Button click");
		
		String expected="Shweta";
		String actual="shweta";
		
		soft.assertEquals(actual, expected);
		System.out.println("Test Done");
		
		soft.assertAll();
		
		
		
		
		
	}
	}
	
	

