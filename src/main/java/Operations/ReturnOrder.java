package Operations;

import org.openqa.selenium.WebDriver;

import Pages.ReturnPage;

public class ReturnOrder extends Actions {
	public ReturnOrder(WebDriver driver) {     
		super(driver);
	}
	public CreateAccount clickCreateAcc() {
        click(ReturnPage.CreateAccBtn);
        return new CreateAccount(driver);
    }
}
