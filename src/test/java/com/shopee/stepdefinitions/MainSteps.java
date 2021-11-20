package com.shopee.stepdefinitions;

import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

import com.shopee.Markets.Markets;
import com.shopee.Register.Register;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;




public class MainSteps {
    

	private Register register ;
	private Markets market ;



	@SuppressWarnings("rawtypes")
	public AppiumDriver driver;

	@Given("^user close the banner once app launch$")
	public void user_close_the_banner_once_app_launch() throws Throwable {
		Register register = new Register();
		register.close_Banner_afterapplaunch();
	}

	@Given("^User navigates to coinDcx signup screen\\.$")
	public void user_navigates_to_coinDcx_signup_screen() throws Throwable {
		
		Register register = new Register();
		register.waitForRegisterbutton();

	}
   
	@Given("^user verify the Home Screen of CoinDcx pro$")
	public void user_verify_the_Home_Screen_of_CoinDcx_pro() throws Throwable {
		Register register = new Register();
		register.verifyhomescreen();
	}
	
	@Then("^user click on register button and verify the sign up screen page$")
	public void user_click_on_register_button_and_verify_the_sign_up_screen_page() throws Throwable {
		Register register = new Register();
		register.clickRegisterbutton();
		register.verifysignupscreenpage();

	}
	
	@Given("^User enters th\"([^\"]*)\" in firstname textfield$")
	public void user_enters_th_in_firstname_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterfirstname(arg1);
	}



	@Given("^User enters the \"([^\"]*)\" in lastname textfield$")
	public void user_enters_the_in_lastname_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterlastname(arg1);
	}

	@Given("^User enters the \"([^\"]*)\" in email textfield$")
	public void user_enters_the_in_email_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enteremail(arg1);
	}

	@Given("^User enters the \"([^\"]*)\" in password textfield$")
	public void user_enters_the_in_password_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterpassword(arg1);
	}
	
	@When("^user clicks on the  NEXT button to proceed$")
	public void user_clicks_on_the_NEXT_button_to_proceed() throws Throwable {
		Register register = new Register();
		register.Nextbutton();
		
	}
	
	@Then("^user will navigate to second signup page which include phone number, referral code and country fields$")
	public void user_will_navigate_to_second_signup_page_which_include_phone_number_referral_code_and_country_fields() throws Throwable {
		Register register = new Register();
		register.verifysecondsignupscreen();
		
	}
	
	@Given("^User enters the \"([^\"]*)\" in Country textfield$")
	public void user_enters_the_in_Country_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.entercountry(arg1);
	}

	@Given("^User enters the \"([^\"]*)\" in PhoneNumber textfield$")
	public void user_enters_the_in_PhoneNumber_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterphonenumber(arg1);
	}
	
	@Then("^user cliks on Sign up button$")
	public void user_cliks_on_Sign_up_button() throws Throwable {
		Register register = new Register();
		register.SignUpbutton();
		
	}

	@Then("^user navigates to OTP verification screen$")
	public void user_navigates_to_OTP_verification_screen() throws Throwable {
		Register register = new Register();
		register.verifyOtpscreen();
	}

	@Given("^User enters the invalid \"([^\"]*)\" in firstname textfield$")
	public void user_enters_the_invalid_in_firstname_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterfirstname(arg1);
	}

	@Given("^User enters the invalid \"([^\"]*)\" in lastname textfield$")
	public void user_enters_the_invalid_in_lastname_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterlastname(arg1);
	}

	@Given("^User enters the invalid \"([^\"]*)\" in email textfield$")
	public void user_enters_the_invalid_in_email_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enteremail(arg1);
	}

	@Given("^User enters the invalid \"([^\"]*)\" in password textfield$")
	public void user_enters_the_invalid_in_password_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterpassword(arg1);
	}

	@Given("^User enters the invalid \"([^\"]*)\" in Country textfield$")
	public void user_enters_the_invalid_in_Country_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.entercountry(arg1);
	}

	@Given("^User enters the invalid \"([^\"]*)\" in PhoneNumber textfield$")
	public void user_enters_the_invalid_in_PhoneNumber_textfield(String arg1) throws Throwable {
		Register register = new Register();
		register.enterphonenumber(arg1);
	}

	@Then("^user verify error message for first name text field\\.$")
	public void user_verify_error_message_for_first_name_text_field() throws Throwable {
		Register register = new Register();
		register.verifyerrorforfirstname();
	}

	@Then("^user verify error message for last name text field\\.$")
	public void user_verify_error_message_for_last_name_text_field() throws Throwable {
		Register register = new Register();
		register.verifyerrorforlastname();
	}

	@Then("^user verify error message for email text field\\.$")
	public void user_verify_error_message_for_email_text_field() throws Throwable {
		Register register = new Register();
		register.verifyerrorforemail();
	}

	@Then("^user verify error message for password text field\\.$")
	public void user_verify_error_message_for_password_text_field() throws Throwable {
		Register register = new Register();
		register.verifyerrorforpassword();
	}

	@Then("^user verify error message for country text field$")
	public void user_verify_error_message_for_country_text_field() throws Throwable {
		Register register = new Register();
		register.verifyerrorforcountryname();
	}

	@Then("^user verify error message for phone number text field$")
	public void user_verify_error_message_for_phone_number_text_field() throws Throwable {
		Register register = new Register();
		register.verifyerrorforphonenumber();
	}
	
	@Then("^user click on MARKETS Tab without login into the app$")
	public void user_click_on_MARKETS_Tab_without_login_into_the_app() throws Throwable {
		Markets market = new Markets();
		market.clickonMArketTab();
	}

	@Then("^verify the narket home screen page which consist TRADE, Margin and Future options at header$")
	public void verify_the_narket_home_screen_page_which_consist_TRADE_Margin_and_Future_options_at_header() throws Throwable {
		Markets market = new Markets();
		market.checkForMarketdetailScreenPage();
	}

	@Then("^Now search for any market under Trade eg BTC: \"([^\"]*)\"$")
	public void now_search_for_any_market_under_Trade_eg_BTC(String arg1) throws Throwable {
		Markets market = new Markets();
		market.searchmarketusingparametergiveninthefeaturefile(arg1);
	}
	

	
	@Then("^It will give six markets for BTC in results$")
	public void it_will_give_six_markets_for_BTC_in_results() throws Throwable {
		Markets market = new Markets();
		market.listingpageaftersearch();
	}

	@Given("^User Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change$")
	public void user_Now_traverse_through_each_market_and_fetch_the_details_like_Volume_price_of_coin_and_price_in_INR_percentage_change() throws Throwable {
		Markets market = new Markets();
		market.fetch_marketdetailonlistingscreen();
	}

	@Then("^User will fetch details for each market and it should not be null value\\.$")
	public void user_will_fetch_details_for_each_market_and_it_should_not_be_null_value() throws Throwable {
		Markets market = new Markets();
		market.fetch_marketdetailsscreenafterclickingonmarketinthelisting();

	}

	@Then("^will take to the detailed market screen$")
	public void will_take_to_the_detailed_market_screen() throws Throwable {
		Markets market = new Markets();
		market.checkForMarketdetailmarketScreenPage();
	}
}