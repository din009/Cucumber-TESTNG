package org.pageobject;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObject {

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "re_password")
	private WebElement confirmPassword;

	@FindBy(id = "full_name")
	private WebElement fullName;

	@FindBy(id = "email_add")
	private WebElement emailAdd;

	@FindBy(id = "tnc_box")
	private WebElement termsConditionCheckbox;

	@FindBy(id = "Reset")
	private WebElement reset;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailAdd() {
		return emailAdd;
	}

	public WebElement getTermsConditionCheckbox() {
		return termsConditionCheckbox;
	}

	public WebElement getReset() {
		return reset;
	}

	public RegisterPageObject(BaseClass base) {
		PageFactory.initElements(base.getDriver(), this);
	}

}
