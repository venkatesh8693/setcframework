package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class baseprogram {

 public static	WebDriver leaf;
@Test	
	public static void bright() throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		 leaf = new ChromeDriver();
		
		leaf.manage().window().maximize();
	}
}
