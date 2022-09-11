
package org.reportutils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private  ExtentReports extent;
	private  ExtentTest test;
	private  String reportFileName = "Test-Automaton-Report" + ".html";
	private  String fileSeperator = System.getProperty("file.separator");
	private  String reportFilepath = System.getProperty("user.dir") + fileSeperator + "Report";
	private  String reportFileLocation = reportFilepath + fileSeperator + reportFileName;

	
	public  ExtentReports getInstance() {
		if (extent == null) {
			createInstance();
		}
		return extent;
	}

	public  ExtentReports createInstance() {
		ExtentSparkReporter spark = new ExtentSparkReporter(reportFileLocation);
		extent = new ExtentReports();
		spark.config().setDocumentTitle("Addactin Cucumber Test");
		spark.config().setReportName("Cucumber Extent Report");
//		try {
//			spark.loadXMLConfig("avent-config.xml");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportFileLocation); 
		// htmlReporter.loadConfig("html-config.xml");
		extent.attachReporter(spark);
		return extent;
	}

	public  ExtentTest createTestlog(String testName) {
		test = getExtent().createTest(testName);
		return test;
	}

	public  ExtentReports getExtent() {
		return extent;
	}
	
	public ExtentTest getTest() {
		return test;
	}
}
