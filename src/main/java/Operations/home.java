package Operations;

import org.openqa.selenium.WebDriver;

import Pages.homePage;

public class home extends Actions{
	public home(WebDriver driver) {     
		super(driver);
	}
	
	  public ReturnOrder clickReturns() {
	        click(homePage.ReturnBtn);
	        return new ReturnOrder(driver);
	    }
}
