package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testNG.LearnExcel;
import wdMethods.ProjectMethods;

public class CreateLeadWithDataProvider extends ProjectMethods{
@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName,String phoneNum) throws InterruptedException {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), "email");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), phoneNum);
		click(locateElement("name", "submitButton"));		
	}
	@DataProvider(name="fetchData")
	public Object[][] fetchData() throws IOException {
		LearnExcel excel = new LearnExcel();		
		return excel.readExcel();
		
	}






	/*Object[][] data = new Object[2][5]; 
		data[0][0] = "TestLeaf";
		data[0][1] = "sarath";
		data[0][2] = "M";
		data[0][3] = "sarath@gmail.com";
		data[0][4] = 1234567890;
		
		data[1][0] = "CTS";
		data[1][1] = "senthil";
		data[1][2] = "S";
		data[1][3] = "senthil@gmail.com";
		data[1][4] = 1234567890;
		return data;*/























}












