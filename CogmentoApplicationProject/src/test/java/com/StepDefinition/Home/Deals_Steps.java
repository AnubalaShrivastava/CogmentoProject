package com.stepDefinition.Deals;

import org.openqa.selenium.By;

import com.baseClass.Library;
import com.pages.Deals.Deals_Page;
import com.seleniumReusableFunctions.SeleniumUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Deals_Steps extends Library{
	Deals_Page lpage;
	SeleniumUtilities sUti;
	 
	@Given("Launch the browser and navigate to the URL")
	public void launch_the_browser_and_navigate_to_the_URL() {
		browserSetUp();
		logger.info("Browser Launched and navigate to URL");
	   
	}

	@When("Enter Email and password")
	public void enter_Email_and_password() {
       lpage=new Deals_Page(driver);
		 lpage.login(properties.getProperty("loginEmail"), properties.getProperty("LoginPassword"));
		 logger.info("LoginEmail and password entered successfully");
	
	}

	@Then("Click the login button")
	public void click_the_login_button() {
		lpage.submit();
		logger.info("Login successfully");
	
	}
	
	@Then("should be logged in")
	public void should_be_logged_in() {
		sUti = new SeleniumUtilities(driver);
		sUti.alertHandle();
		sUti.pageVerification("pallavi dharmadhikari", driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/span[1][@class='user-display']")).getText());
	    
	}

	
	@When("click on Deals section icon")
	public void click_on_Deals_section_icon() {
		lpage = new Deals_Page(driver);
		lpage.click_deals();
		}
	
	@Then("should see Deals page contents")
	public void should_see_Deals_page_contents() throws Exception {
	lpage = new Deals_Page(driver);
		lpage.deals_elements();
	   }
	
		
		  @When("click on Pipeline button") public void click_on_Pipeline() { lpage =
		  new Deals_Page(driver); lpage.pipeline(); }
		  
		  @Then("should click on Pipeline button") public void
		  should_click_on_Pipeline_button() { lpage = new Deals_Page(driver);
		  lpage.pipeline(); }
		 



	@When("click on Title")
	public void click_on_Title() throws Exception {
		lpage = new Deals_Page(driver);
		lpage.title();
		logger.info("Click on Title");
	   }

	@Then("should see Title and arrow button")
	public void should_see_Title_and_arrow_button() throws Exception {
	    lpage = new Deals_Page(driver);
	    lpage.title_arrow_button();
	    logger.info("Title clicked");
	   }

	
	@When("click on title Up/Down arrow")
	public void click_on_Up_arrow() throws Exception {
		lpage = new Deals_Page(driver);
		lpage.title_arrow_button();
		
	   }

	@Then("Title list should change with up/down arrow ")
	public void title_list_should_be_printed_in_Ascending_order() throws Exception {
		lpage = new Deals_Page(driver);
		lpage.title_arrow_button();
		Thread.sleep(1000);
	    lpage.click_deals();
	}

	
	  @When("click select all checkbox") public void click_select_all_checkbox()
	  throws Exception { lpage = new Deals_Page(driver); lpage.checkbox();
	  Thread.sleep(1000); }
	 

	
	  @Then("should select all checkboxes") public void
	  should_select_all_checkboxes() { lpage = new Deals_Page(driver);
	  lpage.checkbox(); }
	 
	
	  @When("click on Company") public void click_on_Company() throws
	  InterruptedException { lpage = new Deals_Page(driver); lpage.company();
	  Thread.sleep(3000); }
	 
	
	  @Then("should see Company and arrow button") public void
	  should_see_Company_and_arrow_button() { lpage = new Deals_Page(driver);
	  lpage.company(); }
	 

		
		  @When("Click on company Up/Down arrow") public void click_on_Down_arrow()
		  throws Exception { lpage = new Deals_Page(driver);
		  lpage.company_arrow_button(); Thread.sleep(3000);
		  
		  }
		 

		
		  @Then("Company list should change with up/down arrow") public void
		  company_list_should_be_printed_in_Descending_order() throws Exception {
		  
		  lpage = new Deals_Page(driver); 
		  lpage.company_arrow_button();
		  Thread.sleep(3000); }
		 

	@When("click on Close Date")
	public void click_on_Close_Date() {
		lpage = new Deals_Page(driver);
		lpage.closed_date();
		
	}

	
	  @Then("should see Close Date and arrow button") public void
	  should_see_Close_Date_and_arrow_button() throws Exception { lpage = new
	  Deals_Page(driver); lpage.closed_date_arrrow_button();
	  Thread.sleep(3000); }
	 

	
	  @When("Click on Closed Date Up/Down arrow") public void
	  close_Date_list_should_be_printed_in_Ascending_order() throws Exception {
	  
	  lpage = new Deals_Page(driver); lpage.closed_date_arrrow_button();
	  Thread.sleep(3000); }
	 

	
	  @Then("Closed Date list should change with up/down arrow") public void
	  close_Date_list_should_be_printed_in_Descending_order() throws Exception {
	  lpage = new Deals_Page(driver); lpage.closed_date_arrrow_button();
	  Thread.sleep(3000); }
	 
	@When("click on Amount")
	public void click_on_Amount() {
		lpage = new Deals_Page(driver);
		lpage.amount();
	   }

		
		  @Then("should see Amount and arrow button") public void
		  should_see_Amount_and_arrow_button() throws Exception { lpage = new
		  Deals_Page(driver); lpage.amount_arrrow_button(); Thread.sleep(3000); }
		 

		
		  @When("Click on Amount Up/Down arrow") public void
		  amount_list_should_be_printed_in_Ascending_order() throws Exception { lpage =
		  new Deals_Page(driver); lpage.amount_arrrow_button();
		  Thread.sleep(3000);
		  
		  }
		 
		
		  @Then("Amount list should change with up/down arrow") public void
		  amount_list_should_be_printed_in_Descending_order() throws Exception { lpage
		  = new Deals_Page(driver); lpage.amount_arrrow_button();
		  Thread.sleep(3000);
		  
		  }
		 

	@When("click on Status")
	public void click_on_Status() {
		lpage = new Deals_Page(driver);
		lpage.status();
	   
	}

	
	  @Then("should see Status and arrow button") public void
	  should_see_Status_and_arrow_button() throws Exception { lpage = new
	  Deals_Page(driver); lpage.status_arrrow_button(); }
	 
	
	  @When("Click on Status Up/Down arrow") public void
	  status_list_should_be_printed() throws Exception { lpage=new
	  Deals_Page(driver); lpage.status_arrrow_button(); }
	 

	
	  @Then("Status list should change with up/down arrow") public void
	  status_list_should_be_printed_in_Descending_order() throws Exception {
	  lpage=new Deals_Page(driver); lpage.status_arrrow_button();
	  
	  }
	 

	@When("click on Stage")
	public void click_on_Stage() throws Exception {
		lpage = new Deals_Page(driver);
		lpage.stage();
		Thread.sleep(2000);
	   
	}
	
	  @Then("should see Stage and arrow button") public void
	  should_see_Stage_and_arrow_button() throws Exception { lpage=new
	  Deals_Page(driver); lpage.stage_arrrow_button(); }
	 

	
	  @When("Click on Stage Up/Down arrow") public void
	  stage_list_should_be_printed() throws Exception { lpage=new
	  Deals_Page(driver); lpage.stage_arrrow_button(); }
	 

	
	  @Then("Stage list should change with up/down arrow") public void
	  stage_list_should_be_printed_in_Descending_order() throws Exception {
	  lpage=new Deals_Page(driver); lpage.status_arrrow_button(); }
	 
	@When("click on Type")
	public void click_on_Type() {
		lpage = new Deals_Page(driver);
		lpage.type();
		}
		
		  @Then("should see Type and arrow button") public void
		  should_see_Type_and_arrow_button() throws Exception { lpage=new
		  Deals_Page(driver); lpage.type_arrrow_button(); }
		 

		
		  @When("Click on Type Up/Down arrow") public void
		  type_list_should_be_printed() throws Exception { lpage=new
		  Deals_Page(driver); lpage.status_arrrow_button(); }
		 
		
		  @Then("Type list should change with up/down arrow") public void
		  type_list_should_be_printed_in_Descending_order() throws Exception {
		  lpage=new Deals_Page(driver); lpage.status_arrrow_button(); }
		 
	@When("click on Options")
	public void click_on_Options() {
	lpage = new Deals_Page(driver);
 	lpage.options();
	   }

	@Then("should click Options on page")
	public void should_see_Options_on_page() {
		lpage=new Deals_Page(driver);
		lpage.options();
	  }

	@Then("Get the page title and screen shot")
	public void get_the_page_title_and_screen_shot() {
		sUti = new SeleniumUtilities(driver);
		sUti.to_take_screenshot("src/test/resources/ScreenShots/CogmentoLogin.png");
		logger.info("Take Screen Shot");
		sUti.getTitle();
		//tearDown();
		}
		
	   
	}
		
	
	
