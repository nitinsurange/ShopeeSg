
 Feature: Mobile App automation assignment
 #1. Develop a test framework for automating Coindcx Pro Android app using preferably Appium+Java+Testng. 
#a. Signup Flow: 
#● Automate the Signup flow covering both negative and positive scenarios. For the OTP screen automate only negative scenarios. 
#Note: For the above tests, the happy flow should be till the OTP screen only.

#b. Market screen: 
#● Click on MARKETS tab without login 
#● Now search for any market under Trade eg: BTC (It will be great if it can be parameterised, whatever market we pass like USDT or any other market) 
#● It will give 6 markets for BTC in results 
#● Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change 
#● Clicking on each market, will take to the detailed market screen and verify the details fetched in point 4 and 5 are not null.

  Background: Coindcx

  @CoinDcx @SignUphappyflowuntilOtpScreen @positivescenario
  Scenario Outline: Automate the Signup flow covering positive scenarios
    Given user close the banner once app launch 
    Given User navigates to coinDcx signup screen.
    Given user verify the Home Screen of CoinDcx pro
    Then user click on register button and verify the sign up screen page
    Given User enters th"<FirstName>" in firstname textfield
    Given User enters the "<LastName>" in lastname textfield
    Given User enters the "<Email>" in email textfield
    Given User enters the "<Password>" in password textfield
    When user clicks on the  NEXT button to proceed
    Then user will navigate to second signup page which include phone number, referral code and country fields
    Given User enters the "<Country>" in Country textfield
    Given User enters the "<PhoneNumber>" in PhoneNumber textfield
    Then user cliks on Sign up button
    Then user navigates to OTP verification screen

    

    Examples:
    |FirstName  | LastName  |Email                 |Password  |Country |PhoneNumber|
    |Nitin      | Surange   |testnitinhlb@gmail.com|CoinDcx123|+91   |9860423571 |

@CoinDcx @NegstiveScenarioforfirstsignupscreenemptyfields
  Scenario Outline: Automate the Signup flow covering Negative scenarios
    Given user close the banner once app launch 
    Given User navigates to coinDcx signup screen.
    Given user verify the Home Screen of CoinDcx pro
    Then user click on register button and verify the sign up screen page
    When user clicks on the  NEXT button to proceed
    When user clicks on the  NEXT button to proceed    
    Then user verify error message for first name text field.
    Then user verify error message for last name text field.
    Then user verify error message for email text field.
    Then user verify error message for password text field.
    

    Examples:
    |FirstName|LastName|Email|Password|
    |         |        |     |        |

 @CoinDcx @NegstiveScenarioforSecondsignupscreenemptyfields
   Scenario Outline: Market screen
    Given user close the banner once app launch    
    Given User navigates to coinDcx signup screen.
    Given user verify the Home Screen of CoinDcx pro
    Then user click on register button and verify the sign up screen page
    Given User enters th"<FirstName>" in firstname textfield
    Given User enters the "<LastName>" in lastname textfield
    Given User enters the "<Email>" in email textfield
    Given User enters the "<Password>" in password textfield
    When user clicks on the  NEXT button to proceed
    Then user will navigate to second signup page which include phone number, referral code and country fields
    Then user cliks on Sign up button
    Then user verify error message for country text field
    Then user verify error message for phone number text field
    
    Examples:
    |FirstName  | LastName  |Email                 |Password  |Country |PhoneNumber|
    |Nitin      | Surange   |testnitinhlb@gmail.com|CoinDcx123|        |           |
        
  @CoinDcx @markets
  Scenario Outline: Automate the Signup flow covering positive scenarios
    Given user close the banner once app launch 
    Given User navigates to coinDcx signup screen.
    Given user verify the Home Screen of CoinDcx pro
    Then user click on MARKETS Tab without login into the app
    And verify the narket home screen page which consist TRADE, Margin and Future options at header
    Then  Now search for any market under Trade eg BTC: "<parameterised>"
    Then It will give six markets for BTC in results
    Given User Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change
    Then will take to the detailed market screen
    Then User will fetch details for each market and it should not be null value.
    


    

    Examples:
    |parameterised  | LastName  |Email                 |Password  |Country |PhoneNumber|
    |BTC      | Surange   |testnitinhlb@gmail.com|CoinDcx123|India   |9860423571 |  
     
    
