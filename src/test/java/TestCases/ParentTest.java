package TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Operations.home;
import TestDataReader.TestDataReader;
import Utils.Web_driver;


public class ParentTest {

	protected WebDriver driver;
	TestDataReader TestDataReaderOBJ = new TestDataReader();
	home HomePageOBJ;
	
	 @BeforeClass
	    public void startBrowser(){
	        driver = Web_driver.getDriver();
	        driver.get(TestDataReaderOBJ.configFileReader());
	    }


	    @AfterClass
	    public void closeBrowser(){
	        driver.quit();
	    }
}
