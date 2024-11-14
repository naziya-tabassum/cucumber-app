package com.qa.Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signin_page {
	private WebDriver driver;
    private WebDriverWait wait;
    public Signin_page(WebDriver driver) {
    	this.driver=driver;
    	this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	 PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//button[text()='EMS Login']")
    WebElement click_on_emslogin_btn;
    @FindBy(name="username")
    WebElement Enter_usrname;
    @FindBy(name="password")
    WebElement Enter_pwd;
    @FindBy(xpath="//button[text()='Sign in']")
    WebElement click_on_signin_btn;
    @FindBy(xpath="//a[@class='sidebar-toggle js-sidebar-toggle']")WebElement click_hamburger;
    @FindBy (xpath="//img[@class='align-middle']")WebElement logo;
    public void click_on_ems() {
   	 driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
   	 click_on_emslogin_btn.click();
    }
    public void user_enter_username(String uname) {
   	 Enter_usrname.sendKeys(uname);
    }
    public void user_enter_password(String pwd) {
   	 Enter_pwd.sendKeys(pwd);
    }
    public void click_on_signin() {
   	 click_on_signin_btn.click();
    }
    public void click_on_hamburger() {
   	 wait.until(ExpectedConditions.visibilityOf(click_hamburger)).click();
    }
    public void logo_displayed()  {
   	
   	 System.out.println(logo.isDisplayed());
    }




	
}
