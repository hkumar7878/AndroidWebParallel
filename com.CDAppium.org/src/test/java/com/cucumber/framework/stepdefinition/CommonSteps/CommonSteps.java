package com.cucumber.framework.stepdefinition.CommonSteps;

import org.apache.log4j.Logger;


import com.cucumber.framework.Helper.Logger.LoggerHelper;
import com.cucumber.framework.Helper.TestBase.TestBase;
import com.cucumber.framework.configreader.ObjectRepo;

import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;

public class CommonSteps {
	
	private final Logger log= LoggerHelper.getLogger(CommonSteps.class);
	 TestBase testBaseObj;
	 public AppiumDriver driver;
	 
	@Given("^navigate to web site$")
	public void navigate_to_web_site() throws Throwable {
		try
		{
			//TestBase.driver.get(ObjectRepo.reader.getWebSite());
			driver=testBaseObj.driver;
			driver.get(ObjectRepo.reader.getWebSite());
			System.out.println("..............Inside Common method execution.....");
		
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	  
	}
}
