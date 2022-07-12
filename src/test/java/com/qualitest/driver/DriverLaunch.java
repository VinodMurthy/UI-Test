package com.qualitest.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.qualitest.utlity.ReadProperties;

public class DriverLaunch {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	 public static void initializeDriver(){
	        driver.set(Driver.getDriver());
	        driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get().manage().window().maximize();
	    }
	 
	 public static WebDriver getDriver(){
	        if (driver.get() == null){
	            initializeDriver();
	        }
	        return driver.get();
	    }
	 

	    public static void teatDown(){
	        driver.get().manage().deleteAllCookies();
	        getDriver().quit();
	    }
	    
	    public static void open() {
	        driver.get().get(ReadProperties.getFromPropertyFile("base_URL"));
	    }
}
