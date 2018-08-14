package einkAutomation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Daap {

	public static void main(String[] args) throws IOException {
		
		//taking Start and end dates form user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start date with mm/dd/yyyy pattern:");
		String inputStartDate= sc.next();
		System.out.println("Enter End date with mm/dd/yyyy pattern:");
		String inputEndDate= sc.next();
		
		//Automatic Date Finder of last 5 days
		/*DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String todate = dateFormat.format(date);
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -5);
        Date todate1 = cal.getTime();    
        String fromDate = dateFormat.format(todate1);
        
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, -1);
        Date todate2 = cal1.getTime();
        String endDate = dateFormat.format(todate2);*/
		
		//@author Avijyoti
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://daap.aka.corp.amazon.com:8000/utilization/");
		
		WebElement eleProjectDropDown = driver.findElementById("ddl_project");
		Select dropdown1 = new Select(eleProjectDropDown);
		dropdown1.selectByVisibleText("E-ink-DA");
		
		driver.findElementByXPath("//*[@id='div_filter']/div[2]/div/span/span[1]/span/ul").click();
		driver.findElementByXPath("//*[@id='div_filter']/div[2]/div/span/span[1]/span/ul/li[1]/span").click();
		
		WebElement eleTeamDropDown = driver.findElementById("ddl_team");
		Select dropdown2 =new Select(eleTeamDropDown);
		dropdown2.selectByVisibleText("Functional Regression");
		dropdown2.selectByVisibleText("Others");
		dropdown2.selectByVisibleText("KSO");
		
		//date range
		driver.findElementByXPath("//*[@id='daterange-btn']/i").click();
		
		//Select last 7 days
		//driver.findElementByXPath("/html/body/div[5]/div[1]/ul/li[3]").click();
		
		//click custom range
		driver.findElementByXPath("/html/body/div[5]/div[1]/ul/li[7]").click();
		
		//finding and giving the start date
		WebElement eleStartDate = driver.findElementByXPath("/html/body/div[5]/div[2]/div[1]/input");
		eleStartDate.clear();
		eleStartDate.sendKeys(inputStartDate);
		
		//finding and giving the end date
		WebElement eleEndDate = driver.findElementByXPath("/html/body/div[5]/div[3]/div[1]/input");
		eleEndDate.clear();
		eleEndDate.sendKeys(inputEndDate);
		
		//select start date		
		//driver.findElementByXPath("(//td[text()='4'])[2]").click();
		//select end date
		//driver.findElementByXPath("(//td[text()='8'])[2]").click();
		
		//click apply button
		driver.findElementByXPath("/html/body/div[5]/div[1]/div/button[1]").click();
		
		//click resource utilization
		driver.findElementByXPath("//*[@id='btn_ru']").click();
		
		//wait
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		String unplannedValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='row_click']/td[1]"))).getText();
		System.out.println("Unplanned: "+unplannedValue);
		
		String plannedValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='row_click']/td)[2]"))).getText();
		System.out.println("Planned: "+plannedValue);
		
		String nonProductiveValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='row_click']/td)[3]"))).getText();
		System.out.println("Non Productive: "+nonProductiveValue);
		
		String leaveValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='row_click']/td)[4]"))).getText();
		System.out.println("Non Productive: "+leaveValue);
		
		String trainingValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='row_click']/td)[5]"))).getText();
		System.out.println("Training: "+trainingValue);
		
		String funValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='row_click']/td)[6]"))).getText();
		System.out.println("Outing/Fun event: "+funValue);
		
		String testingsupportValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='row_click']/td)[7]"))).getText();
		System.out.println("Testing Support: "+testingsupportValue);
		
		String miscellaneousValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='row_click']/td)[8]"))).getText();
		System.out.println("Miscellaneous "+miscellaneousValue);
		sc.close();
		
		//writing Data to excel
		
		String data[][] = new String[2][8];
		data[0][0] = "Unplanned";
		data[0][1] = "Planned";
		data[0][2] = "Non Productive";
		data[0][3] = "Leave";
		data[0][4] = "Training";
		data[0][5] = "Outing/Fun Event";
		data[0][6] = "Testing Support";
		data[0][7] = "Miscellaneous";
		
		data[1][0] = unplannedValue.toString();
		data[1][1] = plannedValue.toString();
		data[1][2] = nonProductiveValue.toString();
		data[1][3] = leaveValue.toString();
		data[1][4] = trainingValue.toString();
		data[1][5] = funValue.toString();
		data[1][6] = testingsupportValue.toString();
		data[1][7] = miscellaneousValue.toString();
		
		XSSFWorkbook wbook = new XSSFWorkbook();
		//Create a sheet
		XSSFSheet sheet = wbook.createSheet("sheet1");
		int rowNumber = 0;
		for (String[] row : data) {
			//Create row
			XSSFRow createRow = sheet.createRow(rowNumber);
			int columnCount = 0;
			for (String columnData : row) {
				//Create cell
				XSSFCell createCell = createRow.createCell(columnCount);
				//Write data
				createCell.setCellValue(columnData);
				columnCount++;
			}
			rowNumber++;
		}
		//save
		FileOutputStream fos = new FileOutputStream(new File("C:/Users/avijyr/Desktop/WBRdata.xlsx"));
		wbook.write(fos);
		//close
		wbook.close();
	}

}
