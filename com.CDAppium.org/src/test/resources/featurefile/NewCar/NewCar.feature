Feature: To verify scenarios related with New Car functionality


@TC_001
Scenario: Verify the New Car button on home page

Given navigate to web site
Then user verifies home page is displayed
And verify New Car button is displayed on the home page
Then click on New Car button
Then Verify New Car page is displayed


































@TC_002
Scenario: Verify Budget and All vehicle type drop down values for New Car for By Budget option 

Given navigate to web site
Then user verifies home page is displayed
And verify New Car tab is selected by default
And Verify By Budget radial button is selected by default
And verify default value of budget drop down
And verify default value of vehicle type drop down
And verfiy the values for Budget drop down values
And verfiy the values for Vehicle drop down values

@TC_003

Scenario: Verify search results on the basis of budget value for New Car for By Budget option 
Given navigate to web site
Then user verifies home page is displayed
And verify New Car tab is selected by default
And Verify By Budget radial button is selected by default
And verify default value of budget drop down
And verify default value of vehicle type drop down
And verfiy the values for Budget drop down values
And verfiy the values for Vehicle drop down values
And select budget value from Select Budget drop down
And select vehicle type from All Vehicle Types drop down
And click on search button
And verify that required next page is displayed


@TC_04
Scenario: Verify New Car button on the Android Web App
Given navigate to web site
Then verify New Cars button

