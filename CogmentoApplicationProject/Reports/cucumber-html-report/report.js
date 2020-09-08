$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Home.feature");
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
  "status": "passed"
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
  "status": "passed"
});
formatter.step({
  "name": "Cases option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.cases_option_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cases should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.cases_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Task option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.task_option_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tasks should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.tasks_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Deals option is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.deals_option_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Deals should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.deals_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Activity stream help icon is selected",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.activity_stream_help_icon_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "help should appear on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.help_should_appear_on_activity_stream()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on  Activity stream refresh icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.click_on_Activity_stream_refresh_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Activity stream should refresh",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Home.Home_Steps.activity_stream_should_refresh()"
});
formatter.result({
  "status": "passed"
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