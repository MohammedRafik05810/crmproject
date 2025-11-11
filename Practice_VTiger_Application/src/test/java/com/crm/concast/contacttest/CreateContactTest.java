package com.crm.concast.contacttest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.generic.baseclassutility.BaseClass;

public class CreateContactTest extends BaseClass{
	
	
	
	@Test
	public void createContact() {
		System.out.println("Executing CreateContact & Varify");
	}
	
	@Test
	public void createName() {
		System.out.println("Executing CreateName & Varify");
	}
	
	
	

}
