$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Email.feature");
formatter.feature({
  "name": "Test Email Module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check the login functionality of application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the browser and navigate to the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.launch_the_browser_and_navigate_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Email and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.enter_Email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Email",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.click_Email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Compose an email",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.compose_an_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill the required fields",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.fill_the_required_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "send the email",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.send_the_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go back to previous page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.go_back_to_previous_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.check_inbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Sent Messages",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.check_Sent_Messages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Refersh the page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.refersh_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select feature fetch",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.select_feature_fetch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select feature Template",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.select_feature_Template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create new Email Template",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.create_new_Email_Template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill all required fields to create template",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.fill_all_required_fields_to_create_template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Save the Template",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.save_the_Template()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit the existing Template and save it",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.edit_the_existing_Template_and_save_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go back to Email page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.go_back_to_Email_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Connect an Email Account",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.connect_an_Email_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Do Accounts settings",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Email.Emial_Steps.do_Accounts_settings()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Home.feature");
formatter.feature({
  "name": "Test Home Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is Logged In",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submit username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.submit_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.should_be_logged_in()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Anubala Shrivastava]\u003e but was:\u003c[Rajbir Rai]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.SeleniumReusableFunctions.SeleniumUtilities.pageVerification(SeleniumUtilities.java:83)\r\n\tat com.StepDefinition.Home.Home_Steps.should_be_logged_in(Home_Steps.java:38)\r\n\tat ✽.should be logged in(file:///C:/Users/rajbi/git/CogmentoProject/CogmentoApplicationProject/src/test/resources/Features/Home.feature:6)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Home Page UI content",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "All UI should present on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.all_UI_should_present_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deal Summary varification",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on deal summary section gear icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_deal_summary_section_gear_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Filter drop down should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.filter_drop_down_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on deal summary section help icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_deal_summary_section_help_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Help content should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.help_content_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on  deal summary section refresh icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_deal_summary_section_refresh_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deal summary section should refresh",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.deal_summary_section_should_refresh()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Activity stream verification",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click on activity stream section gear icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_activity_stream_section_gear_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Drop down with all option should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.drop_down_with_all_option_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contacts is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.contacts_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contacts should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.contacts_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Companies option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.companies_option_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Companies should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.companies_should_appear_on_activity_stream()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [false] but found [true]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:568)\r\n\tat org.testng.Assert.assertEquals(Assert.java:578)\r\n\tat com.Pages.Home.Home_Page.verifyCompany(Home_Page.java:222)\r\n\tat com.StepDefinition.Home.Home_Steps.companies_should_appear_on_activity_stream(Home_Steps.java:115)\r\n\tat ✽.Companies should appear on activity stream(file:///C:/Users/rajbi/git/CogmentoProject/CogmentoApplicationProject/src/test/resources/Features/Home.feature:25)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Cases option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.cases_option_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Cases should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.cases_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Task option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.task_option_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Tasks should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.tasks_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Deals option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.deals_option_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Deals should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.deals_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Activity stream help icon is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.activity_stream_help_icon_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "help should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.help_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on  Activity stream refresh icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_Activity_stream_refresh_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Activity stream should refresh",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.activity_stream_should_refresh()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Deals section verification",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click Deals section gear icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_Deals_section_gear_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Different deals selection options should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.different_deals_selection_options_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select filters for deals",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.select_filters_for_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on gear icon",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_gear_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "graph of filtered deal should appear",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.graph_of_filtered_deal_should_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Deals section help icon is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.deals_section_help_icon_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "help should appear on Deals section",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.help_should_appear_on_Deals_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on  Deals section refresh icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_Deals_section_refresh_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Deals section should refresh",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.deals_section_should_refresh()"
});
formatter.result({
  "status": "passed"
});
});