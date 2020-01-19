package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static loginconfiguration.logindetails.*;
import static wapping.wapper.*;

public class pageclass extends baseclass.baseprogram {
	
	@FindBy(name="txtUserLoginID")
	WebElement username1;
	
	@FindBy(name="txtPassword")
	WebElement password1;
	
	@FindBy(className="dboxheader")
	WebElement signin;
	
	WebDriver page;
	
	public pageclass(WebDriver key){
		this.page =key;
		PageFactory.initElements(key, this);
	}

	public void user1() throws Exception{
		loginid(username1,nameid);
	}
		public void pass1() throws Exception{
			passd(password1,passid);
		}
		
		public void signin1() throws Exception{
			submit(signin);
		}
		
	}
	


