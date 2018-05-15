package com.cucumber.framework.pageobject;

import io.appium.java_client.AppiumDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.Helper.Wait.WaitHelper;
import com.cucumber.framework.Helper.genericHelper.GenericHelper;
import com.relevantcodes.extentreports.LogStatus;

public class PageAndroidWeb_HomePage extends TestBase{
	
	AppiumDriver driver;
	private final Logger log = LoggerHelper.getLogger(PageAndroidWeb_HomePage.class);
	WaitHelper waitHelper;
	GenericHelper generichelper= new GenericHelper();
	static boolean flag;
	public static String err_Msg;
	
	public PageAndroidWeb_HomePage(AppiumDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.waitForElement(driver, womenMenu,ObjectRepo.reader.getExplicitWait());
		waitHelper.waitForElement(driver,20,txtHomePageHd);
	}
	
	
	@FindBy(xpath="//h1[contains(text(),'Welcome to your trusted car advisor')]")
	WebElement txtHomePageHd;
	
	@FindBy(xpath="//a[@class='fab new']")
	WebElement btnNewCar;
	
	
	public void verifyHomePage(String deviceID)
	{
		try
		{
			log.info("Checking Car Dekho home page");
			flag=generichelper.isDisplayed(txtHomePageHd);
			Assert.assertTrue(flag, "Car dekho home page is not displayed");
			System.out.println("Car dekho home page is displayed");
			if(deviceID.contains("42003a0fd3148479"))
			{
				CH_logger.log(LogStatus.PASS, "Home Page is displayed");
			}
		}
		
		
		catch(Exception e)
		{
			e.getMessage();
			System.out.println(e.getMessage());
		}
	}
	
	public void verifyBtnDisplay(String btnName,String deviceID )
	{
		try
		{
			log.info("Checking New Car button existence on home page");
			if(btnName.equalsIgnoreCase("New Car"))
			{
				flag=generichelper.isDisplayed(btnNewCar);
			}
			
			Assert.assertEquals(flag, "New Car button is not displayed");
			if(deviceID.contains("42003a0fd3148479"))
			{
				CH_logger.log(LogStatus.PASS, "New Car button is displayed");
			}
		}
		
		catch(Exception e)
		{
			e.getMessage();
			System.out.println(e.getMessage());
			CH_logger.log(LogStatus.FAIL, "New Car button is not displayed");
		}
	}
	
	
	public void clickBtn(String btnName,String deviceID)
	{
		try
		{
			
		}
		
		catch(Exception e)
		{
			e.getMessage();
			System.out.println(e.getMessage());
			CH_logger.log(LogStatus.FAIL, "New Car button is not displayed");
		}
	}

}
