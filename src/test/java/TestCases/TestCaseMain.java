package TestCases;



import org.testng.annotations.Test;

import Operations.CreateAccount;
import Operations.ReturnOrder;
import Operations.VerifyEmailID;
import Operations.home;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;


public class TestCaseMain extends ParentTest {
	static home HomePageFuncOBJ;
	

	@Test
    public void InitiateHomePage(){
        HomePageFuncOBJ = new home(driver);
    }                                          //dont write it here// in parent test page
	
	@Test
	 public void TestAmazon() {
		// HomePageFuncOBJ = new home(driver);
    	ReturnOrder ReturnsPageOBJ = HomePageFuncOBJ.clickReturns(); 
    	Allure.step("Returns button clicked");
    	
    	CreateAccount CreateAccOBJ = ReturnsPageOBJ.clickCreateAcc();
    	Allure.step("Create account button clicked");
    	
    	CreateAccOBJ.Name("Alex adam");
    	CreateAccOBJ.Email("Alex@gmail.com");
    	CreateAccOBJ.password("Alex101299");
    	CreateAccOBJ.passwordCheck("Alex101299");
    	VerifyEmailID EmailOBJ = CreateAccOBJ.clickCreate();
    	Allure.step("Verify Email button clicked");
    	
    	if(EmailOBJ.VerifyHeading()) {
    		Allure.step("Heading verification Passed", Status.PASSED); 
    	}
    	else {
    	Allure.step("Heading verification Failed", Status.FAILED); 
    	}
    	
	}
}
