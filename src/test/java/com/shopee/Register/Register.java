package com.shopee.Register;

import com.shopee.configs.Hooks;
import com.shopee.pages.BasePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Register extends BasePage {

    @SuppressWarnings("rawtypes")
	public AppiumDriver driver;
    /*
     *    Constructor initializes screen elements
     */

    public Register()
    {
        this.driver = new Hooks().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"Logo of CoinDcx\"]/android.widget.Image")
    private MobileElement CoinDcxlogo; 

    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"REGISTER\"]")
    private MobileElement Registerbutton;
    
    @AndroidFindBy(id="com.coindcx:id/main_signin_txt")
    private MobileElement signupheader; 
    
    @AndroidFindBy(id="com.coindcx:id/first_name_input")
    private MobileElement firstname; 
    
    @AndroidFindBy(id="com.coindcx:id/last_name_input")
    private MobileElement lastname; 
    
    @AndroidFindBy(id="com.coindcx:id/email_input")
    private MobileElement email; 
    
    @AndroidFindBy(id="com.coindcx:id/password_input")
    private MobileElement password; 
    
    @AndroidFindBy(id="com.coindcx:id/next_btn")
    private MobileElement next; 
    
    @AndroidFindBy(id="com.coindcx:id/country_input")
    private MobileElement country; 

    @AndroidFindBy(id="com.coindcx:id/phone_no_input")
    private MobileElement phonenumber; 
    
    @AndroidFindBy(id="com.coindcx:id/register")
    private MobileElement siggnupbutton; 
    
    @AndroidFindBy(id="com.coindcx:id/main_signin_txt")
    private MobileElement otpscreenheader; 
    
    @AndroidFindBy(id="com.coindcx:id/tvFirstNameError")
    private MobileElement firstnameerror; 
    
    @AndroidFindBy(id="com.coindcx:id/tvLastNameError")
    private MobileElement lastnameerror; 
    
    @AndroidFindBy(id="com.coindcx:id/tvEmailError")
    private MobileElement emailerror; 
    
    @AndroidFindBy(id="com.coindcx:id/tvPasswordError")
    private MobileElement passworderror; 
 
    @AndroidFindBy(id="com.coindcx:id/tvCountryNameError")
    private MobileElement countrynameerror; 
    
    @AndroidFindBy(id="com.coindcx:id/tvPhoneNumberError")
    private MobileElement phonenumbererror; 
    
    public boolean checkForSignupPage()
    {
        try {
        	Registerbutton.isDisplayed();
            return true;

        }
        catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
    
    
    public void waitForRegisterbutton() 
    {

        waitForVisibilityOf(Registerbutton,driver);
    }
    
    public void close_Banner_afterapplaunch() throws InterruptedException {
    	Thread.sleep(3000);
        new AndroidTouchAction(driver).press(PointOption.point(968, 719)).release().perform();
//    	(new TouchAction(driver)).tap(968, 719).perform();
    }
    public void clickRegisterbutton()

    {
        clickButton(Registerbutton,driver);
    }

    public void verifysignupscreenpage()

    {
    	
       verifytitle("SIGN UP", signupheader);    
		driver.hideKeyboard();

    }
    
    public void verifysignupscreensecondpage()

    {
    	
       verifytitle("SIGN UP", signupheader);    

    }
    
    public void verifyhomescreen()

    {
    	waitForVisibilityOf(CoinDcxlogo, driver);
		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(CoinDcxlogo.isDisplayed());
		System.out.println("softAssert Method Was Executed" +CoinDcxlogo.getText().toString() );  
		
    }
    
    public void enterfirstname(String text) 
    {
    	waitForVisibilityOf(firstname, driver);
        inputText(text, firstname, driver);
    }
    
    public void enterlastname(String text) 
    {
    	waitForVisibilityOf(lastname, driver);
        inputText(text, lastname, driver);
    }
    
    public void enteremail(String text) 
    {
    	waitForVisibilityOf(email, driver);
        inputText(text, email, driver);
    }
    
    public void enterpassword(String text) 
    {
    	waitForVisibilityOf(password, driver);
        inputText(text, password, driver);
    }
    
    public void Nextbutton() 
    {
    	waitForVisibilityOf(next, driver);
        clickButton(next, driver);
    }
    
    public void verifysecondsignupscreen()

    {
    	waitForVisibilityOf(country, driver);
		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(country.isDisplayed());
		System.out.println("softAssert Method Was Executed" +country.getText().toString() );  
		
    }
    
    public void entercountry(String text) throws InterruptedException 
    {
    	waitForVisibilityOf(country, driver);
        inputText(text, country, driver);
        Thread.sleep(1000);
        new AndroidTouchAction(driver).press(PointOption.point(216, 745)).release().perform();

    }
    
    public void enterphonenumber(String text) 
    {
    	waitForVisibilityOf(phonenumber, driver);
        inputText(text, phonenumber, driver);
    }
    
    public void SignUpbutton() 
    {
    	waitForVisibilityOf(siggnupbutton, driver);
        clickButton(siggnupbutton, driver);
    }
    
    public void verifyOtpscreen()

    {
    	waitForVisibilityOf(otpscreenheader, driver);
		SoftAssert softAssertion= new SoftAssert();
		softAssertion.assertTrue(otpscreenheader.isDisplayed());
		System.out.println("softAssert Method Was Executed" +otpscreenheader.getText().toString() );  
		
    }
    
    public void verifyerrorforfirstname() throws Throwable 
    {
    	String expectedError="Enter First Name";
    	System.out.println("Verify that the actual error message is matching the expected one");
		waitForVisibilityOf(firstnameerror, driver);
		String actualError = getText(firstnameerror);
	
		System.out.println("The expected error message is: " + expectedError);
		System.out.println("The actual shown error message is: " + actualError);
		Assert.assertTrue(actualError.equalsIgnoreCase(expectedError),
				"The Test case is Failed, the actual shown error message is: " + actualError
						+ " and it's not matching the expected, which is " + expectedError);
    	Thread.sleep(1000);


    	
    }
    
    public void verifyerrorforlastname() throws Throwable 
    {
    	Thread.sleep(1000);
   	
    	String expectedError="Enter Last Name";
    	System.out.println("Verify that the actual error message is matching the expected one");
		waitForVisibilityOf(lastnameerror, driver);
		String actualError = getText(lastnameerror);
	
		System.out.println("The expected error message is: " + expectedError);
		System.out.println("The actual shown error message is: " + actualError);
		Assert.assertTrue(actualError.equalsIgnoreCase(expectedError),
				"The Test case is Failed, the actual shown error message is: " + actualError
						+ " and it's not matching the expected, which is " + expectedError);
    	Thread.sleep(1000);
 
    	

    }
    
    public void verifyerrorforemail() throws Throwable 
    {
    	Thread.sleep(1000);
       	
    	String expectedError="Enter Email Address";
    	System.out.println("Verify that the actual error message is matching the expected one");
		waitForVisibilityOf(emailerror, driver);
		String actualError = getText(emailerror);
	
		System.out.println("The expected error message is: " + expectedError);
		System.out.println("The actual shown error message is: " + actualError);
		Assert.assertTrue(actualError.equalsIgnoreCase(expectedError),
				"The Test case is Failed, the actual shown error message is: " + actualError
						+ " and it's not matching the expected, which is " + expectedError);
    	Thread.sleep(1000);
    	
    	


    }
    
    public void verifyerrorforpassword() throws Throwable 
    {
    	Thread.sleep(1000);
       	
    	String expectedError="Enter Password";
    	System.out.println("Verify that the actual error message is matching the expected one");
		waitForVisibilityOf(passworderror, driver);
		String actualError = getText(passworderror);
	
		System.out.println("The expected error message is: " + expectedError);
		System.out.println("The actual shown error message is: " + actualError);
		Assert.assertTrue(actualError.equalsIgnoreCase(expectedError),
				"The Test case is Failed, the actual shown error message is: " + actualError
						+ " and it's not matching the expected, which is " + expectedError);
    	Thread.sleep(1000);


    }
    
    public void verifyerrorforcountryname() throws Throwable 
    {
    	Thread.sleep(1000);
       	
    	String expectedError="Enter Country Name";
    	System.out.println("Verify that the actual error message is matching the expected one");
		waitForVisibilityOf(countrynameerror, driver);
		String actualError = getText(countrynameerror);
	
		System.out.println("The expected error message is: " + expectedError);
		System.out.println("The actual shown error message is: " + actualError);
		Assert.assertTrue(actualError.equalsIgnoreCase(expectedError),
				"The Test case is Failed, the actual shown error message is: " + actualError
						+ " and it's not matching the expected, which is " + expectedError);
    	Thread.sleep(1000);


    }
    
    
    public void verifyerrorforphonenumber() throws Throwable 
    {
    	Thread.sleep(1000);
       	
    	String expectedError="Enter Phone Number";
    	System.out.println("Verify that the actual error message is matching the expected one");
		waitForVisibilityOf(phonenumbererror, driver);
		String actualError = getText(phonenumbererror);
	
		System.out.println("The expected error message is: " + expectedError);
		System.out.println("The actual shown error message is: " + actualError);
		Assert.assertTrue(actualError.equalsIgnoreCase(expectedError),
				"The Test case is Failed, the actual shown error message is: " + actualError
						+ " and it's not matching the expected, which is " + expectedError);
    	Thread.sleep(1000);


    }
    
}
