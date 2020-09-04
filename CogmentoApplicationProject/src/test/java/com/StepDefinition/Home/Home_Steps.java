package com.StepDefinition.Home;

import java.awt.AWTException;

import org.openqa.selenium.By;

import com.BaseClass.Library;
import com.Pages.Home.Home_Page;
import com.SeleniumReusableFunctions.SeleniumUtilities;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home_Steps extends Library{
	Home_Page hPage;
	SeleniumUtilities util;
	//Constructor
	
	
	/*
	 * public Home_Steps() { this.driver=driver; hPage=new Home_Page(driver); }
	 */
	 
	@Given("navigate to the login page")
	public void navigate_to_the_login_page() {
		browserSetUp();
		logger.info("Browser Launched and navigate to URL");
	    
	}
	@When("submit username and password")
	public void submit_username_and_password() {
		hPage=new Home_Page(driver);
		hPage.login(properties.getProperty("loginEmail"), properties.getProperty("LoginPassword"));
		hPage.submit();
		logger.info("Login successfully");
 
	}

	@Then("should be logged in")
	public void should_be_logged_in() {
		util = new SeleniumUtilities(driver);
		util.pageVerification("Anubala Shrivastava", driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/span[1][@class='user-display']")).getText());
		
	}

	@Then("All UI should present on home page")
	public void all_UI_should_present_on_home_page() {
		hPage=new Home_Page(driver);
		hPage.verifyUIElements();
 	}

	@When("click on deal summary section gear icon")
	public void click_on_deal_summary_section_gear_icon() {
		hPage=new Home_Page(driver);
		hPage.clickDealSummaryGearIcon() ;
	}

	@Then("Filter drop down should appear")
	public void filter_drop_down_should_appear() {
		hPage.checkDealSummaryFilter();   
	}

	@When("click on deal summary section help icon")
	public void click_on_deal_summary_section_help_icon() {
		hPage.clickDealSummaryHelp();   
	}

	@Then("Help content should appear")
	public void help_content_should_appear() {
		hPage.checkingDealSummarySecHelpContent();
	   	}

	@When("click on  deal summary section refresh icon")
	public void click_on_deal_summary_section_refresh_icon() {
		hPage.dealSummaryRefIcon();
	}

	@Then("deal summary section should refresh")
	public void deal_summary_section_should_refresh() {
	  //To be implemented  after adding more data  
	    
	}

	@When("Click on activity stream section gear icon")
	public void click_on_activity_stream_section_gear_icon() {
		hPage=new Home_Page(driver);
		hPage.clickActivitySettingGear();
	    
	}

	@Then("Drop down with all option should appear")
	public void drop_down_with_all_option_should_appear() {
		hPage.verifyActStreamDrpDn();
	    
	}

	@When("Contacts is selected")
	public void contacts_is_selected() {
		hPage=new Home_Page(driver);
		hPage.selectContactfromDropDown();
	    
	}

	@Then("Contacts should appear on activity stream")
	public void contacts_should_appear_on_activity_stream() {
		//hPage=new Home_Page(driver);
		hPage.verifyContcat(); 
	    
	}

	@When("Companies option is selected")
	public void companies_option_is_selected() throws InterruptedException, AWTException {
		hPage=new Home_Page(driver);
		hPage.selectCompanyfromDropDown();  
	}

	@Then("Companies should appear on activity stream")
	public void companies_should_appear_on_activity_stream() {
		hPage.verifyCompany();  
	}

	@When("Cases option is selected")
	public void cases_option_is_selected() {
	    
	    
	}

	@Then("Cases should appear on activity stream")
	public void cases_should_appear_on_activity_stream() {
	    
	    
	}

	@When("Task option is selected")
	public void task_option_is_selected() {
	    
	    
	}

	@Then("Tasks should appear on activity stream")
	public void tasks_should_appear_on_activity_stream() {
	    
	    
	}

	@When("Deals option is selected")
	public void deals_option_is_selected() {
	    
	    
	}

	@Then("Deals should appear on activity stream")
	public void deals_should_appear_on_activity_stream() {
	    
	    
	}

	@When("Activity stream help icon is selected")
	public void activity_stream_help_icon_is_selected() {
		hPage.clickOnActivityStreamHelpIcon();  
	    
	}

	@Then("help should appear on activity stream")
	public void help_should_appear_on_activity_stream() {
		hPage.verifyActivityStreamHelp();
 	}

	@When("Click on  Activity stream refresh icon")
	public void click_on_Activity_stream_refresh_icon() {
	    
	    
	}

	@Then("Activity stream should refresh")
	public void activity_stream_should_refresh() {
	    
	    
	}

	@When("Click Deals section gear icon")
	public void click_Deals_section_gear_icon() {
		hPage=new Home_Page(driver);
	   hPage.clickOnDealSectionGearIcon();  
	    
	}

	@Then("Different deals selection options should appear")
	public void different_deals_selection_options_should_appear() {
	    
	    
	}

	@When("Select filters for deals")
	public void select_filters_for_deals() {
	    
	    
	}

	@When("click on gear icon")
	public void click_on_gear_icon() {
	    
	    
	}

	@Then("graph of filtered deal should appear")
	public void graph_of_filtered_deal_should_appear() {
	    
	    
	}

	@When("Deals section help icon is selected")
	public void deals_section_help_icon_is_selected() {
	    
	    
	}

	@Then("help should appear on Deals section")
	public void help_should_appear_on_Deals_section() {
	    
	    
	}

	@When("Click on  Deals section refresh icon")
	public void click_on_Deals_section_refresh_icon() {
	    
	    
	}

	@Then("Deals section should refresh")
	public void deals_section_should_refresh() {
	    
		//tearDown();
	}
}
