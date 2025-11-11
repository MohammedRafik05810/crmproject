package Sample.TestCasesss.ExtentReport;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Sample {

	ExtentReports report;

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

		ExtentTest test = report.createTest("CreateContact Test");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "Navigate contact page");
		test.log(Status.INFO, "create Conatct ");
		if ("Hello".equals("Hello")) {
			test.log(Status.PASS, "Contact is created");
		} else {
			test.log(Status.FAIL, "Fails ");
		}
		

	}
	
	
	@Test
	public void createContactWithPhoneNumber() {

		ExtentTest test = report.createTest("createContactWithPhoneNumber Test");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "Navigate contact page");
		test.log(Status.INFO, "create Conatct ");
		if ("Hello".equals("Hello")) {
			test.log(Status.PASS, "Contact is created");
		} else {
			test.log(Status.FAIL, "Fails ");
		}
		

	}
	
	
	
	@Test
	public void createContactWithOrg() {

		ExtentTest test = report.createTest("createContactWithOrg Test");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "Navigate contact page");
		test.log(Status.INFO, "create Conatct ");
		if ("Hello".equals("Hello")) {
			test.log(Status.PASS, "Contact is created");
		} else {
			test.log(Status.FAIL, "Fails ");
		}
		

	}
	
	
	@AfterSuite
	public void configAS() {
		report.flush();
	}



}
