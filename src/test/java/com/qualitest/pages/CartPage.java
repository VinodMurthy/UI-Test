package com.qualitest.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qualitest.TestBase.TestBase;

public class CartPage extends TestBase {

	private List<Double> priceList;

	@FindBy(css = ".product-price .woocommerce-Price-amount")
	private List<WebElement> amountPrice;

	@FindBy(css = ".woocommerce-cart-form__cart-item")
	private List<WebElement> itemsGrid;

	@FindBy(css = ".page-title")
	private WebElement pageTittleTextBlock;

	// sort the amount based on ascending order and remove the lowest price product
	public void removelowestAmountCloth() {
		priceList = new ArrayList<>();
		for (WebElement p : amountPrice) {
			priceList.add(Double.valueOf(p.getText().replace("$", "")));
		}
		Collections.sort(priceList);
		clickElement(lowestAmountWebelement());
		sleep(4000);
	}

	// Return list of items grid web element
	public List<WebElement> getItemsGridListCount() {
		return itemsGrid;
	}

	// Return page title web element
	public String getPageTitleTextBlock() {
		return getText(pageTittleTextBlock);
	}

	// Return lowest price amount close button
	public WebElement lowestAmountWebelement() {
		return driver.findElement(
				By.xpath("//span[contains(text(),'" + priceList.get(0) + "')]/ancestor::tr//a[@class='remove']"));
	}
}
