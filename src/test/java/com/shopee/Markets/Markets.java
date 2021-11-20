package com.shopee.Markets;

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

public class Markets extends BasePage {

    @SuppressWarnings("rawtypes")
	public AppiumDriver driver;
    /*
     *    Constructor initializes screen elements
     */

    public Markets()
    {
        this.driver = new Hooks().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"MARKETS\"]/android.widget.TextView")
    private MobileElement MarketsTab; 

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.widget.Button[1]")
    private MobileElement Trade;
    
    @AndroidFindBy(xpath="//android.widget.EditText")
    private MobileElement searchcoins; 
    
    @AndroidFindBy(xpath="//android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]")
    private MobileElement pricedetailUSDforfirstmarket; 
    
//    //android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]
 
    @AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]")
    private MobileElement pricedetailUSDforfirstmarketdetailmarketscreen; 
    
    @AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]")
    private MobileElement pricedetailINRforfirstmarketdetailmarketscreen; 
    
    @AndroidFindBy(xpath="//android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]")
    private MobileElement pricedetailINRforfirstmarket; 
    
//    //android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[4]
    
    @AndroidFindBy(xpath="//android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View")
    private MobileElement twentyfourhChangeforfirstmarket; 
   
//    //android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[5]/android.view.View[1]
    
    @AndroidFindBy(xpath="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.TextView[1]")
    private MobileElement twentyfourhChangeforfirstmarketdetailscreen; 
    
    @AndroidFindBy(xpath="//android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]")
    private MobileElement volumeforfirstmarket; 
    
    @AndroidFindBy(xpath="//android.view.View[2]/android.view.View[3]")
    private MobileElement volumeforfirstmarketdetailscreen; 
    
   public void clickonMArketTab() {
	   waitForVisibilityOf(MarketsTab, driver);
	   clickButton(MarketsTab, driver);
   }
    
    public boolean checkForMarketdetailScreenPage()
    {
        try {
        	Trade.isDisplayed();
            return true;

        }
        catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
    
    
    public boolean checkForMarketdetailmarketScreenPage()
    {
        try {
        	pricedetailINRforfirstmarketdetailmarketscreen.isDisplayed();
            return true;

        }
        catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
    
public void fetch_marketdetailonlistingscreen() {
	System.out.println("Price value in USD for BTC first list market is " + pricedetailUSDforfirstmarket.getText().toString());
	System.out.println("Price value in INR for BTC first list market is " + pricedetailINRforfirstmarket.getText().toString());
	System.out.println("Volume for BTC first list market is " + volumeforfirstmarket.getText().toString());
	System.out.println("24 h change for BTC first list market is " + twentyfourhChangeforfirstmarket.getText().toString());

}
    
public void fetch_marketdetailsscreenafterclickingonmarketinthelisting() {
	clickButton(pricedetailINRforfirstmarket, driver);
	waitForVisibilityOf(volumeforfirstmarketdetailscreen, driver);
	try{
	System.out.println("Volume for BTC first list market in detail screen of market is " + volumeforfirstmarketdetailscreen.getText().toString());
	System.out.println("24 h change for BTC first list market in detail screen of market is " + twentyfourhChangeforfirstmarketdetailscreen.getText().toString());
	System.out.println("Price value in USD for BTC first list market is " + pricedetailUSDforfirstmarketdetailmarketscreen.getText().toString());
	System.out.println("Price value in INR for BTC first list market is " + pricedetailINRforfirstmarketdetailmarketscreen.getText().toString());

	}catch(NoSuchElementException e) {
		System.out.println(e);
	}



} 
    
    public void searchmarketusingparametergiveninthefeaturefile(String text) 
    {
    	waitForVisibilityOf(searchcoins, driver);
        inputText(text, searchcoins, driver);
    }
    

   public boolean listingpageaftersearch()
   {
       try {
       	pricedetailINRforfirstmarket.isDisplayed();
           return true;

       }
       catch (NoSuchElementException | TimeoutException e) {
           return false;
       }
   }
}
