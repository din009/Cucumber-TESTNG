package org.stepdefenition;

import java.io.IOException;

import org.base.BaseClass;
import org.reportutils.ExtentManager;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestHooks extends ExtentManager{

	BaseClass base;
	
	public TestHooks(BaseClass base) {
		this.base = base;
	}

	@Before
	public void beforeMethod(Scenario scenario) {
		base.setDriver();
	}

	@AfterStep()
	public void afterscenario(Scenario scenario) {
		try {
			ExtentCucumberAdapter.getCurrentStep().addScreenCaptureFromBase64String("data:image/png;base64," + base.screenshot(base.getDriver(), scenario.getName()));
//			scenario.attach(base.screenshot(base.getDriver(), scenario.getName()),"image/png:base64",scenario.getName() );;
//			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath("data:image/png;base64," + base.screenshot(base.getDriver(), scenario.getName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			if (!scenario.isFailed()) {
//				t.getTest().pass(scenario.getName(),
//						MediaEntityBuilder.createScreenCaptureFromPath(
//								"data:image/png;base64," + base.screenshot(base.getDriver(), scenario.getName()))
//								.build());
//			}
//		} catch (Exception e) {
//			try {
//				t.getTest().fail(e.getStackTrace().toString(),
//						MediaEntityBuilder.createScreenCaptureFromPath(
//								"data:image/png;base64," + base.screenshot(base.getDriver(), scenario.getName()))
//								.build());
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		}
	}

	@After
	public void after() {
		base.driverClose();
	}
	
}
