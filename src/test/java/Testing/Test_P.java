package Testing;

import org.testng.annotations.Test;

public class Test_P {
   
	@Test(priority=0)
	public void A() {
		System.out.println("A");
	}
	
	@Test(priority=2)
	public void B(){
	System.out.println("B");	
	}
	
	@Test(priority= -1)
	public void c(){
	System.out.println("C");	
	}
	
	@Test(priority=3)
	public void D(){
	System.out.println("D");	
	}
	
	@Test(priority=1)
	public void S(){
	System.out.println("S");	
	}
	
	
	@Test(dependsOnMethods="A")
	public void DOM() {
		System.out.println("DOM");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
