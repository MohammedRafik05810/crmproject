package TestNag;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	
	
	@DataProvider
	public Object[][] getdata() {
		Object obj[][]=new Object[3][3];
		obj[0][0]="Rafik";
		obj[0][1]="Md";
		obj[0][2]=1234567898l;
		
		obj[1][0]="Raaj";
		obj[1][1]="Kl";
		obj[1][2]=9876543211l;
		
		obj[2][0]="Ranjan";
		obj[2][1]="ch";
		obj[2][2]=2589631478l;
		
		return obj;
	}
	
	
	@Test(dataProvider = "getdata")
	public void createContact(String F_name,String L_name,long con_Number) {
		System.out.println(F_name+"\t"+L_name+"\t"+con_Number);
	}

}
