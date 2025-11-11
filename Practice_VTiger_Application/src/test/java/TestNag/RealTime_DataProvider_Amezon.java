package TestNag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RealTime_DataProvider_Amezon {

	
	@Test(dataProvider = "getdata")
	public void getProductInfoTest(String brandName,String productName) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//search product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(brandName,Keys.ENTER);
		
		
		// capture the product info
		String xpath="(//span[text()='"+productName+"'])[1]/../../../../div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]";
		String price=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(price);
		
		driver.quit();
		
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		Object obj[][]=new Object[3][2];
		obj[0][0]="iphone";
		obj[0][1]="Apple iPhone 15 (128 GB) - Black";
		
		
		obj[1][0]="iphone";
		obj[1][1]="Apple iPhone 15 (128 GB) - Pink";
		
		
		obj[2][0]="iphone";
		obj[2][1]="Apple iPhone 14 (256 GB) - Starlight";
		
		
		return obj;
	}
	
	
}
