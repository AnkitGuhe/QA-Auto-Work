package TestNG;
import org.testng.Assert;
import org.openqa.selenium.By;
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
 Ncust.NewCustmerName.sendKeys("Ankit Guhe");
 Ncust.RadBtnGender().click();
 }
 
 
 
}

