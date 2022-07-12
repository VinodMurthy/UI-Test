package com.qualitest.StepDef;

import com.qualitest.driver.DriverLaunch;
import com.qualitest.pages.CartPage;
import com.qualitest.pages.ShopHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class KatalonShopKatalonEcommerceStepDef {

	ShopHomePage katalonShopKatalonEcommercePage = new ShopHomePage();
	CartPage cartpage = new CartPage();

	@Given("I launch Katalon Shop Katalon Ecommerce website")
	public void i_launch_katalon_shop_katalon_ecommerce_website() {
		DriverLaunch.open();
	}

	@When("I add four Random items to my cart")
	public void i_add_four_random_items_to_my_cart() throws InterruptedException {
		katalonShopKatalonEcommercePage.selectFourItemAndAddtoCart();
	}

	@When("I view my cart")
	public void i_view_my_cart() throws InterruptedException {
		katalonShopKatalonEcommercePage.clickOnViewCartIcon();
	}

	@Then("I find total four items listed in my cart")
	public void i_find_total_four_items_listed_in_my_cart() {
		Assert.assertEquals("add to Card page is not displayed", cartpage.getPageTitleTextBlock(), "Cart");
		Assert.assertEquals("Number of items count is mismatch", cartpage.getItemsGridListCount().size(), 4);
	}

	@When("I am able to remove the lowest price item from my cart")
	public void i_am_able_to_remove_the_lowest_price_item_from_my_cart() {
		cartpage.removelowestAmountCloth();
	}

	@Then("I am able to verfiy three items in my cart")
	public void i_am_able_to_verfiy_three_items_in_my_cart() {
		Assert.assertEquals("add to Card page is not displayed", cartpage.getPageTitleTextBlock(), "Cart");
		Assert.assertEquals("Number of items count is mismatch", cartpage.getItemsGridListCount().size(), 3);
	}
}
