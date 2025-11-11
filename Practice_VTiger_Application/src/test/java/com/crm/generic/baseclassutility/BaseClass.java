package com.crm.generic.baseclassutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void ConfigBeforeSuite() {
		System.out.println("--> connect to DB , Report Configuration");
	}
	
	@AfterSuite
	public void ConfigAfterSuite() {
		System.out.println("--> close DB , Report backup");
	}
	
	@BeforeClass
	public void ConfigBeforeClass() {
		System.out.println("-->  Launch the Browser");
	}
	
	@AfterClass
	public void ConfigAfterclass() {
		System.out.println("-->  close the Browser");
	}
	
	@BeforeMethod
	public void ConfigBeforeMethod() {
		System.out.println("-->  Login to the Application");
	}
	
	@AfterMethod
	public void ConfigAfterMethod() {
		System.out.println("-->  LogOut to the Application");
	}

}
