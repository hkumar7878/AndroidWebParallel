package com.cucumber.framework.pageobject;

import io.appium.java_client.AppiumDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.model.Test;
import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.Helper.Wait.WaitHelper;
import com.cucumber.framework.Helper.genericHelper.GenericHelper;
import com.cucumber.framework.utility.ApplicationLib;
import com.relevantcodes.extentreports.LogStatus;

public class PageAndroidWeb_NewCar extends TestBase{
	AppiumDriver driver;
	private final Logger log = LoggerHelper.getLogger(PageAndroidWeb_HomePage.class);
	WaitHelper waitHelper;
	GenericHelper generichelper= new GenericHelper();
	ApplicationLib appLibOnj= new ApplicationLib();
	String actHdTxt;
	static boolean flag;
	public static String err_Msg;
	
	public PageAndroidWeb_NewCar(AppiumDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.waitForElement(driver, womenMenu,ObjectRepo.reader.getExplicitWait());
		//waitHelper.waitForElement(driver,40,txtNewCarPageHd);
	}
	
	@FindBy(xpath="//h3[contains(text(),'Select a Category')]")
	WebElement txtNewCarPageHd;
	
	
	public void verifyPgHeader(String expTxt,String deviceID)
	{
		try
		{
			Thread.sleep(3000);	
			log.info("Checking Car Dekho home page");
				actHdTxt=generichelper.readValueFromElement(txtNewCarPageHd);
				Assert.assertEquals(expTxt.trim(), actHdTxt.trim());
				System.out.println("Car dekho home page is displayed");
				if(deviceID.contains("42003a0fd3148479"))
				{
					CH_logger.log(LogStatus.PASS, "New Car Page is displayed successfully");
				}
			}
			
			
			catch(Exception e)
			{
				e.getMessage();
				System.out.println(e.getMessage());
				CH_logger.log(LogStatus.PASS, "New Car Page not is displayed successfully");
			}
		}
}
