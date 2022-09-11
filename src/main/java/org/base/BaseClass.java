package org.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	private WebDriver driver;
	public WebDriver getDriver() {
		if(driver==null) {
			setDriver();
		}
		return driver;
	}
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}

	public void hyperlinkClick(WebElement element) {
		element.click();
	}

	public void inputTextbox(WebElement element, String input) {
		element.sendKeys(input);
	}

	public void clickCheckbox(WebElement element) {
		element.click();
	}

	public void clickButton(WebElement element) {
		element.click();
	}

	public void implecitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void driverClose() {
		driver.quit();
	}
	public String screenshot(WebDriver _driver, String screenshotName) throws IOException {

//		File src= ((TakesScreenshot)_driver).getScreenshotAs(OutputType.FILE);
//		byte[] fileContent = FileUtils.readFileToByteArray(src);
//	    return fileContent;
	    
	    String value = ((TakesScreenshot)_driver).getScreenshotAs(OutputType.BASE64);
	    return value;
//		TakesScreenshot t= 	(TakesScreenshot)_driver;
//		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotAs,new File(System.getProperty("user.dir")+"/screenshot/"+screenshotName));
		
	}
}
