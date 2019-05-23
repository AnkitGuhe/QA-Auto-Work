package TestNG;
import org.testng.Assert;
import java.io.File;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTest {
	
	
	public WebDriver driver ;
String URL= "http://www.demo.guru99.com/V4/";
String driverpath =	("C:\\chromedriver_win32\\chromedriver.exe");
String userName= "mngr195228";
String Password= "YhYhUhU";
String scfile[]= {"1","2","3","4,","5"};
@BeforeTest
 public void LaunchBrowser()
 {
	 System.setProperty("webdriver.chrome.driver",driverpath);
	driver = new ChromeDriver();
 driver.get(URL);
 System.out.println("launching Chrome Browser");
 
 }
 
 @Test(priority=0)
  public void VerifyPageTitle() 
	{
		
	System.out.println("Chrome Browser is launched");
	System.out.println(driver.getTitle());
	String expectedTitle = "Guru99 Bank Home Page";
	String actualTitle = driver.getTitle();	
	Assert.assertEquals(actualTitle,expectedTitle);

  }

 @Test(priority= 1)
 public void login()
 {
	 
	 Login log = new Login(driver) ;
	 log.UserName.sendKeys(userName);
	 log.Password.sendKeys(Password);
	 log.SubmitBtn.click(); 
 }

 @Test(priority=2)

 public void NewCustomer()
 {
 
 NewCustomer Ncust= new NewCustomer(driver);
 Ncust.NewCustomer.click();
 driver.manage().window().maximize();
 
for (int i=0;i<=4;i++)
{
	 Ncust.NewCustmerName.sendKeys(Ncust.Name[i]);
	 Ncust.DOB.sendKeys(Ncust.DateOB[i]); 
	 Ncust.Addr.sendKeys(Ncust.Address[i]);
	 Ncust.RadBtnGender().click();
	 Ncust.pinno.sendKeys(Ncust.PIN[i]);
	 Ncust.emailid.sendKeys(Ncust.Email[i]);
	 Ncust.city.sendKeys(Ncust.City[i])	;
	 Ncust.password.sendKeys(Ncust.Pass[i]);
	 Ncust.telephoneno.sendKeys(Ncust.Mob[i]);
	 Ncust.State.sendKeys("Ontario");
	 Ncust.SubmitBtn.click();
	
	// Now you can do whatever you need to do with it, for example copy somewhere
	 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 try {
		 String fileName = new SimpleDateFormat("yyyyMMddHHmmss'.png'").format(new Date());
 FileUtils.copyFile(screenshotFile, new File("A:\\TestData\\"+fileName));
	
	 } 
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 Ncust.NewCustomer.click();
 }

 
}
}


