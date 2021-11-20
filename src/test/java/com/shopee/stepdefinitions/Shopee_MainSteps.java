package com.shopee.stepdefinitions;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

import com.shopee.Assignment.ShopeeSgPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;




public class Shopee_MainSteps {
    

	private ShopeeSgPage shopee ;



	@SuppressWarnings("rawtypes")
	public AppiumDriver driver;

	@Given("^user lanuch Shopee SG app$")
	public void user_lanuch_Shopee_SG_app() throws Throwable {
	Thread.sleep(5000);
	}

	@Then("^user Swipe through all tutorial screens and tap on START button$")
	public void user_Swipe_through_all_tutorial_screens_and_tap_on_START_button() throws Throwable {

		
		shopee= new ShopeeSgPage();
		shopee.SwipeLeftuntilstrtbutton();
		shopee.clickonStartButton();
	}

	@Given("^user Allow permission for location if prompted$")
	public void user_Allow_permission_for_location_if_prompted() throws Throwable {
		shopee.clickonAllowPermissions();
	}

	@Then("^Dismiss the Add popup in landing screen$")
	public void dismiss_the_Add_popup_in_landing_screen() throws Throwable {
//		shopee.closeAddPopUp();
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

	@Then("^user Clicks on See All for Trending Shops$")
	public void user_Clicks_on_See_All_for_Trending_Shops() throws Throwable {
		shopee.ClickonSeeAll();
	}

	@Then("^Swipe up and select Samsung then get the last active statusshop rating and Followers$")
	public void swipe_up_and_select_Samsung_then_get_the_last_active_statusshop_rating_and_Followers() throws Throwable {
		shopee.SwipeUpandClickonSamsungoption();
	}

	@Then("^user Taps on Filter  then select Rating  as (\\d+) Stars & Up  Condition as New and Prices Range as Min (\\d+) & Max (\\d+)$")
	public void user_Taps_on_Filter_then_select_Rating_as_Stars_Up_Condition_as_New_and_Prices_Range_as_Min_Max(int arg1, int arg2, int arg3) throws Throwable {
	 
	}

	@Then("^user Clicks on Apply filter$")
	public void user_Clicks_on_Apply_filter() throws Throwable {
	  
	}

	@Then("^user Gets the Max priced product from list and Click on the product$")
	public void user_Gets_the_Max_priced_product_from_list_and_Click_on_the_product() throws Throwable {
	  
	}

	@Then("^user Swipe left/right on the image preview until the pagination value reaches last page respectively$")
	public void user_Swipe_left_right_on_the_image_preview_until_the_pagination_value_reaches_last_page_respectively() throws Throwable {

	}

	@Then("^Get the product rating and shipping fee$")
	public void get_the_product_rating_and_shipping_fee() throws Throwable {
	   
	}

	@Then("^Swipe up and Click on Sell All for From the Same Shop Similar Products$")
	public void swipe_up_and_Click_on_Sell_All_for_From_the_Same_Shop_Similar_Products() throws Throwable {
	  
	}

	@Then("^get the min & max priced products from list$")
	public void get_the_min_max_priced_products_from_list() throws Throwable {
	 
	}
}