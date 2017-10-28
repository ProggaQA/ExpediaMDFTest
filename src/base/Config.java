package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import util.WdFunction;


public class Config extends WdFunction {
	
	@BeforeMethod
	public  void browserSetup(String browsername){
			
			if(browsername.equalsIgnoreCase("Chrome")){
				
					System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") +"//drivers//chromedriver.exe");
					ChromeOptions chromeOptions = new ChromeOptions();
					driver = new ChromeDriver(chromeOptions);
                    driver.manage().window().maximize();
				}
				else if(browsername.equalsIgnoreCase("firefox")){
					System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "//drivers//geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				else
		        {
		       throw new IllegalArgumentException ("The Browser Type is Undefined");
		        }

			}
	 
		@AfterMethod 
		  public void BrowserClose()
		    {
		       try {
		            driver.wait(20000);
		            }
		       catch (Exception e){
		             driver.close();
		           }
		    }		
					
	//setting the url	
	
	Config Br = new Config();
	public String url  = "https://www.expedia.com/";
	public String browser = "Firefox";
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("====TEST SUITE HAS STARTED====");
		Framework_Logs.info("====TEST SUITE HAS STARTED====");
		
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("====TEST SUITE HAS ENDED====");
		Framework_Logs.info("===TEST SUITE HAS ENDED===");
		
	}

	
	@BeforeTest
	public void beforeTest (){
	
		System.out.println("====BROWSER HAS STARTED====");
		Framework_Logs.info("====BROWSER HAS STARTED====");
		
		Br.browserSetup(browser);
		Framework_Logs.info("====FIREFOX HAS STARTED====");
		
		if(browser.equals("firefox") || browser.equals("chrome")){
			maxPage();
		}
		
		Framework_Logs.info("Opening Browser");
		driver.get(url);
		Framework_Logs.info(" http:// www.expedia.com");
		
	}

	@AfterTest
	public void afterTest (){
		System.out.println("Close the browser");
		Framework_Logs.info("Closed the Browser Successfully");
		driver.quit();
	}


}
