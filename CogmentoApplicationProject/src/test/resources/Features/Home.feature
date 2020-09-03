Feature: Test Home Page

Scenario: User is Logged In
Given navigate to the login page
When submit username and password
Then should be logged in 

Scenario: Home Page UI content
Then  All UI should present on home page

Scenario: Deal Summary varification
When click on deal summary section gear icon
Then  Filter drop down should appear
When click on deal summary section help icon
Then Help content should appear
When click on  deal summary section refresh icon
Then  deal summary section should refresh

Scenario: Activity stream verification
When Click on activity stream section gear icon
Then Drop down with all option should appear
When Contacts is selected
Then Contacts should appear on activity stream
When Companies option is selected
Then Companies should appear on activity stream
When Cases option is selected
Then Cases should appear on activity stream
When Task option is selected
Then Tasks should appear on activity stream
When Deals option is selected
Then Deals should appear on activity stream
When Activity stream help icon is selected
Then help should appear on activity stream
When Click on  Activity stream refresh icon
Then Activity stream should refresh

Scenario: Deals section verification
When Click Deals section gear icon
Then Different deals selection options should appear
When Select filters for deals
And click on gear icon 
Then graph of filtered deal should appear
When Deals section help icon is selected
Then help should appear on Deals section
When Click on  Deals section refresh icon
Then Deals section should refresh




