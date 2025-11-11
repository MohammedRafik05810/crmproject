package Sample.TestCasesss.ExtentReport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportWithScreenShot {

	public ExtentReports report;
	public WebDriver driver;

	@BeforeSuite
	public void configBS() {
		// Spark Report Config
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/Report.html");
		spark.config().setDocumentTitle("CRM TestSuite Report");
		spark.config().setReportName("CRM Report");
		spark.config().setTheme(Theme.DARK);

		// Add Env Info and Create Test
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows-11");
	}
	
	@Test
	public void createContact() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		String temp = ts.getScreenshotAs(OutputType.BASE64);

		ExtentTest test = report.createTest("CreateContact Test");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "Navigate contact page");
		test.log(Status.INFO, "create Conatct ");
		if (driver.getTitle().contains("vtiger")) {
			test.log(Status.PASS, "Contact is created");
		} else {
			test.addScreenCaptureFromBase64String(temp);
		}
		

	}
	
	
	@Test
	public void LaunchingYoutube() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		String temp = ts.getScreenshotAs(OutputType.BASE64);

		ExtentTest test = report.createTest("LaunchingYoutube Test");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "Navigate Youtube page");
		test.log(Status.INFO, "Launched Youtube ");
		if (driver.getCurrentUrl().equals("www.youtube.com")) {
			test.log(Status.PASS, "Contact is created");
		} else {
			test.addScreenCaptureFromBase64String(temp);
		}

	}
	
	
	
	@Test
	public void launchingYatraPage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		String temp = ts.getScreenshotAs(OutputType.BASE64);

		ExtentTest test = report.createTest("launchingYatraPage Test");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "Navigate Yatra page");
		test.log(Status.INFO, "create Conatct ");
		if (driver.getCurrentUrl().equals("www.yatra.com")) {
			test.log(Status.PASS, "Contact is created");
		} else {
			test.addScreenCaptureFromBase64String(temp);
		}
		

	}
	
	
	@AfterSuite
	public void configAS() {
		report.flush();
		driver.close();
	}



}
