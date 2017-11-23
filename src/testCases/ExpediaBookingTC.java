package testCases;

import org.testng.annotations.Test;

import base.Config;
import locators.ExpediaBookingLocators;
import util.WdFunction;
import value.ExpediaBookingValues;


public class ExpediaBookingTC extends Config {
	
	ExpediaBookingLocators ExpLoc = new ExpediaBookingLocators();
	ExpediaBookingValues   ExpLocVal = new ExpediaBookingValues ();

	
	@Test
	public void SearchForFlightsTC(){
	System.out.println("First test case");
	
	// for clicking Flights link
	clickByXpath(ExpLoc.FlightMod);
	
	//for clicking round-trip link
	clickByXpath(ExpLoc.RoundTrip);
	
	//for Flying-from textbox
	typeByXpath (ExpLoc.OriginLoc, ExpLocVal.OriginLocValue);
					
	//for Destination textBox 
	typeByXpath (ExpLoc.DestiLoc , ExpLocVal.DestiLocValue);
	
	//for opening calender
	//clickByXpath(ExpLoc.Calender);
					
	//for clicking departing date from calender
	typeByXpath (ExpLoc.DepDLoc, ExpLocVal.DepDateValue) ;
					
	//for clicking returning date from calender
	typeByXpath (ExpLoc.RetDateLoc,ExpLocVal.RetDateValue);
	
    //for clicking adult number
	dropdownById(ExpLoc.AdultNum,ExpLocVal.AdultValue);
	
	//for clicking children number
	dropdownById(ExpLoc.ChildNum,ExpLocVal.ChildValue);
	
	
	//for clicking search button
	clickByXpath(ExpLoc.SearchBut);

	
	
	
	
	
	
	}



}
