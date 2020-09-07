package com.Pages.Calls;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class Calls_Page extends Library {
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement login;
	@FindBy(xpath="//span[@class='user-display'][contains(text(),'harisha kandepaneni')]")
	WebElement namedisplayed;
	@FindBy(xpath="//div[@id='main-nav']/a[@href='/calls']")
	WebElement clickcalls;
	@FindBy(xpath="//div[@class='item']/a[@href='/calls/new']")
	WebElement clicknew;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div[1]/div/input")
	WebElement entercalltime;
	@FindBy(xpath="//div[@class='ui fluid selection dropdown']")
	WebElement assignedto;
	@FindBy(xpath="//span[@class='text'][contains(text(),'harisha kandepaneni')]")
	WebElement assignedtoclick;
	@FindBy(xpath="//div[@name='type']")
	WebElement type;
	@FindBy(xpath="//span[contains(text(),'CONFERENCE')]")
	WebElement typeclick;
	@FindBy(xpath="//input[@name='duration']")
	WebElement duration;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[1]/div/input")
	WebElement starttime;
	@FindBy(xpath="//div[@name='flag']")
	WebElement flag;
	@FindBy(xpath="//span[contains(text(),'No Answer')]")
	WebElement flagclick;
	@FindBy(xpath="//*[@id=\'ui\']/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/label[2]/div/input")
	WebElement tags;
	@FindBy(name="description")
	WebElement description;
	@FindBy(xpath="//input[@placeholder='Number']")
	WebElement confcallnumber;
	@FindBy(xpath="//input[@name='identifier']")
	WebElement identifier;
	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='save icon']")
	WebElement save;
	@FindBy(xpath="//span[contains(text(),'Calls')]")
	WebElement clickcallsagain;
	@FindBy(xpath="//button[contains(text(),'Show Filters')]")
	WebElement showfilters;
	@FindBy(xpath="//input[@class='search']")
	WebElement searchdropdown;
	@FindBy(xpath="//span[contains(text(),'Call Time')]")
	WebElement selectsearch;
	@FindBy(xpath="//div[@name='operator']")
	WebElement clickoperatordropdown;
	@FindBy(xpath="//span[contains(text(),'Equals')]")
	WebElement selectoperatorfield;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div/div[3]/div/div[1]/div/input")
	WebElement clickthirddropdown;
	@FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--018']")
	WebElement selectdate;
	
	
	public Calls_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(String uname,String pas) {
		email.sendKeys(uname);
		password.sendKeys(pas);
			}
	public void login() {
		login.click();
	}
	public void name_displayed() {
		namedisplayed.isDisplayed();
	}
	public void click_calls() {
		clickcalls.click();
	}
	public void click_new() throws InterruptedException {
		clicknew.click();
		Thread.sleep(3000);
	}
	
	public void enter_calltime(String ctime) {
		entercalltime.sendKeys(ctime);
	}
	public void assignedto() {
		assignedto.click();
		assignedtoclick.click();
	}
	public void type() {
		type.click();
		typeclick.click();
	}
	public void duration(String durationofcall) {
		duration.sendKeys(durationofcall);
	}
	public void flag() {
		flag.click();
		flagclick.click();
	}
	public void tags( String[] tags1) throws InterruptedException {
		
		 
		  WebElement field=tags;		  
		  for (String tag1 : tags1) { 
			   field.sendKeys(tag1+"\n");
			   Actions action= new Actions(driver);
			   action.sendKeys(Keys.ENTER).perform();

			  //Thread.sleep(3000);
			  };
	}
	public void description(String desc) {
		description.sendKeys(desc);
	}
	public void starttime(String stime) {
		starttime.sendKeys(stime);
	}
	public void confcallnumber(String num) {
		confcallnumber.sendKeys(num);
	}
	public void identifier(String ident) {
		identifier.sendKeys(ident);
	}
	public void save() {
		save.click();
	}
	public void clickcallsagain() {
		clickcallsagain.click();
	}
	public void showfilters() {
		showfilters.click();
	}
	public void searchdropdown() {
		searchdropdown.click();
		selectsearch.click();
	}
	public void operatordropdown() {
		clickoperatordropdown.click();
		selectoperatorfield.click();
		
	}
	public void thirddropdown() {
		clickthirddropdown.click();
		selectdate.click();
	}
	
}