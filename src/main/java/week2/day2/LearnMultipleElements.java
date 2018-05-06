package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultipleElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("http://www.crystalcruises.com/travel-calendar?year=2018");
		
		// Find how many Get a Quote links available?
		List<WebElement> allQuotes = driver.findElementsByLinkText("REQUEST A QUOTE");
		int size = allQuotes.size();
		System.out.println(size);
		WebElement secondQ = allQuotes.get(1);
		secondQ.click();

	}

}








