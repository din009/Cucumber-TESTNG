package org.pageobject;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {

	@FindBy(linkText = "New User Register Here")
	private WebElement newUserRegisterLink;

	public WebElement getNewUserRegisterLink() {
		return newUserRegisterLink;
	}
	
	public HomePageObject(BaseClass base) {

		PageFactory.initElements(base.getDriver(), this);
	}
}
