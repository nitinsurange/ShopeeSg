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
    
    
   
    
 
    
}
