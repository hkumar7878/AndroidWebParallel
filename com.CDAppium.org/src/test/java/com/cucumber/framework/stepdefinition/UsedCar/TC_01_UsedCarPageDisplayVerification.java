package com.cucumber.framework.stepdefinition.UsedCar;

import io.appium.java_client.AppiumDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.pageobject.PageAndroidWeb_HomePage;


import com.cucumber.framework.pageobject.PageAndroidWeb_NewCar;
import com.cucumber.framework.pageobject.PageAndroidWeb_UsedCar;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_01_UsedCarPageDisplayVerification {
	private final Logger log= LoggerHelper.getLogger(TC_01_UsedCarPageDisplayVerification.class);
	
	TestBase testbaseObj= new TestBase();
	public AppiumDriver driver;
	PageAndroidWeb_HomePage cdHomePgObject;
	PageAndroidWeb_UsedCar cdUsedCarPgObject;

	
	/*@Then("^user verifies home page is displayed$")
	public void user_verifies_home_page_is_displayed() throws Throwable {
		driver=TestBase.driver;
		System.out.println(driver.hashCode());
		cdHomePgObject= new PageAndroidWeb_HomePage(driver);
		System.out.println("Inside step def and browser Name is " + TestBase.deviceID);
		cdHomePgObject.verifyHomePage(TestBase.deviceID);
	    
	}*/

	@Then("^verify Used Car button is displayed on the home page$")
	public void verify_Used_Car_Button_is_displayed_on_the_home_page() throws Throwable {
	   
	   String passResult="Used Car button is displayed on home page";
	   String failResult="Used Car button is displayed on home page";
	   driver=TestBase.driver;
	   System.out.println("Inside New Button verification");
	   cdHomePgObject= new PageAndroidWeb_HomePage(driver);
	   cdHomePgObject.verifyBtnDisplay("Used Car",passResult,failResult,TestBase.deviceID);
	   
	}

	@Then("^click on Used Car button$")
	public void click_on_Used_Car_button() throws Throwable {
		String passResult="Used Car button is clikced successfully";
		String failResult="Used Car button is not clicked";
		cdUsedCarPgObject = new PageAndroidWeb_UsedCar(driver);
		cdUsedCarPgObject= cdHomePgObject.clickUsedCarBtn("Used Car",passResult,failResult,TestBase.deviceID);
	}

	@Then("^Verify Used Car page is displayed$")
	public void verify_Used_Car_page_is_displayed() throws Throwable {
		cdUsedCarPgObject.verifyPgHeader("Know everything",TestBase.deviceID);
	    
	}


}
