Feature: Test the Cogmento Application Calls Module

Scenario: To check the login functionality of Cogmento Application Project
Given To launch the browser and navigate to the URL
When Enter Email and Password
Then Click Login Button
Then Get the page title and screenshot

Scenario: To test weather we reached the correct website and click calls
Then To test if the username displayed is correct or not
Then click on calls button

Scenario: To test the new button functionality in calls section
When Click on New button
Then Enter Call time 
Then Enter Assigned To
Then Select Type
Then Enter Duration
Then Enter Start Time
Then Select Flag
Then Enter Tags
Then Enter Description
Then Search for Contact
Then Search for deal
Then Search for Case
Then Search for Task
Then Enter Conference Call Number
Then Enter Identifier
Then Click Save 

Scenario: To test the Show filters Button functionality in calls
When Click on ShowFilters
Then check if Search dropdown is present
Then Check if operator dropdown is present
Then Check if Value field is present or not 