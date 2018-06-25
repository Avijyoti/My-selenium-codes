package challenge;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

public class AlertSnapUsingRobotClass {

	@Test
	public void takeSnap() throws AWTException, IOException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/forgotPassword.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.findElementById("forgot_passwrd:checkDetails1").click();
		
		Thread.sleep(3000);
		
		/*File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("./snaps/snap1.jpg"));
		// take snap		
*/		

		/*Robot rb = new Robot();
		rb.createScreenCapture(screenRect);*/
		
		BufferedImage image = new Robot().createScreenCapture
		(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		
		ImageIO.write(image, "png", new File("./snap/Alert.png"));
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}