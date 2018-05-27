package report;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC001_CreateLead", "Create a New Lead In LeafTaps");
		test.assignCategory("smoke");
		test.assignAuthor("lokesh");
		
		test.pass("The Data DemoSalesManager Entered Successfully",
				MediaEntityBuilder.
				createScreenCaptureFromPath("./../snaps/img1.png")
				.build());
		test.pass("The Data crmsfa Entered Successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("The Button Login Is Clicked Successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		extent.flush();

	}

}
