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
					
	
	//for clicking departing date from calender
	typeByXpath (ExpLoc.DepDateLoc, ExpLocVal.DepDateValue) ;
					
	//for clicking returning date from calender
	typeByXpath (ExpLoc.RetDateLoc,ExpLocVal.RetDateValue);
	
	//for clicking room
	dropdownByXpath(ExpLoc.RoomNum,ExpLocVal.RoomValue);
	
	//for clicking adult number
	dropdownById(ExpLoc.AdultNum,ExpLocVal.AdultValue);
	
	//for clicking children number
	dropdownByXpath(ExpLoc.ChildNum,ExpLocVal.ChildValue);
	
	//for clicking preferred class
	dropdownById(ExpLoc.PrefCls,ExpLocVal.PrefClsValue);
	
	//for clicking search button
	clickByXpath(ExpLoc.SrchBut);
}



}
