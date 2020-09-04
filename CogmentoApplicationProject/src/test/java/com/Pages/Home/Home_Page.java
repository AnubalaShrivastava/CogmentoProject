package com.Pages.Home;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.BaseClass.Library;
import com.SeleniumReusableFunctions.SeleniumUtilities;

public class Home_Page extends Library{
	
	SeleniumUtilities sUtil;
	JavascriptExecutor js;
	//Getting elements for login
	@FindBy(name="email")
	WebElement txtEmail;
	@FindBy(name="password")
	WebElement txtPassword;
	@FindBy(xpath="//*[@id=\'ui\']/div/div/form/div/div[3]")
	WebElement btnLogin;

	 
	
	  //Getting elements of UIs
	  
	  @FindBy(
	  xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[@class='header'][text()='Deals Summary']"
	  ) WebElement secDeal;
	  
	  @FindBy(
	  xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']"
	  ) WebElement refDeal;
	  
	  @FindBy(
	  xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[2]/i[@class='right floated setting icon color-gray']"
	  ) WebElement gearDeal;
	  @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/form/div/div/i[@class='dropdown icon']")
	  WebElement fltrDeal;
	  @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[1]/i[@class='right floated help circle icon color-gray']")
	  WebElement hlpDeal;
	  @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[2][@class='content ui segment']")
	  WebElement hlpDealContent;
	  @FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']")
	  WebElement dealSumRef;
   
	@FindBy(xpath="//*[@id='main-nav']/a[1]/span[text()='Home']")
	WebElement btnHome;
	@FindBy(xpath="//div[@class='content card-header']//i[@class='right floated setting icon color-gray']")
	WebElement gearAct;
	@FindBy(xpath="//i[@class='dropdown icon']")
	WebElement drpdn;
	//@FindBy(xpath="//span[text()='companies']")
	//WebElement optioncmpny;
	@FindBy(xpath="//span[@class='text'][text()='contacts']")
	WebElement optioncontact;
	@FindBy(xpath="//span[@class='text'][text()='companies']")
	WebElement optioncompany;
	@FindBy(xpath="//div[@class='content card-header']/a[1][@name='help']/i[@class='right floated help circle icon color-gray']")
	WebElement activityStreamHlp;
	@FindBy(xpath="//div[@class='ui segment no-margin']/div[@class='content ui segment'][text()='activity_help']")
	WebElement activityStreamHlpcontent;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/a[2]/i[@class='right floated setting icon color-gray']")
	WebElement dealgearIcon;
	@FindBy(xpath="//button[@class='ui icon button']/i[@class='edit icon']")
	WebElement btnEdit;
	@FindBy(xpath="//input[@name='address']")
	WebElement txtadd;
	@FindBy(xpath="//i[@class='save icon']")
	WebElement btnSave;
	
	
	
	
	
	//Constructor
	public Home_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		}
	//Entering Login credentials
	public void login(String email,String pass) {
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(pass);
						
	}
	//Submit login
	public void submit() {
		btnLogin.click();
	}
	//Clicking home menu
	public void mnHome() {
		sUtil = new SeleniumUtilities(driver); 
		btnHome.click();
		sUtil.scrollDown();
	}
	
	//Verifying UI elements
	public void verifyUIElements() {
		       sUtil = new SeleniumUtilities(driver); 
		       String secDealstr ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[@class='header'][text()='Deals Summary']";
		       sUtil.existanceOfElementUsingxPath(secDealstr);
			   String refDealstr ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( refDealstr);
			   String gearDealstr ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( gearDealstr);
			   String hlpDealstr ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[1]/i[@class='right floated help circle icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( hlpDealstr);
			   String activityStream ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div[@class='header']";
			   sUtil.existanceOfElementUsingxPath( activityStream);
			   String actStrRef ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( actStrRef);
			   String actStrgear ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( actStrgear);
			   String dealRef ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( dealRef);
			   String dealGear ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/a[2]/i[@class='right floated setting icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( dealGear);
			   String dealHelp ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/a[1]/i[@class='right floated help circle icon color-gray']";
			   sUtil.existanceOfElementUsingxPath( dealHelp);
			   String callQueue="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/span[1][@class='header'][text()='Call Queue']";
			   sUtil.existanceOfElementUsingxPath( callQueue);
	}
	// click Deal Summary gear icon
	public void clickDealSummaryGearIcon() {
		sUtil = new SeleniumUtilities(driver);
		sUtil.alertHandle();
		gearDeal.click();
	}
	//Checking Deal Summary section filter option
	public void checkDealSummaryFilter() {
			Assert.assertEquals(true, fltrDeal.isDisplayed());
	}
	//Clicking Deal Summary Help Icon
	public void clickDealSummaryHelp() {
		hlpDeal.click();
			}
	
	// Checking Deal Summary section's help content
	public void checkingDealSummarySecHelpContent() {
		String dealSummaryHelpContent ="This card shows you the total running value of your deals across multiple metrics. You can customise the card's data by clicking the settings icon at the top right corner and selecting a saved search to use" ;
		Assert.assertEquals(dealSummaryHelpContent,hlpDealContent.getText());
	}
	
	//Clicking on Deal Summary section refresh icon
	public void dealSummaryRefIcon() {
		dealSumRef.click();
		
	}
	
	//Click Activity  Stream gear icon
	public void clickActivitySettingGear() {
		gearAct.click();
		
	}
	
	//Verifying Activity Stream Drop Down after clicking gear icon
	
	public void verifyActStreamDrpDn() {
		Assert.assertEquals(true, drpdn.isDisplayed());
		logger.info("Activity Stream drop down is displaying");
	}
	
	//Selecting Contact from Activity Stream drop down options
	public void  selectContactfromDropDown() {
		 sUtil = new SeleniumUtilities(driver); 
		  js = ((JavascriptExecutor) driver);
		 js.executeScript("window.scrollTo(0, 200)");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='dropdown icon']")));
		drpdn.click();
		sUtil.scrollDown();
		optioncontact.click();
		
	}
	
	//Verifying that at least one existing contact appear
	public void verifyContcat() {
		int contacts=driver.findElements(By.xpath("//div[@class='summary']/span[@class='user']/a")).size();
		if(contacts>0) {
			Assert.assertEquals(true, true);
			logger.info("Contacts on ActivityStream are displaying");
		}
		else {
			logger.info("Contacts on ActivityStream are not displaying");
			Assert.assertEquals(true,false);
		}
	
	}
	
	//Selecting Company from Activity Stream drop down options
		public void  selectCompanyfromDropDown() throws InterruptedException, AWTException {
			 sUtil = new SeleniumUtilities(driver); 
			 js = ((JavascriptExecutor) driver);
			  WebDriverWait wait = new WebDriverWait(driver,30);
			 sUtil.Explicitlywait("//div[@class='content card-header']//i[@class='right floated setting icon color-gray']");
			 sUtil.scrollUpUsinRobot();
			 Thread.sleep(3000);
			 gearAct.click();
			 sUtil.Explicitlywait("//i[@class='dropdown icon']");
			 drpdn.click();
			 optioncompany.click();
			
		}
		//Verifying that at least one existing company appear
		public void verifyCompany() {
			int compnys=driver.findElements(By.xpath("//div[@class='summary']/span[@class='user']/a")).size();
			if(compnys>0) {
				Assert.assertEquals(true, true);
			  logger.info("Companies on ActivityStream are displaying");
		}
		else {
			logger.info("Companies on ActivityStream are not displaying");
			Assert.assertEquals(true,false);
		}
		
		}
		
		//Clicking Activity Stream Help Icon
		public void clickOnActivityStreamHelpIcon() {
			activityStreamHlp.click();
		}
	// Verifying  activity steam help content 
		public void verifyActivityStreamHelp() {
			Assert.assertEquals(true, activityStreamHlpcontent.isDisplayed());
			logger.info("Avtivity Stream contents are displaying");
		}
		
		// Clicking on Deal Section Gear button
		public void clickOnDealSectionGearIcon() {
			dealgearIcon.click();
		}
	/*
	 * public void clickActivityDropdown() { //Thread.sleep(2000); drpdn.click(); }
	 */
	
	public void clickOption() {
		//Thread.sleep(2000);
		//optioncmpny.click();
		
	}
	public void selectCompany() {
		//Thread.sleep(2000);
		optioncompany.click();
		driver.navigate().to(driver.getCurrentUrl());
		//Thread.sleep(2000);
	}
	
	public void clickEdit() {
		//Thread.sleep(2000);
		btnEdit.click();
	}
	public void editAddress(String newAdd) {
		//Thread.sleep(2000);
		txtadd.clear();
		txtadd.sendKeys(newAdd);
		
	}
	
   public void save() {
	   btnSave.click();
	   
   }

}
