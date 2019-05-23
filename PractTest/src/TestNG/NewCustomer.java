package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewCustomer {
WebDriver NewCustDriver;
String Address[]= {"713 Activa","2969 kingsway","1565 windsor","1208 Kingsway"};

String Name[]= {"Ankit", "Ash", "shivani", "Akshay"};
String DateOB[]= {"12211993", "12241993", "04211994", "07091993*)"};
String City[]= {"Kitchener", "windsor", "waterloo", "cambridge"};
String PIN[]= {"123456", "234567", "234243", "675665"};
String Mob[]= {"2266069229", "2265088082", "2265813004", "2267490768"};
String Email[]= {"A1.guhe22@gmail.com", "A28082@gmail.com", "s121194@gmail.com", "al0709@gmail.com"};
String Pass[]= {"Ankit", "Ash", "shivani", "Akshay"};

public NewCustomer(WebDriver NewCustDriver1)

	{
	this.NewCustDriver= NewCustDriver1;
	PageFactory.initElements(NewCustDriver1, this);

	}
  
	  @FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	  WebElement NewCustomer;
	
	  @FindBy(name="name")
	  WebElement NewCustmerName;
  
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
	WebElement RadBtnGender;
	
	@FindBy(id="dob")
	WebElement DOB;
	@FindBy(name= "addr")
	WebElement Addr;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="pinno")
	WebElement pinno;
	
	@FindBy(name="telephoneno")
	WebElement telephoneno;
	
	@FindBy(name="emailid")
	WebElement emailid;  
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name= "state")
    WebElement State; 
@FindBy(name= "sub")
WebElement SubmitBtn;
	
	
  public WebElement NewCustomer()
{
return NewCustomer;
}

  public WebElement RadBtnGender ()
  {
  return RadBtnGender;
  }
 
  public WebElement DOB()
  {
	  return DOB;
  }
  
public WebElement Addr()
{
	
return Addr;	
}
public WebElement city()
{
	
return city;	
}

public WebElement pinno()
{
	
return pinno;	
}

public WebElement telephoneno()
{
	
return telephoneno;	
}

public WebElement password()
{
	
return emailid;	
}

public WebElement emailid()
{
	
return password;	
}

public WebElement State()
{
	
return State;	
}

public WebElement SubBtn()
{
	
return SubmitBtn;	
}




}

