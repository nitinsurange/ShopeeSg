package com.shopee.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.shopee.Assignment.ShopeeSgPage;

import java.time.Duration;

public class BasePage {
	@SuppressWarnings("rawtypes")
	protected static AppiumDriver driver;

	public void swipeLeft(@SuppressWarnings("rawtypes") AppiumDriver driver) {
		
		Dimension size = driver.manage().window().getSize();
		int endx = (int) (size.width * 0.9);
		int startx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		if (System.getProperty("platform").equalsIgnoreCase("android")) {
			new AndroidTouchAction(driver).press(PointOption.point(startx, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endx, starty))
					.release();
		} else {
			new IOSTouchAction(driver).press(PointOption.point(startx, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endx, starty))
					.release();
		}
	}
	
	
	public static void scrollUpToElement(MobileElement mobileElement, @SuppressWarnings("rawtypes") AppiumDriver driver) throws InterruptedException {
		System.out.println("Checking scoll");
		int count = 0;
		while (!isDisplayedAfterWait(mobileElement, 3)) {
			// scroll up
			swipeDown();
			count++;
			if (count == 10) {
				System.out.println("Element not found");
				break;
			}
		}
		BasePage.waitForPageToLoad();
	}
	
	public static void swipeDown() {
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.getWidth() / 2);
		int endy = (int) (size.getHeight() * 0.60);
		int startx = size.getWidth() / 2;
		if (System.getProperty("platform").equalsIgnoreCase("android")) {
			swipeAndroid(driver, startx, starty, startx, endy);
		} else {
			swipeiOS(driver, startx, starty, startx, endy);
		}		
	}
	
	public static boolean isDisplayedAfterWait(WebElement locator, int timestamp) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timestamp);
			wait.until(ExpectedConditions.visibilityOf(locator));
			boolean value = locator.isDisplayed();
			if (value) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
    
	public static void waitForPageToLoad() throws InterruptedException {
		if (System.getProperty("platform").equalsIgnoreCase("android")) {
			int count = 0;
			while (BasePage.isDisplayedAfterWait(ShopeeSgPage.TrendingShopPage, 3) && count < 30) {
				// while
				// (BasePageActions.isElementDisplayed(driver.findElement(By.id("com.shaadi.android:id/progress_bar")))
				// && count < 30) {

				System.out.println("Waiting for page to load...");
				Thread.sleep(1000);
				count++;
			}
			if (count == 30) {
				System.out.println("Timeout while waiting for page to load...");
			}
		}

	}
	
	public static void swipeUp(@SuppressWarnings("rawtypes") AppiumDriver driver) {
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.20);
		int endy = (int) (size.height * 0.9);
		int startx = size.width / 2;
			swipeAndroid(driver, startx, starty, startx, endy);
	
	}
	@SuppressWarnings("rawtypes")
	public static void swipefilterpage(AppiumDriver driver) throws InterruptedException {
	    // 14. Make a Swipe gesture from ('609','1989') to ('629','812')
	    (new TouchAction(driver)).press(PointOption.point(609,1989))
	        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
	        				.moveTo(PointOption.point(629,812)).release().perform();
	}
	
	public static void swipeAndroid(@SuppressWarnings("rawtypes") AppiumDriver driver, int startx, int starty, int endx,
			int endy) {
		new AndroidTouchAction(driver).press(PointOption.point(startx, starty))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).moveTo(PointOption.point(endx, endy))
				.release().perform();
	}
	public static void swipeiOS(@SuppressWarnings("rawtypes") AppiumDriver driver, int startx, int starty, int endx,
			int endy) {
		new IOSTouchAction(driver).press(PointOption.point(startx, starty))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endx, endy))
				.release().perform();
	}
    public void inputText(String inputText, MobileElement mobileElement,@SuppressWarnings("rawtypes") AppiumDriver driver) {
        mobileElement.clear();
        mobileElement.sendKeys(inputText);
        if(driver.getKeyboard()!=null)
        {
        closeKeyboard(driver);
        }
    }

    @SuppressWarnings("deprecation")
	public void inputText_enablekeyboard(String inputText, MobileElement mobileElement,@SuppressWarnings("rawtypes") AppiumDriver driver) {

        waitForVisibilityOf(mobileElement,driver);
        mobileElement.click();

        driver.getKeyboard().sendKeys(inputText);
    	
    	if(driver.getKeyboard()!=null)
        {
        closeKeyboard(driver);
        }
    }

    
    public void clickButton(MobileElement mobileElement,@SuppressWarnings("rawtypes") AppiumDriver driver)
    {
      waitForVisibilityOf(mobileElement,driver);
      mobileElement.click();
    }

    public String getText(MobileElement mobileElement)
    {
        return mobileElement.getText();
    }

    protected void waitForVisibilityOf(MobileElement mobileElement, @SuppressWarnings("rawtypes") AppiumDriver driver) {
        WebDriverWait webDriverWait = new WebDriverWait(driver,50);
        webDriverWait.until(ExpectedConditions.visibilityOf(mobileElement));
    }
    
      

    protected void waitForAvailabilityOf(MobileElement mobileElement, @SuppressWarnings("rawtypes") AppiumDriver driver) {
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(mobileElement));
    }

    protected void waitForVisibilityOfShort(MobileElement mobileElement, @SuppressWarnings("rawtypes") AppiumDriver driver) {
        WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        webDriverWait.until(ExpectedConditions.visibilityOf(mobileElement));
    }

	public void verifytitle(String expectedtitle, MobileElement element) {
		System.out.println("Verify that the actual title message is matching the expected one");
		String actualtitle = getText(element);
		System.out.println("The expected title  is: " + expectedtitle);
		System.out.println("The actual shown tilte  is: " + actualtitle);
		Assert.assertTrue(actualtitle.equalsIgnoreCase(expectedtitle),
				"The Test case is Failed, the actual shown title message is: " + actualtitle
						+ " and it's not matching the expected, which is " + expectedtitle);
	}
	
    protected void closeKeyboard(@SuppressWarnings("rawtypes") AppiumDriver driver)
    {
        if(driver.getKeyboard()!=null)
        {
            if(System.getProperty("platform").equalsIgnoreCase("ios"))
            {
                try {

                    MobileElement doneToolBarButton =(MobileElement) driver.findElement(By.id("Done"));
                    if(doneToolBarButton.isDisplayed())
                    {
                        doneToolBarButton.click();
                    }
                }
                catch(NoSuchElementException | TimeoutException e) {

                    System.err.println("---------- Skipping clicking Done Button as its not present ----------- ");
                }
            }
            else
            {
                driver.hideKeyboard();
            }
        }
    }


    public void swipeRight(@SuppressWarnings("rawtypes") AppiumDriver driver) {
		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.9);
		int endx = (int) (size.width * 0.20);
		int starty = size.height / 2;
		if (System.getProperty("platform").equalsIgnoreCase("android")) {
			new AndroidTouchAction(driver).press(PointOption.point(startx, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endx, starty))
					.release().perform();
		} else {
			new IOSTouchAction(driver).press(PointOption.point(startx, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(endx, starty))
					.release().perform();
		}
	}
    
public void scrollUntilTextClick(AppiumDriver driver, String elementText) {
		
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ elementText + "\").instance(0))"))
				.click();
		;

	}





  }



