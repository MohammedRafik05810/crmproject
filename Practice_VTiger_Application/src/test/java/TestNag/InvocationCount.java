package TestNag;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 5)
	public void createContactTest() {
		System.out.println("Executing createContact");
	}

	@Test(invocationCount = 3)
	public void modifyContactTest() {
		System.out.println("Executing ModifyContactTest");
	}

	@Test(invocationCount = 5)
	public void deleteContactTest() {
		System.out.println("Executing deleteContactTest");
	}

}
