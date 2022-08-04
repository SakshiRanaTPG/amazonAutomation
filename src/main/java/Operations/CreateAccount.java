package Operations;

import org.openqa.selenium.WebDriver;

import Pages.CreateAccountPage;

public class CreateAccount extends Actions {
	public CreateAccount(WebDriver driver) {     
		super(driver);
	}
	
	public void Name(String name) {
        Text(CreateAccountPage.Name, name);
    }
	
	public void Email(String email) {
        Text(CreateAccountPage.Email, email);
    }
	
	public void password(String password) {
        Text(CreateAccountPage.Password, password);
    }
	
	public void passwordCheck(String passwordCheck) {
        Text(CreateAccountPage.PasswordCheck, passwordCheck);
    }
	
	public VerifyEmailID clickCreate() {
        click(CreateAccountPage.ContinueBtn);
        return new VerifyEmailID(driver);
    }
}
