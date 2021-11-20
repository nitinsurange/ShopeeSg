package com.shopee.configs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import com.cucumber.listener.Reporter;
import com.shopee.Assignment.Shopee;
import com.shopee.utils.CapsJsonParser;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;


@SuppressWarnings("rawtypes")
public class Hooks {

    private static ThreadLocal<AppiumDriverLocalService> service = new ThreadLocal<>();

    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    public AppiumDriver getDriver() {
        driver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    return driver.get();
    }

    public AppiumDriverLocalService getService() {
        return service.get();
    }

    /*
     *   Start Appium Server Programmatically before each scenario
     */
    
    // @Before, @After are called Global tagged hooks
    @Before
    public void startServer() {
    	System.out.println("Any Queries then Email Me " + "NitinSurange@hlbb.hongleong.com.my");
        AppiumServiceBuilder appiumServiceBuilder = new AppiumServiceBuilder()
                .withAppiumJS(new File("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1");
        service.set(appiumServiceBuilder.build());
        service.get().start();
//        /Applications/Appium.app/Contents/Resources/app/node_modules/es6-mapify/build/lib/main.js
        if (service == null || !service.get().isRunning()) {
            throw new AppiumServerHasNotBeenStartedLocallyException("An Appium server node is not started!");
        }

        if(driver.get()==null) {
            setDriver();
        }
        else
            if(!new Shopee().checkForSignupPage())
            {
                setDriver();
            }
    	System.out.println(service.toString() +appiumServiceBuilder.toString());
    	System.out.println("CoinDCx Team Let me know if you have any questions " + "niteshsurange@gmail.com");


    }

    public boolean setDriver()
    {
    	 DesiredCapabilities capabilities = new DesiredCapabilities();
    	 if(System.getProperty("platform").equalsIgnoreCase("ios")) {
    		
             capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
             capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, (String) CapsJsonParser.getJSONObjectValue("ios").get("platformVersion"));
             capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, (String) CapsJsonParser.getJSONObjectValue("ios").get("deviceName"));
             capabilities.setCapability(MobileCapabilityType.UDID, (String) CapsJsonParser.getJSONObjectValue("ios").get("udid"));
             capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, (String) CapsJsonParser.getJSONObjectValue("ios").get("automationName"));
             capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, (String) CapsJsonParser.getJSONObjectValue("ios").get("autoAcceptAlerts")); 
             capabilities.setCapability(IOSMobileCapabilityType.CONNECT_HARDWARE_KEYBOARD, (String) CapsJsonParser.getJSONObjectValue("ios").get("connectHardwareKeyboard"));  
             capabilities.setCapability(IOSMobileCapabilityType.SHOW_XCODE_LOG, true);
             capabilities.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, (String) CapsJsonParser.getJSONObjectValue("ios").get("xcodeSigningId"));
             capabilities.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, (String) CapsJsonParser.getJSONObjectValue("ios").get("xcodeOrgId"));
             capabilities.setCapability(IOSMobileCapabilityType.RESET_ON_SESSION_START_ONLY, (String) CapsJsonParser.getJSONObjectValue("ios").get("resetOnSessionStartOnly"));  
             capabilities.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, (String) CapsJsonParser.getJSONObjectValue("ios").get("resetOnSessionStartOnly"));  
             capabilities.setCapability(IOSMobileCapabilityType.UPDATE_WDA_BUNDLEID, (String) CapsJsonParser.getJSONObjectValue("ios").get("updatedWDABundleId"));            
//             String ipaAbsolutePath = new File((String) CapsJsonParser.getJSONObjectValue("ios").get("app")).getAbsolutePath();
//             capabilities.setCapability(MobileCapabilityType.APP, ipaAbsolutePath); 
             capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, (String) CapsJsonParser.getJSONObjectValue("ios").get("bundleId"));  
             driver.set(new IOSDriver<IOSElement>(service.get().getUrl(), capabilities));
             System.out.println("Don't Worry Nitin___device connected.");

         }
        else        
        if(System.getProperty("platform").equalsIgnoreCase("Android")) {
        	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, (String) CapsJsonParser.getJSONObjectValue("android").get("platformVersion"));
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, (String) CapsJsonParser.getJSONObjectValue("android").get("deviceName"));
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, (String) CapsJsonParser.getJSONObjectValue("android").get("automationName"));
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, (String) CapsJsonParser.getJSONObjectValue("android").get("appPackage"));
            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, (String) CapsJsonParser.getJSONObjectValue("android").get("appActivity"));
            capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, (String) CapsJsonParser.getJSONObjectValue("android").get("autoGrantPerrmisions"));
//            String apkAbsolutePath = new File((String) CapsJsonParser.getJSONObjectValue("android").get("app")).getAbsolutePath();
//            capabilities.setCapability(MobileCapabilityType.APP, apkAbsolutePath);
            driver.set(new AndroidDriver<AndroidElement>(service.get().getUrl(), capabilities));
    		System.out.println("Don't Worry Nitin___device connected.");
    		capabilities.setCapability("fullReset", true);



        }
        	
		return false;
		
    }
		
    
    
   @AfterTest  
    public void closedriver() {
		AppiumDriver driver = new Hooks().getDriver();

        driver.quit();
    }
}

