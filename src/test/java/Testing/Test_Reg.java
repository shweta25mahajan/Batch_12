package Testing;

import org.testng.annotations.Test;

public class Test_Reg {

	@Test(groups="Regression")
	public void Reg() {
	  System.out.println("Reg");
	}
	
	@Test(groups="Sanity")
	public void san() {
	  System.out.println("san");
	}
	
	@Test(groups="Critial Regression")
	public void CR() {
	  System.out.println("CR");
	}
	
	@Test(groups="Sanity")
	public void San1() {
	  System.out.println("San1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
