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
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
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
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'S']")
	private MobileElement s;

	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, '1/')]")
	private MobileElement paginationNo;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")
	private MobileElement product_Rating;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")
	private MobileElement shipping_fee;

	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, '$')]")
	private List<MobileElement> product_prices;
	
	
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
	  
	  waitForVisibilityOf(s, driver);
		clickButton(s, driver);

		// waitForVisibilityOf(samsung, driver);
		Thread.sleep(15000);
//		if(!isDisplayedAfterWait(samsung, 3)) {
//			for(int i=0;i<=2;i++) {
				
		
				  try {
						waitForVisibilityOf(samsung, driver);
						clickButton(samsung, driver);

			        }
			        catch (StaleElementReferenceException | TimeoutException e) {
			        }
//			}
//			else {
//				
//		
//		}
		

	 
//	  scrollUntilTextClick(driver, "Samsung");
//	  
//	  clickButton(samsung, driver);
	  
//	  	scrollUpToElement(samsung, driver);
//	  	waitForVisibilityOf(samsung, driver);
//	  	clickButton(samsung, driver);

	  
	 // get the 'last active status', 'shop rating' and 'Followers'
	  
	  String last_Active_Status = getText(active);
	  
	  String shopRating = getText(shop_Rating);
	  
	  System.out.println("last_Active_Status:"+last_Active_Status);
	  
	  System.out.println("shopRating:"+shopRating);
	  
	 
	  
	  }
  
  

public void taponFilter() throws InterruptedException {
	waitForVisibilityOf(filter, driver);
	clickButton(filter, driver);
	Thread.sleep(5000);
}

@SuppressWarnings("rawtypes")
public void swipeandSelectRating() throws InterruptedException {

     swipefilterpage(driver);

     waitForAvailabilityOf(fourStarUp, driver);
		clickButton(fourStarUp, driver);
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
	// waitForAvailabilityOf(price_filter, driver);
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	clickButton(price_filter, driver);

	waitForAvailabilityOf(max_price.get(1), driver);
	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String maxprice = getText(max_price.get(1));

	System.out.println("max price::" + maxprice);

	clickButton(max_price.get(1), driver);
	
}

public void swipeImagesuntilPagination() {

	String pagination = getText(paginationNo);
	String[] values = pagination.split("/");
	System.out.println(values[0]);

	System.out.println(values[1]);

	int totalPagNo = Integer.parseInt(values[1]);
	System.out.println("Total pagination No::" + totalPagNo);

	for (int i = 0; i <= totalPagNo; i++) {
		swipeAndroid(driver, 916, 598, 145, 598);
	}

}

public void getProductRatingShippingFee() throws InterruptedException {

	String productRating = getText(product_Rating);
	System.out.println("productRating:" + productRating);

	swipeAndroid(driver, 550, 1943, 550, 700);
    Thread.sleep(6000);
	waitForVisibilityOf(shipping_fee, driver);
	String ShippingFee = getText(shipping_fee);
	System.out.println("ShippingFee:" + ShippingFee);

}

public void clickonSeeAllSameshop() {

	swipeAndroid(driver, 550, 1943, 550, 1201);
	waitForVisibilityOf(seeall, driver);
	clickButton(seeall, driver);
}

public void getMinMaxProductfromShop() {

	String endText = "No more products found.";

	ArrayList<String> productPricesList = new ArrayList<String>();

	while (getItems(endText).size() == 0) {

		for (int i = 0; i < product_prices.size(); i++) {

			String eleText = getText(product_prices.get(i));

			productPricesList.add(eleText);
		}

		swipeAndroid(driver, 550, 2000, 550, 380);
	}

	if (getItems(endText).size() > 0) {
		String text = getItems(endText).get(0).getText();
		System.out.println("User Navigated till the text: " + text);
		getItems(endText).get(0).click();
	}

	System.out.println("printing all product prices");
	System.out.println("Before::::");
	for (int j = 0; j < productPricesList.size(); j++) {

		System.out.println(productPricesList.get(j));
	}

	// get prices contains tilde and remove contains tilde
	for (int j = 0; j < productPricesList.size(); j++) {

		if (productPricesList.get(j).contains("~")) {
			String splPrice = productPricesList.get(j);
			String[] values = splPrice.split("~");
			productPricesList.add(values[1]);
			productPricesList.remove(productPricesList.get(j));
		}
	}
	System.out.println(" ");
	System.out.println("After::::");
	for (int j = 0; j < productPricesList.size(); j++) {

		System.out.println(productPricesList.get(j));
	}

}

@SuppressWarnings("unchecked")
public List<MobileElement> getItems(String endText) {
	return driver.findElements(By.xpath("//*[@text='" + endText + "']"));
}



}
