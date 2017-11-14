package locators;

import org.openqa.selenium.By;



public class ExpediaBookingLocators {
	
	        //for Origin
			public String OriginLoc= "//input[@id='package-origin-hp-package']";
			
			//for Destination
			public String DestiLoc = "//input[@id='package-destination-hp-package']";
			
			//for Departing date
			public String DepDateLoc = "//*[@id='package-departing-hp-package']";
			
			
			//for Returning date 
			public String RetDateLoc = "//*[@id='package-returning-hp-package']";
			
			//For departing date from calender
			//public String DepDateFrmCalLoc = "//div[@id='flight-departing-wrapper-hp-flight']/div/div/div[3]";
			//public String DepDateFrmCalLoc = "//[@id='datepicker']";
		
			//For random selection of returning date in Flight section
			//public String RetDateFrmCalLoc = "//div[@id='flight-returning-wrapper-hp-flight']/div/div/div[3]";
			
			//for selecting room using dropdown
			public String RoomNum = "//select[@id='package-rooms-hp-package']";
			////*[@id="package-rooms-hp-package"]
			
			//for adult number using dropdown
			public String AdultNum = "//select[@id='package-1-adults-hp-package']";
			
			//for child number using dropdown
			public String ChildNum = "//select[@id='package-1-children-hp-package']";
			
			//for prefered class
			public String PrefCls = "//select[@id='package-advanced-preferred-class-hp-package']";
			
			//for search button
			public String SrchBut = "//button=[@id='search-button-hp-package']";
			
			
						
						
			
			
			//For Search Button
			public String expSearchBtnLocator = "//button[@class= 'btn-primary btn-action gcw-submit']";
			
}
