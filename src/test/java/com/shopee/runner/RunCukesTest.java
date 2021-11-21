package com.shopee.runner;

import com.cucumber.listener.Reporter;
import com.shopee.configs.Hooks;
import com.shopee.utils.ExtentReportGenerator;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.shopee"},
        tags = {"@ShopeeAssigmentsecondway"},


        dryRun = false,
        plugin = {
                "html:target/cucumber-reports/cucumber-pretty",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extent-report/report.html",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "pretty",
                "rerun:target/cucumber-reports/rerun.txt"
        })
public class RunCukesTest {
                      
    private TestNGCucumberRunner testNGCucumberRunner;
    
    public static final String  env=System.getProperty("env");


    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
    	System.setProperty("platform", "android");
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();

    }

    /*
     *   Stop Appium Server Programmatically after the run
     */
    @AfterTest
    public void stopServer() {
        @SuppressWarnings("rawtypes")
		AppiumDriver driver = new Hooks().getDriver();
        AppiumDriverLocalService service = new Hooks().getService();

        if (driver != null) {
            driver.quit();
        }
        if (service != null) {
            service.stop();
        }
    }

    @AfterSuite
    public void generateExtentReport()
    {
        Reporter.loadXMLConfig(ExtentReportGenerator.getReportConfigPath());
    }

}
