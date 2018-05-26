package com.cucumber.framework.stepdefinition.UsedCar;

import io.appium.java_client.AppiumDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.pageobject.Pg_HomePage_AndroidWeb;


import com.cucumber.framework.pageobject.Pg_NewCar_AndroidWeb;
import com.cucumber.framework.pageobject.Pg_UsedCar_AndroidWeb;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_01_UsedCarPageDisplayVerification {
	private final Logger log= LoggerHelper.getLogger(TC_01_UsedCarPageDisplayVerification.class);
	
	TestBase testbaseObj= new TestBase();
	public AppiumDriver driver;
	Pg_HomePage_AndroidWeb cdHomePgObject;
	Pg_UsedCar_AndroidWeb cdUsedCarPgObject;

	@Then("^verify Used Car button is displayed on the home page$")
	public void verify_Used_Car_Button_is_displayed_on_the_home_page() throws Throwable {
	   
	   String passResult="Used Car button is displayed on home page";
	   String failResult="Used Car button is displayed on home page";
	   driver=TestBase.driver;
	   System.out.println("------------Checking Used Car Button on home page--------------");
	   cdHomePgObject= new Pg_HomePage_AndroidWeb(driver);
	   cdHomePgObject.verifyBtnDisplay("Used Car",passResult,failResult,TestBase.deviceID);
	   
	}

	@Then("^click on Used Car button$")
	public void click_on_Used_Car_button() throws Throwable {
		System.out.println("------------Clicking Used Car Button on home page--------------");
		String passResult="Used Car button is clikced successfully";
		String failResult="Used Car button is not clicked";
		cdUsedCarPgObject = new Pg_UsedCar_AndroidWeb(driver);
		cdUsedCarPgObject= cdHomePgObject.clickUsedCarBtn("Used Car",passResult,failResult,TestBase.deviceID);
	}

	@Then("^Verify Used Car page is displayed$")
	public void verify_Used_Car_page_is_displayed() throws Throwable {
		System.out.println("------------Verifying Used Car page--------------");
		String passResult="Used Car page is displayed successfully";
		String failResult="Used Car page is not displayed successfully";
		cdUsedCarPgObject.verifyPgHeader("Know everything",passResult,failResult,TestBase.deviceID);
	    
	}


}
