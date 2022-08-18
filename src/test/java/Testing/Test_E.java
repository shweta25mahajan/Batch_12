package Testing;

import org.testng.annotations.Test;

public class Test_E  {

	@Test(priority=1)
	public void p() {
		System.out.println("p");
	}
	@Test(enabled=false)
	public void E() {
		System.out.println("E");
	}
	
	@Test(priority=1,invocationCount=3)
	public void SS() {
		System.out.println("SS");
	}
	@Test(priority=2)
	public void P1()
	{
		System.out.println("P1");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	

