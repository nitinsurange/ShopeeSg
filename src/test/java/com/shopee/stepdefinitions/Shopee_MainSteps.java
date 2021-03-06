package com.shopee.stepdefinitions;
import com.shopee.Assignment.ShopeeSgPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;





public class Shopee_MainSteps {
    

	private ShopeeSgPage shopee ;



	@SuppressWarnings("rawtypes")
	public AppiumDriver driver;

	@Given("^user lanuch Shopee SG app$")
	public void user_lanuch_Shopee_SG_app() throws Throwable {
	Thread.sleep(5000);
	}

	@Then("^user Swipe through all tutorial screens$")
	public void user_Swipe_through_all_tutorial_screens() throws Throwable {
		shopee= new ShopeeSgPage();
		shopee.SwipeLeftuntilstrtbutton();
	}

	@Then("^user taps on Start button$")
	public void user_taps_on_Start_button() throws Throwable {
		shopee.clickonStartButton();

	}
	
	@Given("^user Allow permission for location if prompted$")
	public void user_Allow_permission_for_location_if_prompted() throws Throwable {
		shopee.clickonAllowPermissions();
	}

	@Then("^Dismiss the Add popup on landing screen if present$")
	public void dismiss_the_Add_popup_on_landing_screen_if_present() throws Throwable {
		if(shopee.CheckforcloseAddPopUp()==true) 
		{
			shopee.ClickonCancelpopup();
		}else
		{
			System.out.println("Add pop up not displayed");
		}
	}
	

	@Then("^user Clicks on Shopee Mall button from bottom navbar$")
	public void user_Clicks_on_Shopee_Mall_button_from_bottom_navbar() throws Throwable {
		shopee.clickonshopeemall();
	}

	@Then("^user Clicks on Mobile and Gadgets from top header menu$")
	public void user_Clicks_on_Mobile_and_Gadgets_from_top_header_menu() throws Throwable {
		shopee.DropDownbuttonShopeemallpage();
		shopee.ClickonmobileGadjets();
	}

	@Then("^user Clicks on Mobile and Gadgets from top header menu after swiping horizantally$")
	public void user_Clicks_on_Mobile_and_Gadgets_from_top_header_menu_after_swiping_horizantally() throws Throwable {
		shopee.swipeformobilegadgets();
		shopee.ClickonmobileGadjets();

	}
	
	@Then("^user Clicks on See All for Trending Shops$")
	public void user_Clicks_on_See_All_for_Trending_Shops() throws Throwable {
		shopee.ClickonSeeAll();
	}

	@Then("^user swipe up and selects the samsung shop from all trending shops$")
	public void user_swipe_up_and_selects_the_samsung_shop_from_all_trending_shops() throws Throwable {
		shopee.SwipeUpandClickonSamsungoption();

	}

	@Then("^user gets the last active, statusshop, rating and foloowers$")
	public void user_gets_the_last_active_statusshop_rating_and_foloowers() throws Throwable {
		shopee.getvaluesfromsamsungshop();
	}
	




	@Then("^user Taps on Filter  then select Rating  as (\\d+) Stars & Up  Condition as New and Prices Range as Min (\\d+) & Max (\\d+)$")
	public void user_Taps_on_Filter_then_select_Rating_as_Stars_Up_Condition_as_New_and_Prices_Range_as_Min_Max(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(5000);
		shopee.taponFilter();
		shopee.swipeandSelectRating();
		shopee.enterPriceRange( arg2,  arg3);
	}

	@Then("^user Clicks on Apply filter$")
	public void user_Clicks_on_Apply_filter() throws Throwable {
		shopee.clickonApply();
	}

	@Then("^user Gets the Max priced product from list and Click on the product$")
	public void user_Gets_the_Max_priced_product_from_list_and_Click_on_the_product() throws Throwable {
		shopee.getMaxPriceandClickonProduct();
	}

	@Then("^user Swipe left/right on the image preview until the pagination value reaches last page respectively$")
	public void user_Swipe_left_right_on_the_image_preview_until_the_pagination_value_reaches_last_page_respectively() throws Throwable {
		shopee.swipeImagesuntilPagination();
	}

	@Then("^Get the product rating and shipping fee$")
	public void get_the_product_rating_and_shipping_fee() throws Throwable {

		shopee.getProductRatingShippingFee();
	}

	@Then("^Swipe up and Click on Sell All for From the Same Shop Similar Products$")
	public void swipe_up_and_Click_on_Sell_All_for_From_the_Same_Shop_Similar_Products() throws Throwable {
		shopee.clickonSeeAllSameshop();
	}

	@Then("^get the min & max priced products from list$")
	public void get_the_min_max_priced_products_from_list() throws Throwable {
		shopee.getMinMaxProductfromShop();
	}
	
	
}