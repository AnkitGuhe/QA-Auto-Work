package LOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver
{
	static WebDriver Trial;
	public static WebDriver Trial1() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver Trial1 = new ChromeDriver();
		//Object Trail1 = Trail;
		String url =  "http://www.demo.guru99.com/V4/";
		return Trial;
    }
	

}
