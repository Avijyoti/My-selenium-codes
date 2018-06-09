package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setValue() {
		dataSheetName = "TC001";
		browserName ="chrome";
		authors = "Babu";
		category = "smoke";
		testCaseName = "CreateLead";
		testDescription = "Create a new Lead";
		testNodes = "leads";				
	}
	
	@Test(dataProvider = "fetchData")
	public void createLead(String userName, String password) {
		new LoginPage()
		.typeUserName(userName)
		.typePassword(password)
		.clickLogin()
		.clickCRMSFA();
	}

}







