package Pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
	public static final By CreateAccHeading  = By.xpath("//h1[@class='a-spacing-small']");
	public static final By Name  = By.xpath("//input[@id='ap_customer_name']");
	public static final By Email  = By.xpath("//input[@id='ap_email']");
	public static final By Password  = By.xpath("//input[@id='ap_password']");
	public static final By PasswordCheck  = By.xpath("//input[@id='ap_password_check']");
	public static final By ContinueBtn  = By.xpath("//input[@id='continue']");	
}
