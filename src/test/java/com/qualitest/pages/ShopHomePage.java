package com.qualitest.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qualitest.TestBase.TestBase;

public class ShopHomePage extends TestBase {

	@FindBy(css = ".ellie-thumb-wrapper .woocommerce-LoopProduct-link")
	private List<WebElement> productOverlay;

	@FindBy(css = ".button.product_type_simple")
	private List<WebElement> addToCartButtons;

	@FindBy(xpath = "//a[@title='View cart']")
	private WebElement viewCartIcon;
	
	// Add first four product to cart
	public void selectFourItemAndAddtoCart() {
		for (WebElement element : productOverlay) {
			int i = 0;
			for (WebElement addToCardButton : addToCartButtons) {
				hoverAndClick(element, addToCardButton);
				i++;
				if (i == 4) {
					break;
				}
			}
		 break;
		}
	}

	//click on View card Icon
	public void clickOnViewCartIcon() {
		clickElementByJavascriptExecutor(viewCartIcon);
	}
}
