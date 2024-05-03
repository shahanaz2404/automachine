package com.swaglabs.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//Declaration
	@FindBy(xpath="//input[@id='user-name']")private WebElement untxt;
	@FindBy(xpath="//input[@id='password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//getters
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
//BUsiness Library
	public void loginToApp(String Un,String Pwd) {
		untxt.sendKeys(Un);
		pwdtxt.sendKeys(Pwd);
		loginBtn.click();
	}
	
	
}
