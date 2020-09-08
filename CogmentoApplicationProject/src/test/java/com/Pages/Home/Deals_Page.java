package com.pages.Deals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumReusableFunctions.SeleniumUtilities;
import com.baseClass.Library;

public class Deals_Page extends Library{
	SeleniumUtilities sUtil;
	
	//Getting elements of Login Page
	@FindBy(name="email")
	WebElement txtEmail;
	@FindBy(name="password")
	WebElement txtPassword;
	@FindBy(xpath="//*[@id=\'ui\']/div/div/form/div/div[3]")
	WebElement btnLogin;
	
	
	//Getting elements for Deals Page
	@FindBy(xpath="//*[@id=\'main-nav\']/a[5]/span")
	WebElement btndeals;
	
	@FindBy(xpath="//th[contains(text(),'Title')]")
	WebElement Title;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3][text()='Company']")
	//@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]")
	WebElement Company;
	@FindBy(xpath="//th[contains(text(),'Close Date')]")
	WebElement CloseDate;
	@FindBy(xpath="//th[contains(text(),'Amount')]")
	WebElement Amount;
	@FindBy(xpath="//th[contains(text(),'Status')]")
	WebElement Status;
	@FindBy(xpath="//th[contains(text(),'Stage')]")
	WebElement Stage;
	@FindBy(xpath="//th[contains(text(),'Type')]")
	WebElement Type;
	@FindBy(xpath="//th[contains(text(),'Options')]")
	WebElement Options;
	@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[2]")
	WebElement title_asc_arrow;
	@FindBy(xpath="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[2]")
	WebElement title_desc_arrow;
	
	  @FindBy(xpath=
	  "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]")
	  WebElement company_asc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3]")
	  WebElement company_desc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[4]")
	  WebElement closed_date_asc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[4]")
	  WebElement closed_date_desc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\\'ui\\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[5]")
	  WebElement amount_asc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\\'ui\\']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[5]")
	  WebElement amount_desc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[6]")
	  WebElement status_asc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[6]")
	  WebElement status_desc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[7]")
	  WebElement stage_asc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[7]")
	  WebElement stage_desc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[8]")
	  WebElement type_asc_arrow;
	  
	  @FindBy(xpath=
	  "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[8]")
	  WebElement type_desc_arrow;
	 
	
	
	  @FindBy(xpath="//div[@class='ui fitted checkbox']//input") WebElement chkbox;
	  
	  @FindBy(xpath="//*[@id=\\'dashboard-toolbar\\']/div[2]/div/button[1]']")
	  WebElement Pipeline;
	 
	
	
	//Constructor
	public Deals_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		sUtil = new SeleniumUtilities(driver); 
	
}
	public void login(String email,String pass) {
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(pass);
	}
	
	public void submit() {
	btnLogin.click();
	}
	
	public void click_deals() {
		btndeals.click();
		
	}
	public void deals_elements() throws Exception  {
		//Thread.sleep(2000);
		Title.click();
		Thread.sleep(1000);
		Company.click();
		Thread.sleep(1000);
		CloseDate.click();
		Thread.sleep(1000);
		Amount.click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		Stage.click();
		Thread.sleep(1000);
		Type.click();
		Thread.sleep(1000);
		Options.click();
		Thread.sleep(1000);
		}
	
		
		  public void pipeline() { Pipeline.click(); }
		 
	
	public void title() throws Exception  {
		Title.click();
		Thread.sleep(1000);
		}
	
	public void title_arrow_button() throws Exception  {
		
		
		title_desc_arrow.click();
		Thread.sleep(2000);
		title_asc_arrow.click();
		Thread.sleep(2000);
	}
	
	public void company() {
		sUtil=new SeleniumUtilities(driver);
		String cmpystr="//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/thead/tr/th[3][text()='Company']";
		sUtil.Explicitlywait(cmpystr);
		Company.click();
	}

	
	  public void company_arrow_button() throws Exception {
	  company_desc_arrow.click(); Thread.sleep(1000); company_asc_arrow.click(); }
	 
	public void closed_date() {
		sUtil=new SeleniumUtilities(driver);
		String closeddatestr="//th[contains(text(),'Close Date')]";
		sUtil.Explicitlywait(closeddatestr);
		 CloseDate.click();
	}
	
	
	  public void closed_date_arrrow_button() throws Exception {
	  closed_date_desc_arrow.click(); Thread.sleep(2000);
	  closed_date_asc_arrow.click(); }
	 
	public void amount() {
		sUtil=new SeleniumUtilities(driver);
		String amountstr = "//th[contains(text(),'Amount')]";
		sUtil.Explicitlywait(amountstr);
		Amount.click();
	}

	
	  public void amount_arrrow_button() throws Exception {
	  amount_desc_arrow.click(); Thread.sleep(1000); amount_asc_arrow.click(); }
	 
	public void status() {
		sUtil=new SeleniumUtilities(driver);
		String statusstr = "//th[contains(text(),'Status')]";
		sUtil.Explicitlywait(statusstr);
		Status.click();
	}

	
	  public void status_arrrow_button() throws Exception {
	  status_desc_arrow.click(); Thread.sleep(1000); status_asc_arrow.click(); }
	 
	public void stage() {
		sUtil=new SeleniumUtilities(driver);
		String stagestr = "//th[contains(text(),'Stage')]";
		sUtil.Explicitlywait(stagestr);
		Stage.click();
	}

	
	  public void stage_arrrow_button() throws Exception {
	  stage_desc_arrow.click(); Thread.sleep(1000); stage_asc_arrow.click(); }
	 
	public void type() {
		sUtil=new SeleniumUtilities(driver);
		String typestr="//th[contains(text(),'Type')]";
		sUtil.Explicitlywait(typestr);
		Type.click();
	}

	
	  public void type_arrrow_button() throws Exception {
	  type_desc_arrow.click();
	  Thread.sleep(1000); 
	  type_asc_arrow.click(); }
	 
	public void options() {
		sUtil=new SeleniumUtilities(driver);
		String optionstr = "//th[contains(text(),'Options')]";
		sUtil.Explicitlywait(optionstr);
		Options.click();
	}
	
	
	  public void checkbox() { sUtil=new SeleniumUtilities(driver); String
	  boxstr="//div[@class='ui fitted checkbox']//input";
	  sUtil.Explicitlywait(boxstr); chkbox.click(); }
	 
	
	
	
	
	
	}
	
	
	
	

