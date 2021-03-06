package runner.com.cdNewCar.AndroidWebFramework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.configreader.PropertyFileReader;
import com.cucumber.framework.utility.ActionAfterClass;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(features={"classpath:featurefile/NewCar/NewCar.feature"}
,glue={"classpath:com.cucumber.framework.stepdefinition",
	   "classpath:com.cucumber.framework.Helper"},
		plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json"},
	
   // tags ={"@TC_001,@TC_002","~@TC_003","~@TC_04"},
       tags ={"@TC_001","~@TC_002","~@TC_003","~@TC_04"},
		dryRun=false,
		monochrome = false
)

public class Runner_NewCarVerification extends TestBase{
	
	
	TestBase testbaseObj= new TestBase();
	ActionAfterClass actionAfterClassObj;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before running the suite-CarDekho Website");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After running the suite-Car Dekho Web site");
	}
	
	@AfterTest
	public void afterTest()
	{
		actionAfterClassObj = new ActionAfterClass();
		actionAfterClassObj.actionAfterTest(testbaseObj.scenarioName, XMLtestCaseName);
		System.out.println("After executing the test");
	}
	
	
	
	@BeforeTest
	@Parameters({"deviceID"})
    public void onBeforeTestMobile(String deviceID,ITestContext testContext)
	 	{
		 	TestBase.XMLtestCaseName=testContext.getName();
		 	this.deviceID=deviceID;
		 	
		 	try
		 	{
		 		if(XMLtestCaseName.contains("Samsung7"))
	            {
		 			System.out.println("Step 1 of report start and browserID is " + browserID);	
		 			System.out.println("Inside Before Test class of BASE CLASS: Chrome");
	                String filePath=System.getProperty("user.dir")+"\\"+ "Samsung_RealDevice.html";
	                androidReadDeviceRPT=new ExtentReports(filePath,true, DisplayOrder.OLDEST_FIRST);
	                System.out.println("Inside Before Test class: Chrome & Extent Report for" + browserID + "is Initilized");
	              //  TestBase.setUpAndroidDriver(deviceID,XMLtestCaseName);
	            }	
		 		
		 		else if(XMLtestCaseName.contains("Samsung Galaxy Emulator"))
	            {
		 			System.out.println("Step 1 of report start and browserID is " + browserID);	
		 			System.out.println("Inside Before Test class of BASE CLASS: Chrome");
	                String filePath=System.getProperty("user.dir")+"\\"+ "Emulator1.html";
	                androidEmulatorRPT=new ExtentReports(filePath,true, DisplayOrder.OLDEST_FIRST);
	                System.out.println("Inside Before Test class: Chrome & Extent Report for" + browserID + "is Initilized");
	              //  TestBase.setUpAndroidDriver(deviceID,XMLtestCaseName);
	            }
		 	}
		 	
		 	catch(Exception e)
		 	{
		 		System.out.println(e.getMessage());
		 	}
	 	}
	
	
	@Test()
	public void runCukes()
	{
		System.out.println("Test 1");
		new TestNGCucumberRunner(getClass()).runCukes();
	}

}



















/*@AfterClass
public static void teardown() {
    Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
    Reporter.setSystemInfo("user", System.getProperty("user.name"));
    Reporter.setSystemInfo("os", "Win");
    Reporter.setTestRunnerOutput("Sample test runner output message");
    System.out.println("After running the AfterClass");
}*/

/*@BeforeClass
public static void setup() {
	System.out.println("Before running the beforeClass");
    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
//    extentProperties.setExtentXServerUrl("http://localhost:1337");
//    extentProperties.setProjectName("MyProject");
    extentProperties.setReportPath("output/myreport.html");
}*/
//@BeforeMethod()
//@Before
/*public void before() throws Exception
{
	System.out.println("Before TESTNG before method");
	System.out.println("Starting of Before method");
	ObjectRepo.reader=new PropertyFileReader();
	String bName=ObjectRepo.reader.getBrowserName();
	//setUpDriver(ObjectRepo.reader.getBrowser());
	testbaseObj.setUpDriver(bName);
	//log.info(ObjectRepo.reader.getBrowser());
	System.out.println("Inside Before method");
}

//@AfterMethod()
//@After
public void after(Scenario scenario)
{
	testbaseObj.driver.quit();
	//log.info("");
}*/
