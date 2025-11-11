package TestNag;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_ {
	
	
	@DataProvider
	public Object[][] getdata() {
		Object obj[][]=new Object[3][2];
		obj[0][0]="Rafik";
		obj[0][1]="Md";
		obj[1][0]="Raaj";
		obj[1][1]="Kl";
		obj[2][0]="Ranjan";
		obj[2][1]="ch";
		return obj;
	}
	
	@Test(dataProvider = "getdata")
	public void createContact(String F_name,String L_name) {
		System.out.println(F_name+"\t"+L_name);
	}

}
