$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CoinDcx_Pro_Signup_Assignment.feature");
formatter.feature({
  "line": 2,
  "name": "Mobile App automation assignment",
  "description": "",
  "id": "mobile-app-automation-assignment",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Automate the Signup flow covering positive scenarios",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@CoinDcx"
    },
    {
      "line": 17,
      "name": "@SignUphappyflowuntilOtpScreen"
    },
    {
      "line": 17,
      "name": "@positivescenario"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user click on register button and verify the sign up screen page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User enters th\"\u003cFirstName\u003e\" in firstname textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enters the \"\u003cLastName\u003e\" in lastname textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User enters the \"\u003cEmail\u003e\" in email textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enters the \"\u003cPassword\u003e\" in password textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user will navigate to second signup page which include phone number, referral code and country fields",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User enters the \"\u003cCountry\u003e\" in Country textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User enters the \"\u003cPhoneNumber\u003e\" in PhoneNumber textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user cliks on Sign up button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user navigates to OTP verification screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password",
        "Country",
        "PhoneNumber"
      ],
      "line": 37,
      "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;;1"
    },
    {
      "cells": [
        "Nitin",
        "Surange",
        "testnitinhlb@gmail.com",
        "CoinDcx123",
        "+91",
        "9860423571"
      ],
      "line": 38,
      "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7402125810,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#1. Develop a test framework for automating Coindcx Pro Android app using preferably Appium+Java+Testng."
    },
    {
      "line": 4,
      "value": "#a. Signup Flow:"
    },
    {
      "line": 5,
      "value": "#● Automate the Signup flow covering both negative and positive scenarios. For the OTP screen automate only negative scenarios."
    },
    {
      "line": 6,
      "value": "#Note: For the above tests, the happy flow should be till the OTP screen only."
    },
    {
      "line": 8,
      "value": "#b. Market screen:"
    },
    {
      "line": 9,
      "value": "#● Click on MARKETS tab without login"
    },
    {
      "line": 10,
      "value": "#● Now search for any market under Trade eg: BTC (It will be great if it can be parameterised, whatever market we pass like USDT or any other market)"
    },
    {
      "line": 11,
      "value": "#● It will give 6 markets for BTC in results"
    },
    {
      "line": 12,
      "value": "#● Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change"
    },
    {
      "line": 13,
      "value": "#● Clicking on each market, will take to the detailed market screen and verify the details fetched in point 4 and 5 are not null."
    }
  ],
  "line": 15,
  "name": "Coindcx",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 38,
  "name": "Automate the Signup flow covering positive scenarios",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 17,
      "name": "@SignUphappyflowuntilOtpScreen"
    },
    {
      "line": 17,
      "name": "@CoinDcx"
    },
    {
      "line": 17,
      "name": "@positivescenario"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user click on register button and verify the sign up screen page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User enters th\"Nitin\" in firstname textfield",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User enters the \"Surange\" in lastname textfield",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User enters the \"testnitinhlb@gmail.com\" in email textfield",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enters the \"CoinDcx123\" in password textfield",
  "matchedColumns": [
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user will navigate to second signup page which include phone number, referral code and country fields",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User enters the \"+91\" in Country textfield",
  "matchedColumns": [
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User enters the \"9860423571\" in PhoneNumber textfield",
  "matchedColumns": [
    5
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "user cliks on Sign up button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user navigates to OTP verification screen",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.user_close_the_banner_once_app_launch()"
});
formatter.result({
  "duration": 3409399701,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_navigates_to_coinDcx_signup_screen()"
});
formatter.result({
  "duration": 1740428959,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_the_Home_Screen_of_CoinDcx_pro()"
});
formatter.result({
  "duration": 483057438,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_click_on_register_button_and_verify_the_sign_up_screen_page()"
});
formatter.result({
  "duration": 3759942796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nitin",
      "offset": 15
    }
  ],
  "location": "MainSteps.user_enters_th_in_firstname_textfield(String)"
});
formatter.result({
  "duration": 1408515332,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Surange",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_lastname_textfield(String)"
});
formatter.result({
  "duration": 1366419968,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testnitinhlb@gmail.com",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_email_textfield(String)"
});
formatter.result({
  "duration": 1118388143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CoinDcx123",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_password_textfield(String)"
});
formatter.result({
  "duration": 1111656777,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_clicks_on_the_NEXT_button_to_proceed()"
});
formatter.result({
  "duration": 1500221247,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_will_navigate_to_second_signup_page_which_include_phone_number_referral_code_and_country_fields()"
});
formatter.result({
  "duration": 160302604,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "+91",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_Country_textfield(String)"
});
formatter.result({
  "duration": 2498459966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9860423571",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_PhoneNumber_textfield(String)"
});
formatter.result({
  "duration": 727189711,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_cliks_on_Sign_up_button()"
});
formatter.result({
  "duration": 1201032400,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_navigates_to_OTP_verification_screen()"
});
formatter.result({
  "duration": 2670952484,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 41,
  "name": "Automate the Signup flow covering Negative scenarios",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-negative-scenarios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 40,
      "name": "@CoinDcx"
    },
    {
      "line": 40,
      "name": "@NegstiveScenarioforfirstsignupscreenemptyfields"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user click on register button and verify the sign up screen page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "user verify error message for first name text field.",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "user verify error message for last name text field.",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user verify error message for email text field.",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "user verify error message for password text field.",
  "keyword": "Then "
});
formatter.examples({
  "line": 54,
  "name": "",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-negative-scenarios;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password"
      ],
      "line": 55,
      "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-negative-scenarios;;1"
    },
    {
      "cells": [
        "",
        "",
        "",
        ""
      ],
      "line": 56,
      "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-negative-scenarios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18051665125,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#1. Develop a test framework for automating Coindcx Pro Android app using preferably Appium+Java+Testng."
    },
    {
      "line": 4,
      "value": "#a. Signup Flow:"
    },
    {
      "line": 5,
      "value": "#● Automate the Signup flow covering both negative and positive scenarios. For the OTP screen automate only negative scenarios."
    },
    {
      "line": 6,
      "value": "#Note: For the above tests, the happy flow should be till the OTP screen only."
    },
    {
      "line": 8,
      "value": "#b. Market screen:"
    },
    {
      "line": 9,
      "value": "#● Click on MARKETS tab without login"
    },
    {
      "line": 10,
      "value": "#● Now search for any market under Trade eg: BTC (It will be great if it can be parameterised, whatever market we pass like USDT or any other market)"
    },
    {
      "line": 11,
      "value": "#● It will give 6 markets for BTC in results"
    },
    {
      "line": 12,
      "value": "#● Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change"
    },
    {
      "line": 13,
      "value": "#● Clicking on each market, will take to the detailed market screen and verify the details fetched in point 4 and 5 are not null."
    }
  ],
  "line": 15,
  "name": "Coindcx",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 56,
  "name": "Automate the Signup flow covering Negative scenarios",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-negative-scenarios;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 40,
      "name": "@CoinDcx"
    },
    {
      "line": 40,
      "name": "@NegstiveScenarioforfirstsignupscreenemptyfields"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "user click on register button and verify the sign up screen page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "user verify error message for first name text field.",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "user verify error message for last name text field.",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "user verify error message for email text field.",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "user verify error message for password text field.",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.user_close_the_banner_once_app_launch()"
});
formatter.result({
  "duration": 3803117505,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_navigates_to_coinDcx_signup_screen()"
});
formatter.result({
  "duration": 1265150213,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_the_Home_Screen_of_CoinDcx_pro()"
});
formatter.result({
  "duration": 325092739,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_click_on_register_button_and_verify_the_sign_up_screen_page()"
});
formatter.result({
  "duration": 1337769025,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_clicks_on_the_NEXT_button_to_proceed()"
});
formatter.result({
  "duration": 914877510,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_clicks_on_the_NEXT_button_to_proceed()"
});
formatter.result({
  "duration": 732040726,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_error_message_for_first_name_text_field()"
});
formatter.result({
  "duration": 1130198793,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_error_message_for_last_name_text_field()"
});
formatter.result({
  "duration": 2292189965,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_error_message_for_email_text_field()"
});
formatter.result({
  "duration": 2160207406,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_error_message_for_password_text_field()"
});
formatter.result({
  "duration": 2129994563,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 59,
  "name": "Market screen",
  "description": "",
  "id": "mobile-app-automation-assignment;market-screen",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 58,
      "name": "@CoinDcx"
    },
    {
      "line": 58,
      "name": "@NegstiveScenarioforSecondsignupscreenemptyfields"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "user click on register button and verify the sign up screen page",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "User enters th\"\u003cFirstName\u003e\" in firstname textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "User enters the \"\u003cLastName\u003e\" in lastname textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "User enters the \"\u003cEmail\u003e\" in email textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "User enters the \"\u003cPassword\u003e\" in password textfield",
  "keyword": "Given "
});
formatter.step({
  "line": 68,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "user will navigate to second signup page which include phone number, referral code and country fields",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "user cliks on Sign up button",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user verify error message for country text field",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "user verify error message for phone number text field",
  "keyword": "Then "
});
formatter.examples({
  "line": 74,
  "name": "",
  "description": "",
  "id": "mobile-app-automation-assignment;market-screen;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "Password",
        "Country",
        "PhoneNumber"
      ],
      "line": 75,
      "id": "mobile-app-automation-assignment;market-screen;;1"
    },
    {
      "cells": [
        "Nitin",
        "Surange",
        "testnitinhlb@gmail.com",
        "CoinDcx123",
        "",
        ""
      ],
      "line": 76,
      "id": "mobile-app-automation-assignment;market-screen;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17356133363,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#1. Develop a test framework for automating Coindcx Pro Android app using preferably Appium+Java+Testng."
    },
    {
      "line": 4,
      "value": "#a. Signup Flow:"
    },
    {
      "line": 5,
      "value": "#● Automate the Signup flow covering both negative and positive scenarios. For the OTP screen automate only negative scenarios."
    },
    {
      "line": 6,
      "value": "#Note: For the above tests, the happy flow should be till the OTP screen only."
    },
    {
      "line": 8,
      "value": "#b. Market screen:"
    },
    {
      "line": 9,
      "value": "#● Click on MARKETS tab without login"
    },
    {
      "line": 10,
      "value": "#● Now search for any market under Trade eg: BTC (It will be great if it can be parameterised, whatever market we pass like USDT or any other market)"
    },
    {
      "line": 11,
      "value": "#● It will give 6 markets for BTC in results"
    },
    {
      "line": 12,
      "value": "#● Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change"
    },
    {
      "line": 13,
      "value": "#● Clicking on each market, will take to the detailed market screen and verify the details fetched in point 4 and 5 are not null."
    }
  ],
  "line": 15,
  "name": "Coindcx",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 76,
  "name": "Market screen",
  "description": "",
  "id": "mobile-app-automation-assignment;market-screen;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 58,
      "name": "@CoinDcx"
    },
    {
      "line": 58,
      "name": "@NegstiveScenarioforSecondsignupscreenemptyfields"
    }
  ]
});
formatter.step({
  "line": 60,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 61,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 62,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "user click on register button and verify the sign up screen page",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "User enters th\"Nitin\" in firstname textfield",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "User enters the \"Surange\" in lastname textfield",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "User enters the \"testnitinhlb@gmail.com\" in email textfield",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "User enters the \"CoinDcx123\" in password textfield",
  "matchedColumns": [
    3
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 68,
  "name": "user clicks on the  NEXT button to proceed",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "user will navigate to second signup page which include phone number, referral code and country fields",
  "keyword": "Then "
});
formatter.step({
  "line": 70,
  "name": "user cliks on Sign up button",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user verify error message for country text field",
  "keyword": "Then "
});
formatter.step({
  "line": 72,
  "name": "user verify error message for phone number text field",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.user_close_the_banner_once_app_launch()"
});
formatter.result({
  "duration": 3912104964,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_navigates_to_coinDcx_signup_screen()"
});
formatter.result({
  "duration": 1223306689,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_the_Home_Screen_of_CoinDcx_pro()"
});
formatter.result({
  "duration": 443545033,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_click_on_register_button_and_verify_the_sign_up_screen_page()"
});
formatter.result({
  "duration": 3848813898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nitin",
      "offset": 15
    }
  ],
  "location": "MainSteps.user_enters_th_in_firstname_textfield(String)"
});
formatter.result({
  "duration": 1372492884,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Surange",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_lastname_textfield(String)"
});
formatter.result({
  "duration": 1113106540,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testnitinhlb@gmail.com",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_email_textfield(String)"
});
formatter.result({
  "duration": 1114864133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CoinDcx123",
      "offset": 17
    }
  ],
  "location": "MainSteps.user_enters_the_in_password_textfield(String)"
});
formatter.result({
  "duration": 1109058853,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_clicks_on_the_NEXT_button_to_proceed()"
});
formatter.result({
  "duration": 1515324760,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_will_navigate_to_second_signup_page_which_include_phone_number_referral_code_and_country_fields()"
});
formatter.result({
  "duration": 167573394,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_cliks_on_Sign_up_button()"
});
formatter.result({
  "duration": 1440616221,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_error_message_for_country_text_field()"
});
formatter.result({
  "duration": 2116769253,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_error_message_for_phone_number_text_field()"
});
formatter.result({
  "duration": 2118817201,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 79,
  "name": "Automate the Signup flow covering positive scenarios",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 78,
      "name": "@CoinDcx"
    },
    {
      "line": 78,
      "name": "@markets"
    }
  ]
});
formatter.step({
  "line": 80,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 83,
  "name": "user click on MARKETS Tab without login into the app",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "verify the narket home screen page which consist TRADE, Margin and Future options at header",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Now search for any market under Trade eg BTC: \"\u003cparameterised\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "It will give six markets for BTC in results",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "User Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "will take to the detailed market screen",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "User will fetch details for each market and it should not be null value.",
  "keyword": "Then "
});
formatter.examples({
  "line": 95,
  "name": "",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;",
  "rows": [
    {
      "cells": [
        "parameterised",
        "LastName",
        "Email",
        "Password",
        "Country",
        "PhoneNumber"
      ],
      "line": 96,
      "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;;1"
    },
    {
      "cells": [
        "BTC",
        "Surange",
        "testnitinhlb@gmail.com",
        "CoinDcx123",
        "India",
        "9860423571"
      ],
      "line": 97,
      "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17218113043,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "#1. Develop a test framework for automating Coindcx Pro Android app using preferably Appium+Java+Testng."
    },
    {
      "line": 4,
      "value": "#a. Signup Flow:"
    },
    {
      "line": 5,
      "value": "#● Automate the Signup flow covering both negative and positive scenarios. For the OTP screen automate only negative scenarios."
    },
    {
      "line": 6,
      "value": "#Note: For the above tests, the happy flow should be till the OTP screen only."
    },
    {
      "line": 8,
      "value": "#b. Market screen:"
    },
    {
      "line": 9,
      "value": "#● Click on MARKETS tab without login"
    },
    {
      "line": 10,
      "value": "#● Now search for any market under Trade eg: BTC (It will be great if it can be parameterised, whatever market we pass like USDT or any other market)"
    },
    {
      "line": 11,
      "value": "#● It will give 6 markets for BTC in results"
    },
    {
      "line": 12,
      "value": "#● Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change"
    },
    {
      "line": 13,
      "value": "#● Clicking on each market, will take to the detailed market screen and verify the details fetched in point 4 and 5 are not null."
    }
  ],
  "line": 15,
  "name": "Coindcx",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 97,
  "name": "Automate the Signup flow covering positive scenarios",
  "description": "",
  "id": "mobile-app-automation-assignment;automate-the-signup-flow-covering-positive-scenarios;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 78,
      "name": "@markets"
    },
    {
      "line": 78,
      "name": "@CoinDcx"
    }
  ]
});
formatter.step({
  "line": 80,
  "name": "user close the banner once app launch",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "User navigates to coinDcx signup screen.",
  "keyword": "Given "
});
formatter.step({
  "line": 82,
  "name": "user verify the Home Screen of CoinDcx pro",
  "keyword": "Given "
});
formatter.step({
  "line": 83,
  "name": "user click on MARKETS Tab without login into the app",
  "keyword": "Then "
});
formatter.step({
  "line": 84,
  "name": "verify the narket home screen page which consist TRADE, Margin and Future options at header",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Now search for any market under Trade eg BTC: \"BTC\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "It will give six markets for BTC in results",
  "keyword": "Then "
});
formatter.step({
  "line": 87,
  "name": "User Now traverse through each market and fetch the details like Volume, price of coin and price in INR, percentage change",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "will take to the detailed market screen",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "User will fetch details for each market and it should not be null value.",
  "keyword": "Then "
});
formatter.match({
  "location": "MainSteps.user_close_the_banner_once_app_launch()"
});
formatter.result({
  "duration": 4160377475,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_navigates_to_coinDcx_signup_screen()"
});
formatter.result({
  "duration": 1189302408,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_verify_the_Home_Screen_of_CoinDcx_pro()"
});
formatter.result({
  "duration": 470649678,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_click_on_MARKETS_Tab_without_login_into_the_app()"
});
formatter.result({
  "duration": 428837665,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.verify_the_narket_home_screen_page_which_consist_TRADE_Margin_and_Future_options_at_header()"
});
formatter.result({
  "duration": 1640461847,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BTC",
      "offset": 47
    }
  ],
  "location": "MainSteps.now_search_for_any_market_under_Trade_eg_BTC(String)"
});
formatter.result({
  "duration": 1627285599,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.it_will_give_six_markets_for_BTC_in_results()"
});
formatter.result({
  "duration": 790467293,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_Now_traverse_through_each_market_and_fetch_the_details_like_Volume_price_of_coin_and_price_in_INR_percentage_change()"
});
formatter.result({
  "duration": 615458204,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.will_take_to_the_detailed_market_screen()"
});
formatter.result({
  "duration": 10328394783,
  "status": "passed"
});
formatter.match({
  "location": "MainSteps.user_will_fetch_details_for_each_market_and_it_should_not_be_null_value()"
});
formatter.result({
  "duration": 12612732509,
  "status": "passed"
});
});