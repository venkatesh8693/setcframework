package multiwindow;

import static loginconfiguration.logindetails.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class multipage extends baseclass.baseprogram {
	
	@Test
	public static void mainwindow() throws Exception{
		
		leaf.get(parent);
		
		String parentwindow=leaf.getWindowHandle();
		
		leaf.findElement(By.xpath("//td[17]/div/a[@class='tabtextnormalA']")).click();
		
		Thread.sleep(3000);
		
		for(String childwindow : leaf.getWindowHandles()){
			
			if(childwindow!=parentwindow){
				
				leaf.switchTo().window(childwindow);			}
			
		}
	}
	
	
	
	

}
