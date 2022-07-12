package com.qualitest.TestBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualitest.driver.DriverLaunch;

public class TestBase {

	protected static WebDriver driver = DriverLaunch.getDriver();

	public TestBase() {
		PageFactory.initElements(driver, this);
	}

	protected void setTextAs(WebElement element, String text) {
		element.sendKeys(text);
	}

	protected void clearElement(WebElement element) {
		element.clear();
	}

	protected void clickElement(WebElement element) {
		element.click();
	}

	protected void clickElementByJavascriptExecutor(WebElement element) {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click()", element);
	}

	protected void clickLink(WebElement element) {
		element.click();
	}

	protected String getText(WebElement element) {
		return element.getText();
	}

	protected void hoverAndClick(WebElement element, WebElement subelement) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		action.moveToElement(subelement).click().build().perform();
		implicitWait();
	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
	protected void  implicitWait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
}
