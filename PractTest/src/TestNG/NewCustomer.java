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
  
  
  public WebElement NewCustomer()
{
return NewCustomer;
}

  public WebElement RadBtnGender ()
  {
  return RadBtnGender;
  }
 
  public static void main(String []args)
  {
try
  {
	 File New= new File("C:\\Users\\aguhe\\Desktop.a.xlsx");  
	 FileInputStream fis=new FileInputStream(New);
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet sh1= wb.getSheetAt(0);
	   System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());

  }
catch (Exception e) {
	 
	   System.out.println(e.getMessage());
	 
	  }
  } 
  
  
}

