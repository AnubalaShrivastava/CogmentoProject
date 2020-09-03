package com.Pages.Home;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;
import com.SeleniumReusableFunctions.SeleniumUtilities;

public class Home_Page extends Library{
	
	SeleniumUtilities sUtil;
	//Getting elements for login
	@FindBy(name="email")
	WebElement txtEmail;
	@FindBy(name="password")
	WebElement txtPassword;
	@FindBy(xpath="//*[@id=\'ui\']/div/div/form/div/div[3]")
	WebElement btnLogin;
	 
	/*
	 * //Getting elements of UIs
	 * 
	 * @FindBy(
	 * xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[@class='header'][text()='Deals Summary']"
	 * ) WebElement secDeal;
	 * 
	 * @FindBy(
	 * xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']"
	 * ) WebElement refDeal;
	 * 
	 * @FindBy(
	 * xpath="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[2]/i[@class='right floated setting icon color-gray']"
	 * ) WebElement gearDeal;
	 */
	
    //Getting elements for edit company address	
	@FindBy(xpath="//*[@id='main-nav']/a[1]/span[text()='Home']")
	WebElement btnHome;
	@FindBy(xpath="//div[@class='content card-header']//i[@class='right floated setting icon color-gray']")
	WebElement gearAct;
	@FindBy(xpath="//i[@class='dropdown icon']")
	WebElement drpdn;
	@FindBy(xpath="//span[text()='companies']")
	WebElement option;
	@FindBy(xpath="//a[text()='Cloud X Analytics']")
	WebElement cmpnylink;
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
		sUtil = new SeleniumUtilities(driver); 
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
	
	public void mnHome() {
		btnHome.click();
		sUtil.scrollDown();
	}
	
	//Verifying UI elements
	public void verifyUIElements() {
		        String secDeal ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div[@class='header'][text()='Deals Summary']";
		        sUtil.existElement("xpath", secDeal);
				String refDeal ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
				sUtil.existElement("xpath", refDeal);
				String gearDeal ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
				sUtil.existElement("xpath", gearDeal);
				String hlpDeal ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a[1]/i[@class='right floated help circle icon color-gray']";
				sUtil.existElement("xpath", hlpDeal);
				String activityStream ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div[@class='header']";
				sUtil.existElement("xpath", activityStream);
				String actStrRef ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
				sUtil.existElement("xpath", actStrRef);
				String actStrgear ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
				sUtil.existElement("xpath", actStrRef);
				String dealRef ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/a[3]/i[@class='right floated refresh icon color-gray']";
				sUtil.existElement("xpath", dealRef);
				String dealGear ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/a[2]/i[@class='right floated setting icon color-gray']";
				sUtil.existElement("xpath", dealGear);
				String dealHelp ="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div[1]/a[1]/i[@class='right floated help circle icon color-gray']";
				sUtil.existElement("xpath", dealHelp);
				String callQueue="//*[@id='ui']/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/span[1][@class='header'][text()='Call Queue']";
				sUtil.existElement("xpath", callQueue);
	}
	
	//Editing company address
	public void clickSettingGear() {
		//Thread.sleep(2000);
		gearAct.click();
		
	}
	
	public void clickActivityDropdown()  {
		//Thread.sleep(2000);
		drpdn.click();
	}
	
	public void clickOption() {
		//Thread.sleep(2000);
		option.click();
		
	}
	public void selectCompany() {
		//Thread.sleep(2000);
		cmpnylink.click();
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
