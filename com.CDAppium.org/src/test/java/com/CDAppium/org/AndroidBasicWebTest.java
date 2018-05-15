package com.CDAppium.org;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class AndroidBasicWebTest {
	WebDriver driver;
	
@Test
	
	public void test1() throws MalformedURLException, InterruptedException
	{
		
		try{
		DesiredCapabilities cap= DesiredCapabilities.android();
		cap.setCapability("no", true);
		cap.setCapability("pageLoadStrategy", "none");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		cap.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "My Phone");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.VERSION, "7.0");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver= new AndroidDriver(url,cap);
		driver.get("https://www.cardekho.com/");
		Thread.sleep(4000);
		
		WebElement btn=driver.findElement(By.xpath("//a[@class='fab new']"));
		if(btn.isDisplayed())
		{
			btn.click();
			System.out.println("Advance btn is displayed");
			btn.click();
		}
		
		else
		{
			System.out.println("Btn is not displayed");
		}
		Thread.sleep(4000);
		
		}
		
		catch(Exception e)
		{
			e.getMessage();
		}
	}
		@AfterMethod()
		public void a() throws InterruptedException
		{
			Thread.sleep(10000);
			driver.quit();
		}
	}



