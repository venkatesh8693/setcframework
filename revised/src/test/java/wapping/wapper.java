package wapping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static pageobject.pageclass.*;

public class wapper extends baseclass.baseprogram {

	public static  void url(String urlpage) throws Exception{
	
		leaf.get(urlpage);
		}
		
	public static void multiwind(By multipage) throws Exception{
		leaf.findElement(multipage).click();
	}
	
	public static void userid(By username, String uservalues) throws Exception{
		leaf.findElement(username).sendKeys(uservalues);
	}
	
	public static void passd(By passname,String passvalues) throws Exception{
		
		leaf.findElement(passname).sendKeys(passvalues);
	}
	
	public static void signin(By submit) throws Exception{
		
		leaf.findElement(submit).click();
	}
	
	public static void loginid(WebElement look, String text) throws Exception{
		look.sendKeys(text);
	}
	
	public static void passd(WebElement neat,String find) throws Exception{
		neat.sendKeys(find);
	}
	public static void submit(WebElement sign) throws Exception{
		sign.click();
	}
	}

