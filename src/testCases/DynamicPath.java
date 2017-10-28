package testCases;

import org.testng.annotations.Test;

public class DynamicPath {
	
	@Test
	public void dyanamicPathTest (){
		System.out.println("my current path is " + System.getProperty("user.dir"));
		System.out.println("full URL "+ System.getProperty("user.dir")+ "/drivers/geckodriver.exe");
		
}

}
