package TestNag;

import org.testng.annotations.Test;

public class Priorityyyy {
	
	@Test(priority = 3)
	public void createContactTest() {
		System.out.println("Executing createContact");
	}
	
	
	@Test(priority = 1)
	public void modifyContactTest() {
		System.out.println("Executing ModifyContactTest");
	}
	
	
	@Test(priority = 2)
	public void deleteContactTest() {
		System.out.println("Executing deleteContactTest");
	}

}
