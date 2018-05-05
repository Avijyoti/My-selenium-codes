package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//get URL
		driver.get("http://leaftaps.com/opentaps/");
		//Enter Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementById("password").sendKeys("crmsfa",Keys.TAB);
		Thread.sleep(3000);
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

}

}













