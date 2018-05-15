package com.cucumber.framework.stepdefinition.NewCar;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_01 {
	private final Logger log= LoggerHelper.getLogger(TC_01.class);
	
	TestBase testbaseObj= new TestBase();

	@Then("^verify New Cars button$")
	public void verify_New_Cars_button() throws Throwable {
		Thread.sleep(3000);
		WebElement btn=TestBase.driver.findElement(By.xpath("//a[@class='fab new']"));
		System.out.println();
		Thread.sleep(3000);
		
	    
	}

}
