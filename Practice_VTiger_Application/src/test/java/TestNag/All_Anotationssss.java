package TestNag;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class All_Anotationssss {
	
	@BeforeSuite
	public void ConfigBeforeSuite() {
		System.out.println("Executing BeforeSuite");
	}
	
	@BeforeClass
	public void ConfigBeforeClass() {
		System.out.println("Executing BeforeClass");
	}
	
	@BeforeMethod
	public void ConfigBeforeMethod() {
		System.out.println("Executing BeforeMethod");
	}
	
	
	@Test
	public void createContact() {
		System.out.println("Executing CreateContact  ");
	}
	
	@Test
	public void createName() {
		System.out.println("Executing CreateName  ");
	}
	
	
	@AfterMethod
	public void ConfigAfterMethod() {
		System.out.println("Executing AfterMethod");
	}
	
	
	@AfterClass
	public void ConfigAfterclass() {
		System.out.println("Executing Afterclass");
	}
	
	
	@AfterSuite
	public void ConfigAfterSuite() {
		System.out.println("Executing AfterSuite");
	}

	
}
