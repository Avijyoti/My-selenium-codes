package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");	
		
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//driver.switchTo().alert().accept();
		
		

	}

}
