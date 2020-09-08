Feature: Test the Cogmento Application

Scenario: To check the login functionality of Cogmento
	Given Launch the browser and navigate to the URL
	When Enter Email and password
	Then  Click the login button
	Then Get the page title and screen shot

Scenario: Check Deals Page 
When click on Deals section icon
Then should see Deals page contents
When click on Title
Then should see Title and arrow button
When click on title Up/Down arrow
Then Title list should change with up/down arrow
