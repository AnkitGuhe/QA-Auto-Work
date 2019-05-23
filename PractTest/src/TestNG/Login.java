package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

public class Login {
  WebDriver LoginDemodriver;
  
	

  public Login(WebDriver Demodriver1) 
	{
		this.LoginDemodriver= Demodriver1;
		PageFactory.initElements(Demodriver1, this);

	}
	@FindBy(name= "uid")
	WebElement UserName;
	@FindBy(name= "password")
	WebElement Password;
	@FindBy(name="btnLogin")
	WebElement SubmitBtn;
	
	public WebElement UserName()
	{
		return UserName;
	}
	
	public WebElement Password()
	{
		return Password;
	}
	public WebElement SubmitBtn()
	{
		return SubmitBtn;
	}
	
	
  }



