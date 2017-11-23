package util;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Config;

public class WdFunction{
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

	public void typeByName (String locators, String values){
		driver.findElement(By.name(locators)).clear();
		driver.findElement (By.name(locators)).sendKeys (values);

	}
	public void typeById (String locators, String values){
		driver.findElement(By.id(locators)).clear();
		driver.findElement (By.id(locators)).sendKeys (values);

	}
	public void clickBycssSelector(String locators) {
    	driver.findElement(By.cssSelector(locators)).clear();
	    driver.findElement(By.cssSelector(locators)).click();
	}
	
	public String datepickerfromcal(String locators, String value){
		driver.findElement(By.id(locators)).click();
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='datepicker-dropdown']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("29"))
			{
				ele.click();
				//break;
			}
			
		}
		return value ;
		
	}
	
	public void clickByXpath (String locators){
		driver.findElement (By.xpath(locators)).click();

	}
	
		
	public void dropdownByXpath(String locators, String values){
		
		WebElement dd = driver.findElement(By.xpath(locators));
		Select ddSelect = new Select(dd);
		ddSelectByIndex(ddSelect);
	}
	
	public void dropdownById(String locators, String values){
		
		WebElement dd = driver.findElement(By.xpath(locators));
		Select ddSelect = new Select(dd);
		ddSelectByVisibleText(ddSelect, values);	
	}

		
	public  void ddSelectByIndex(Select sValue){
		sValue.selectByIndex(0);

	}
	
	
	public void ddSelectByVisibleText(Select sValue, String values){
		sValue.selectByValue("0");
    }


	
	public void maxPage (){
		
		driver.manage().window().maximize();
		
	}

}