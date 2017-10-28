package testCases;

import org.testng.annotations.Test;

import base.Config;
import locators.ExpediaBookingLocators;
import value.ExpediaBookingValues;


public class ExpediaBookingTC extends Config {
	ExpediaBookingLocators ExpLoc = new ExpediaBookingLocators();
	ExpediaBookingValues   ExpLocVal = new ExpediaBookingValues ();

	
	@Test
	public void SearchForFlightsTC(){
	System.out.println("First test case");
	
	
	//for Origin textBox  
	typeByXpath (ExpLoc.OriginLoc, ExpLocVal.OriginLocValue);
					
	//for Destination textBox 
	typeByXpath (ExpLoc.DestiLoc , ExpLocVal.DestiLocValue);
					
	//for clicking Departing date 
	clickByXpath (ExpLoc.DepDateLoc);					
	
	//for clicking Returning date 
	clickByXpath (ExpLoc.RetDateLoc);
	
	//for clicking departing date from calender
	clickByXpath (ExpLoc.DepDateFrmCalLoc) ;
					
	//for clicking returning date from calender
	clickByXpath (ExpLoc.RetDateFrmCalLoc);
	
	//for clicking room
	clickByXpath (ExpLoc.Room);
	
	//for clicking adult number
	clickByXpath(ExpLoc.AdultNum);
	
	//for clicking children number
	clickByXpath(ExpLoc.ChildNum);
	
	//for clicking preferred class
	clickByXpath(ExpLoc.PrefCls);
	
	//for clicking search button
	clickByXpath(ExpLoc.SrchBut);
}


}
