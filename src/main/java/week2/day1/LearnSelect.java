package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelect {

	public static void main(String[] args) {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//get URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		WebElement confpasword = driver.findElementById("userRegistrationForm:confpasword");
		Select dd = new Select(confpasword);
		//dd.selectByVisibleText("What is your pet name?");
		//dd.selectByValue("1");
		System.out.println(dd.getOptions().size());
		List<WebElement> allOptions = dd.getOptions();
		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}
		int count = allOptions.size();
		dd.selectByIndex(count-1);
		

	}

}













