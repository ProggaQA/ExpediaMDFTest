package locators;

public class ExpediaBookingLocators {
	
	        //for Origin
			public String OriginLoc= "//input[@id='package-origin-hp-package']";
			
			//for Destination
			public String DestiLoc = "//input[@id='package-destination-hp-package']";
			
			//for Departing date
			public String DepDateLoc = "//input[@id='flight-departing-hp-flight']";
			
			//for Returning date 
			public String RetDateLoc = "//input[@id='flight-returning-hp-flight']";
			
			//For departing date from calender
			public String DepDateFrmCalLoc = "//div[@id='flight-departing-wrapper-hp-flight']/div/div/div[3]";
		
			//For random selection of returning date in Flight section
			public String RetDateFrmCalLoc = "//div[@id='flight-returning-wrapper-hp-flight']/div/div/div[3]";
			
			//for selecting room
			public String Room = "//select=[@id='package-rooms-hp-package']";
			
			//for adult number
			public String AdultNum = "//select=[@class='num-adults gcw-storeable']";
			
			//for child number
			public String ChildNum = "//select=[@id='package-1-children-hp-package']";
			
			//for prefred class
			public String PrefCls = "//select=[@class='gcw-storeable gcw-show-with-value']";
			
			//for search button
			public String SrchBut = "//button=[@id='search-button-hp-package']";
			
			
						
						
			
			
			//For Search Button
			public String expSearchBtnLocator = "//button[@class= 'btn-primary btn-action gcw-submit']";
			
}
