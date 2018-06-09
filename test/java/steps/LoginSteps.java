/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public static RemoteWebDriver driver;
	@Given("Invoke LeafTap Application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the UserName as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	@And("Enter the Password as (.*)")
	public void enterPassWord(String passWord) {
		driver.findElementById("password").sendKeys(passWord);
	}
	@When("Click on login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify the login is success")
	public void verifyLogon() {
		System.out.println("Login is successful");
	}
	@But("Verify Login is fail")
	public void verifyLoginFail() {
		System.out.println("Login is fail");
	}
	

























}





*/