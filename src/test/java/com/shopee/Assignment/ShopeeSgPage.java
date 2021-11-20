package com.shopee.Assignment;

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

public class ShopeeSgPage extends BasePage {

    @SuppressWarnings("rawtypes")
	public AppiumDriver driver;
    /*
     *    Constructor initializes screen elements
     */

    public ShopeeSgPage()
    {
        this.driver = new Hooks().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }


	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(id = "com.shopee.sg:id/btn")
	private MobileElement startbutton;
	
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private MobileElement allowpermissions;

	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Shopee Mall']")
	private MobileElement shopeemall;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[7]/android.widget.ImageView")
	private MobileElement closeaddpopup;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ImageView")
	private MobileElement dropdownshopeemall;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Mobile & Gadgets']")
	private MobileElement mobileandgadjets;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'See All']")
	private MobileElement seeall;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Samsung']")
	private MobileElement samsung;
	
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"REGISTER\"]")
    private MobileElement launch;
    
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"REGISTER\"]")
	public static MobileElement TrendingShopPage;
   
    
    public boolean checkForSignupPage()
    {
        try {
        	launch.isDisplayed();
            return true;

        }
        catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
    
 public void SwipeLeftuntilstrtbutton() {
	 for(int i=0;i<=2;i++){  
			new AndroidTouchAction(driver).press(PointOption.point(1030, 1464))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(80, 1428))
			.release();	 } 
	 }
    
    public void clickonStartButton() {
    	
    	waitForVisibilityOf(startbutton, driver);
    	clickButton(startbutton, driver);
    }
   
  public void clickonAllowPermissions() {
    	
    	waitForVisibilityOf(allowpermissions, driver);
    	clickButton(allowpermissions, driver);
    }
  
    public void clickonshopeemall() {
    	
    	waitForVisibilityOf(shopeemall, driver);
    	clickButton(shopeemall, driver);
    }
    
    
  public void DropDownbuttonShopeemallpage() {
  	
  	waitForVisibilityOf(dropdownshopeemall, driver);
  	clickButton(dropdownshopeemall, driver);
  }
    
  public void closeAddPopUp() {
  	
  	waitForVisibilityOf(closeaddpopup, driver);
  	clickButton(closeaddpopup, driver);
  }
  
  public void ClickonmobileGadjets() {
  	
  	waitForVisibilityOf(mobileandgadjets, driver);
  	clickButton(mobileandgadjets, driver);
  }
  
  
  public void ClickonSeeAll() {
	  	
	  	waitForVisibilityOf(seeall, driver);
	  	clickButton(seeall, driver);
	  }
	  
  public void SwipeUpandClickonSamsungoption() throws InterruptedException {
	  	
	  	
	  	scrollUpToElement(samsung, driver);
	  	waitForVisibilityOf(samsung, driver);
	  	clickButton(samsung, driver);
	  }
  
}
