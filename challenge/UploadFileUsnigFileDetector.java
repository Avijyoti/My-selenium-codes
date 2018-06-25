package challenge;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class UploadFileUsnigFileDetector {

	public static final String USERNAME = "";
	public static final String ACCESS_KEY = "";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	@Test
	public  void main() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		/*ChromeOptions op = new ChromeOptions();
		op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();*/		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), dc);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		String version = driver.getCapabilities().getVersion();
		System.out.println(version);
		WebElement ele = driver.findElementByXPath
				("//input[@type='file']");
		LocalFileDetector detector = new LocalFileDetector();
		((RemoteWebElement)ele).setFileDetector(detector);
		ele.sendKeys(detector.getLocalFile("C://resume.docx")
				.getAbsolutePath());
		

	}

}


