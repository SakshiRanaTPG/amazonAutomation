package Operations;

import org.openqa.selenium.WebDriver;

import Pages.VerifyEmail;

public class VerifyEmailID extends Actions{
	
	
	public VerifyEmailID(WebDriver driver) {     
		super(driver);
	}

    public boolean VerifyHeading() {
        if(elementfind(VerifyEmail.VerifyHead)) {
        	return(true);
        }
        else {
        	return(false);
        }

    }

}
