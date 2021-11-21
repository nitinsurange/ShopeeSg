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
import java.util.List;

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
//	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/androidx.viewpager.widget.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[7]/android.widget.ImageView[1]")
	private MobileElement dropdownshopeemall;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Mobile & Gadgets']")
	private MobileElement mobileandgadjets;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'See All']")
	private MobileElement seeall;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.view.ViewGroup[6]//android.widget.ImageView")
	private MobileElement clickondropdowntoselectmobileandgadgetsamsung;
	
	@iOSXCUITFindBy(accessibility = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Samsung']")
	private MobileElement samsung;
	
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"REGISTER\"]")
    private MobileElement launch;
    
    @AndroidFindBy(xpath="//android.view.View[@content-desc=\"REGISTER\"]")
	public static MobileElement TrendingShopPage;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Active')]")
    private MobileElement active;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[ends-with(@text, '/ 5.0')]")
    private MobileElement shop_Rating;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Filter']")
    private MobileElement filter;
   
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = '4 Stars & Up']")
    private MobileElement fourStarUp;
    
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'MIN']")
    private MobileElement minPrice;
    
    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'MAX']")
    private MobileElement maxPrice;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Apply']")
    private MobileElement apply_Btn;
    
    @AndroidFindBy(xpath ="//android.widget.TextView[@text = 'Price']")
    private MobileElement price_filter;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, '$')]")
    private List<MobileElement> max_price;
    
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
		 swipeRight(driver);
 	 } 

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
    
  public boolean CheckforcloseAddPopUp() {
  	
	  try {
		  closeaddpopup.isDisplayed();
          return true;

      }
      catch (NoSuchElementException | TimeoutException e) {
          return false;
      }
	  
  }
  public void ClickonCancelpopup() {
	  	
		waitForVisibilityOf(closeaddpopup, driver);
		clickButton(closeaddpopup, driver);
	  }
	    

  
  public void ClickonmobileGadjets() {
  	
  	waitForVisibilityOf(mobileandgadjets, driver);
  	clickButton(mobileandgadjets, driver);
  }
  
  public void swipeformobilegadgets() throws InterruptedException {
	  
	  Thread.sleep(2000);	
	  if(isDisplayedAfterWait(mobileandgadjets, 2)==false) {
		  (new TouchAction(driver)).press(PointOption.point(863,346))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
			.moveTo(PointOption.point(235,350)).release().perform();
//		  swipelefthorizontaluntilmobilegadgets();
		    
	  }else {
		  (new TouchAction(driver)).press(PointOption.point(863,346))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
			.moveTo(PointOption.point(235,350)).release().perform();
//		  swipelefthorizontaluntilmobilegadgets(); 
	  }

	  }
  
  public void ClickonSeeAll() {
	  	
	  	waitForVisibilityOf(seeall, driver);
	  	clickButton(seeall, driver);
	  }
	  
  public void SwipeUpandClickonSamsungoption() throws InterruptedException {
	  
	 
	  scrollUntilTextClick(driver, "Samsung");
	  
	  clickButton(samsung, driver);
	  
//	  	scrollUpToElement(samsung, driver);
//	  	waitForVisibilityOf(samsung, driver);
//	  	clickButton(samsung, driver);

	  
	 // get the 'last active status', 'shop rating' and 'Followers'
	  
	  String last_Active_Status = getText(active);
	  
	  String shopRating = getText(shop_Rating);
	  
	  System.out.println("last_Active_Status:"+last_Active_Status);
	  
	  System.out.println("shopRating:"+shopRating);
	  
	 
	  
	  }
  
  

public void taponFilter() {
	waitForVisibilityOf(filter, driver);
	clickButton(filter, driver);
}

@SuppressWarnings("rawtypes")
public void swipeandSelectRating() throws InterruptedException {

     swipefilterpage();

}

public void enterPriceRange(int amount1, int amount2) {

	waitForVisibilityOf(minPrice, driver);
	
	inputText(String.valueOf(amount1), minPrice, driver);
	
	inputText(String.valueOf(amount2), maxPrice, driver);
	
}

public void clickonApply() {
	clickButton(apply_Btn, driver);
	
}

public void getMaxPriceandClickonProduct() {
	
	waitForAvailabilityOf(price_filter, driver);
	clickButton(price_filter, driver);
	//waitForAvailabilityOf(price_filter, driver);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickButton(price_filter, driver);
	
	System.out.println("max price::"+max_price.get(1));
	
	waitForAvailabilityOf(max_price.get(1), driver);
	clickButton(max_price.get(1), driver);
	
}








}
