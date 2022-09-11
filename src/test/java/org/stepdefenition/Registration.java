package org.stepdefenition;

import org.base.BaseClass;
import org.pageobject.HomePageObject;
import org.pageobject.RegisterPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	BaseClass base;
	RegisterPageObject regiser;
	HomePageObject homepage;
	
	public Registration(BaseClass base) {
		this.base = base;
		regiser = new RegisterPageObject(base);
		homepage = new HomePageObject(base);
	}

	@Given("Addatin homepage loaded sucessfully")
	public void addatin_homepage_loaded_sucessfully() {
		base.getUrl("https://adactinhotelapp.com/");
		base.hyperlinkClick(homepage.getNewUserRegisterLink());
	}

	@Given("click on the New user registration link")
	public void click_on_the_new_user_registration_link() throws InterruptedException {
		
//		hyperlinkClick(hp.getNewUserRegisterLink());
//		Thread.sleep(2000);
	}
	
	
	@When("input username with {string}")
	public void input_username_with(String string) {
		base.inputTextbox(regiser.getUsername(), string);

	}

	@When("input password with {string}")
	public void input_password_with(String string) {
		base.inputTextbox(regiser.getPassword(), string);
	}

	@When("input confirmpassword with {string}")
	public void input_confirmpassword_with(String string) {
		base.inputTextbox(regiser.getConfirmPassword(), string);
	}

	@When("input fullname with {string}")
	public void input_fullname_with(String string) {
		base.inputTextbox(regiser.getFullName(), string);
	}

	@When("input emailid with {string}")
	public void input_emailid_with(String string) {
		base.inputTextbox(regiser.getEmailAdd(), string);
	}

	@Then("confirm user has been registered sucessfully")
	public void confirm_user_has_been_registered_sucessfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("confirm user has been registered sucessfully");
	}
}
