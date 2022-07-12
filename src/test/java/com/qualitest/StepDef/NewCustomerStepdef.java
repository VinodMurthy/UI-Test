package com.qualitest.StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qualitest.Hooks.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewCustomerStepdef {
	
	WebDriver driver;
	
	
//	public void browserSetup() {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.get("https://demo.guru99.com/");
//		driver.manage().window().maximize();
//	}
//	
//	@After
//	public void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//
//	}
	
	
	@Given("I login guru99 bank application")
	public void i_login_guru99_bank_application() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/");
		
		Assert.assertTrue(true);
	  
	}

	@When("I navigate to new customer page and craete new customer")
	public void i_navigate_to_new_customer_page_and_craete_new_customer() {
		Assert.assertTrue(true);
	}

	@Then("I should see succesfull message")
	public void i_should_see_succesfull_message() {
		Assert.assertTrue(true);
	}

}
