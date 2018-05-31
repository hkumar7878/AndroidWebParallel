package com.cucumber.framework.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.Helper.Wait.WaitHelper;
import com.cucumber.framework.Helper.genericHelper.GenericHelper;
import com.relevantcodes.extentreports.LogStatus;

import ErrorCollectors.ErrorCollector;
import io.appium.java_client.AppiumDriver;

public class PG_SearchNewCar_By_Brand_Option_AndroidWeb extends TestBase{
	public AppiumDriver driver;
	private final Logger log = LoggerHelper.getLogger(PG_HomePage_AndroidWeb.class);
	WaitHelper waitHelper;
	GenericHelper generichelper= new GenericHelper();
	static boolean flag;
	public static String err_Msg;
	String actHdTxt;
	
	public PG_SearchNewCar_By_Brand_Option_AndroidWeb(AppiumDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.waitForElement(driver, womenMenu,ObjectRepo.reader.getExplicitWait());
		//waitHelper.waitForElement(driver,20,txtSearchOptionsHd);
		//waitHelper.waitForElementVisible(locator, timeOutInSeconds, pollingEveryInMillSec);(driver,20,txtHomePageHd);
	}
	
		@FindBy(xpath="//h3[contains(text(),'Search by Car name or brand')]")
		WebElement txtSearchOptionsHd;
		
		public void verifyPgHeader(String expTxt,String passResult,String failResult,String deviceID)
		{
			try
			{
				Thread.sleep(1000);	
				System.out.println("Checking Search New Car page for....."  + deviceID);
				log.info("Checking New Car Search Page " + deviceID);
					actHdTxt=generichelper.readValueFromElement(txtSearchOptionsHd);
					Assert.assertEquals(expTxt.trim(), actHdTxt.trim());
					System.out.println("Car dekho home page is displayed");
					if(deviceID.contains("42003a0fd3148479"))
					{
						androidReadDevice_logger1.log(LogStatus.PASS,passResult);
					}
					
					else if(deviceID.contains("emulator-5554"))
					{
						//androidEmulator_logger1
						androidEmulator_logger1.log(LogStatus.PASS, passResult);
					}
					
				}
				
				
				catch(Throwable e)
				{
					e.getMessage();
					System.out.println(e.getMessage());
					if(deviceID.contains("42003a0fd3148479"))
					{
						androidReadDevice_logger1.log(LogStatus.FAIL,failResult);
					}
					
					else if(deviceID.contains("emulator-5554"))
					{
						//androidEmulator_logger1
						androidEmulator_logger1.log(LogStatus.FAIL, failResult);
					}
					ErrorCollector.addVerificationFailure(e);
				}
			}

}
