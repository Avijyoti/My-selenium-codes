package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}	

	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement eleCRMSFA;

	public void clickCRMSFA() {
		click(eleCRMSFA);
	}
	@And("Verify the login is success")
	public void verifyLoginUserName() {
		System.out.println("verify login is success");
	}

















}













