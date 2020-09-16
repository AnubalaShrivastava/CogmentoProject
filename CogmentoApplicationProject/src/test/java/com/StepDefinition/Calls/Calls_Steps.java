package com.StepDefinition.Calls;

import com.BaseClass.Library;
import com.Pages.Calls.Calls_Page;
import com.SeleniumReusableFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Calls_Steps extends Library {
	Calls_Page cpage;
	SeleniumUtilities sUtilities;

	@Given("To launch the browser and navigate to the URL")
	public void to_launch_the_browser_and_navigate_to_the_url() throws Throwable {
		browserSetUp();
		logger.info("Browser Launched and URL Navigated");

	}

	@When("Enter Email and Password")
	public void enter_email_and_password() throws Throwable {
		cpage = new Calls_Page(driver);
		cpage.login(properties.getProperty("loginEmail"), properties.getProperty("LoginPassword"));
		logger.info("Login Sucessful");
	}

	@Then("Click Login Button")
	public void click_Login_Button() {
		cpage.login();

	}

	
	  @Then("Get the page title and screenshot") 
	  public void get_the_page_title_and_screenshot() { sUtilities = new
	  SeleniumUtilities(driver); sUtilities.to_take_screenshot(
	  "src\\test\\resources\\Screenshots\\OrangehrmCucumber.png");
	  logger.info("Taken Screenshot"); sUtilities.getTitle(); //tearDown();
	  
	  }
	 

	@Then("To test if the username displayed is correct or not")
	public void to_test_if_the_username_displayed_is_correct_or_not() throws Throwable {
		cpage = new Calls_Page(driver);
	cpage.name_displayed();
	logger.info("Username is Displayed correctly");

	}

	@Then("click on calls button")
	public void click_on_calls_button() throws Throwable {
		//cpage = new Calls_Page(driver);
		cpage.click_calls();
		logger.info("Calls button clicked");
	}

	@When("Click on New button")
	public void click_on_new_button() throws Throwable {
		cpage = new Calls_Page(driver);
		cpage.click_new();
		logger.info("New calls selected to create new call");
	}

	@Then("Enter Call time")
	public void enter_call_time() throws Throwable {
		cpage.enter_calltime(properties.getProperty("ctime"));
		logger.info("Call time entered");
	}

	@Then("Enter Assigned To")
	public void enter_assigned_to() throws Throwable {
		cpage.assignedto();
		logger.info("Call is assigned to a user");
	}

	@Then("Select Type")
	public void select_type() throws Throwable {
		cpage.type();
		logger.info("Type of call selected");
	}

	@Then("Enter Duration")
	public void enter_duration() throws Throwable {
		cpage.duration(properties.getProperty("durationofcall"));
		logger.info("Duration of call is entered");
	}

	@Then("Enter Start Time")
	public void enter_start_time() throws Throwable {
		cpage.starttime(properties.getProperty("starttime"));
		logger.info("Start time selected");
	}

	@Then("Select Flag")
	public void select_flag() throws Throwable {
		cpage.flag();
		logger.info("Flag selected");
	}

	@Then("Enter Tags")
	public void enter_tags() throws Throwable {
		
		String[]values = properties.getProperty("tags1").toString().split(",");
		cpage.tags(values);
		logger.info("Tags related to call are entered");
	}

	@Then("Enter Description")
	public void enter_description() throws Throwable {
		cpage.description(properties.getProperty("desc"));
		logger.info("Description entered");
	}

	@Then("Search for Contact")
	public void search_for_contact() throws Throwable {

	}

	@Then("Search for deal")
	public void search_for_deal() throws Throwable {

	}

	@Then("Search for Case")
	public void search_for_case() throws Throwable {

	}

	@Then("Search for Task")
	public void search_for_task() throws Throwable {

	}

	@Then("Enter Conference Call Number")
	public void enter_conference_call_number() throws Throwable {
		cpage.confcallnumber(properties.getProperty("num"));
		logger.info("Conference call number entered");
	}

	@Then("Enter Identifier")
	public void enter_identifier() throws Throwable {
		cpage.identifier(properties.getProperty("identifier"));
		logger.info("Identifier is entered");
	}

	@Then("Click Save")
	public void click_save() throws Throwable {
		cpage.save();
		logger.info("New Call is saved sucessfully");
		
		  driver.navigate().to(driver.getCurrentUrl()); cpage.clickcallsagain();
		 
	}
	
	@When("Click on ShowFilters")
	public void click_on_ShowFilters() {
		cpage = new Calls_Page(driver);
	    cpage.showfilters();
	}

	@Then("check if Search dropdown is present")
	public void check_if_Search_dropdown_is_present() {
		cpage.searchdropdown();
	}

	@Then("Check if operator dropdown is present")
	public void check_if_operator_dropdown_is_present() {
	   cpage.operatordropdown();
	}

	@Then("Check if Value field is present or not")
	public void check_if_Value_field_is_present_or_not() {
	    cpage.thirddropdown();
	    tearDown();
	}


}
