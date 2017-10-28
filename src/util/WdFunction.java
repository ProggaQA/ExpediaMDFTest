package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WdFunction {
	public static WebDriver driver;
	public static Logger Framework_Logs = Logger.getLogger("  ");
	
	
	
	public void typeByXpath (String locators, String values){
		try {
			driver.findElement(By.xpath(locators)).clear();
			driver.findElement (By.xpath(locators)).sendKeys (values);
		} 
		catch (Exception e){
			System.err.println("ERROR:"  + e.getMessage());
			Framework_Logs.debug("ERROR:" + e.getMessage());
		}
	}

	public void typeById (String locators, String values){
		try{
		driver.findElement(By.id(locators)).clear();
		driver.findElement (By.id(locators)).sendKeys (values);
		}
		catch(Exception e){
			Framework_Logs.debug("ERROR :" + e.getMessage());
			Framework_Logs.debug("ERROR :" + e.getMessage());
		}

	}
	
	public void typeByName (String locators, String values){
		try{
		driver.findElement(By.name(locators)).clear();
		driver.findElement (By.name(locators)).sendKeys (values);
		}
		catch(Exception e){
			Framework_Logs.debug("ERROR :" + e.getMessage());
			Framework_Logs.debug("ERROR :" + e.getMessage());
		}

	}
	

	public void clickByXpath (String locators){
		try{
		driver.findElement (By.xpath(locators)).click();
		}
		catch(Exception e){
			Framework_Logs.debug("ERROR :" + e.getMessage());
			Framework_Logs.debug("ERROR :" + e.getMessage());
		}

	}
	
	public void maxPage (){
		
		driver.manage().window().maximize();
		}

}
