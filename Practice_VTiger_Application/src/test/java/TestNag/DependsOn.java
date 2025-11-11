package TestNag;

import org.testng.annotations.Test;

public class DependsOn {
	
	
	@Test
	public void createOrderTest() {
		System.out.println("Executing createOrderTest");
		String s1=null;
		System.out.println(s1.equals("Hello"));
	}
	
	
	@Test(dependsOnMethods = "createOrderTest")
	public void billingOrderTest() {
		System.out.println("Executing billingOrderTest");
		
	}

}
