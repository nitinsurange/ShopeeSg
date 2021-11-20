package com.shopee.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {
	
	
    
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


	

}
