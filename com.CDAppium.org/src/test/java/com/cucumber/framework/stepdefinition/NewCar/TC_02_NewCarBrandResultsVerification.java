package com.cucumber.framework.stepdefinition.NewCar;

import org.apache.log4j.Logger;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.pageobject.Pg_HomePage_AndroidWeb;
import com.cucumber.framework.pageobject.Pg_NewCar_AndroidWeb;

import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;

public class TC_02_NewCarBrandResultsVerification {
private final Logger log= LoggerHelper.getLogger(TC_01_NewCarPageDisplayVerification.class);
	
	TestBase testbaseObj= new TestBase();
	public AppiumDriver driver;
	Pg_HomePage_AndroidWeb cdHomePgObject;
	Pg_NewCar_AndroidWeb cdNewCarPgObject;
	
	
	@Then("^Click on Search New Car button$")
	public void click_on_Search_New_Car_button() throws Throwable {
		System.out.println("------Clicking New Car Button-----------");
		String passResult="New Button is clicked successfully";
		String failResult="New Button could not be clicked";
		cdNewCarPgObject = new Pg_NewCar_AndroidWeb(driver);
		cdNewCarPgObject= cdHomePgObject.clickBtn("New Car",passResult,failResult, TestBase.deviceID);
	    
	}

	@Then("^Verify Search New Car page is displayed$")
	public void verify_Search_New_Car_page_is_displayed() throws Throwable {
		System.out.println("------Checking New Car Page-----------");
		String passResult="New Car Page is displayed successfully";
		String failResult="New Car Page is not displayed";
		cdNewCarPgObject.verifyPgHeader("Select a Category",passResult,failResult,TestBase.deviceID);
	    
	}

	@Then("^Click on Maruti button under Brands section$")
	public void click_on_Maruti_button_under_Brands_section() throws Throwable {
	  
	   
	}

	@Then("^Verify that Maruti module is selected$")
	public void verify_that_Maruti_module_is_selected() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Verify Search result page specific to Maruti is displayed$")
	public void verify_Search_result_page_specific_to_Maruti_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Verify first search page should contain only maruti cars results only$")
	public void verify_first_search_page_should_contain_only_maruti_cars_results_only() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^scroll to bottom and click on Next button$")
	public void scroll_to_bottom_and_click_on_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^Verify next search page should contain only maruti cars results only$")
	public void verify_next_search_page_should_contain_only_maruti_cars_results_only() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
}
