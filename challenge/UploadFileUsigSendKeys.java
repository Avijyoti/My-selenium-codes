package challenge;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class UploadFileUsigSendKeys {
	@Test
	public  void main() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@type='file']").sendKeys("C://resume.docx");


	}

}


