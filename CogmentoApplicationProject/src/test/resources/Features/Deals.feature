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
When click select all checkbox
Then should select all checkboxes 
When click on Company
Then should see Company and arrow button
When Click on company Up/Down arrow
Then Company list should change with up/down arrow
When click on Close Date
Then should see Close Date and arrow button
When Click on Closed Date Up/Down arrow
Then Closed Date list should change with up/down arrow
When click on Amount
Then should see Amount and arrow button
When Click on Amount Up/Down arrow
Then Amount list should change with up/down arrow
When click on Status
Then should see Status and arrow button
When Click on Status Up/Down arrow
Then Staus list should change with up/down arrow
When click on Stage
Then should see Stage and arrow button
When Click on Stage Up/Down arrow
Then Stage list should change with up/down arrow
When click on Type
Then should see Type and arrow button
When Click on Type Up/Down arrow
Then Type list should change with up/down arrow
When click on Options
Then should see Options on page
