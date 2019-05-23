package LOGIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver CH = new ChromeDriver();
		String url =  "http://www.demo.guru99.com/V4/";
		String usernme= "mngr195228";
		String Pass = "YhYhUhU";
	CH.get(url);
	}

}
