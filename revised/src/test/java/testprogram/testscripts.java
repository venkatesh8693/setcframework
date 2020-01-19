package testprogram;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageobject.pageclass;
import static loginconfiguration.logindetails.*;
import static objectidentifier.objects.*;
import static wapping.wapper.*;
import static pageobject.pageclass.*;

public class testscripts extends baseclass.baseprogram {
	
	static pageclass wallet;
	@Test
	public static void note() throws Exception{
		
		url(parent);
		multiwind(multi);	
	/*	userid(user,nameid);
		
		passd(pass,passid);
		
		signin(submit);*/
		
		pageclass wallet = new pageclass(leaf);
	
		wallet.user1();
		wallet.pass1();
		wallet.signin1();
	}

}
