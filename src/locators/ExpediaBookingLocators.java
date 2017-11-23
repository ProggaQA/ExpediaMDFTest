package locators;

import org.openqa.selenium.By;



public class ExpediaBookingLocators {
	    
	        //for navigating to Flights
	        public String FlightMod = "//*[@id='tab-flight-tab-hp']";
	        
	        //for navigating to roung-trip
	        public String RoundTrip = "//*[@id='flight-type-roundtrip-label-hp-flight']";
	     
	        //for Flying from 
			public String OriginLoc= "//input[@id='flight-origin-hp-flight']";
			
			//for Flying-to
			public String DestiLoc = "//input[@id='flight-destination-hp-flight']";
			
			//for clicking calender 
			public String Calender = "//*[@id='package-departing-wrapper-hp-package']/label/span[2]/span";
			
			//for Departing date  pick from calender
			public String DepDLoc = "//input[@id='flight-departing-hp-flight']";
			
			
			//for Returning date 
			public String RetDateLoc = "//input[@id='package-returning-hp-package']";
			
			//For departing date from calender
			//public String DepDateFrmCalLoc = "//div[@id='flight-departing-wrapper-hp-flight']/div/div/div[3]";
			//public String DepDateFrmCalLoc = "//[@id='datepicker']";
		
			//For random selection of returning date in Flight section
			//public String RetDateFrmCalLoc = "//div[@id='flight-returning-wrapper-hp-flight']/div/div/div[3]";
			
			//for adult number using dropdown
			public String AdultNum = "//select[@id='flight-adults-hp-flight']";
			
			//for child number using dropdown
			public String ChildNum = "//select[@id='flight-children-hp-flight']";
			
			
			//for Search Button
			public String SearchBut = "//button[@class= 'btn-primary btn-action gcw-submit']";
			
}
