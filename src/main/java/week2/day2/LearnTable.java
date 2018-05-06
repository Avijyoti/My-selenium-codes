package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://erail.in/");		
		driver.manage().window().maximize();	
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS", Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SGE", Keys.TAB);

		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		
		if(selected) {
			driver.findElementById("chkSelectDateOnly").click();			
		}
		
		WebElement table = driver.findElementByXPath("//*[@id='divTrainsList']/table[1]");
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		WebElement row = rows.get(1);
		List<WebElement> cols = row.findElements(By.tagName("td"));
		WebElement secCol = cols.get(1);
		System.out.println(secCol.getText());
		
		
		
		
		
		
				
	}






}