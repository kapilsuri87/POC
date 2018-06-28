package com.apium.poc.StepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.apium.poc.baseTest.BaseTest;
import com.apium.poc.baseTest.utilities.CommonFunctions;
import com.apium.poc.locators.Pages.Confirm_Registration_Page;
import com.apium.poc.locators.Pages.Home_Page;
import com.apium.poc.locators.Pages.New_Registration_Page;
import com.apium.poc.utilities.XlsReader;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTest extends BaseTest {
	CommonFunctions com_fun = new CommonFunctions();
	Home_Page hp = null;
	New_Registration_Page rp = null;
	Confirm_Registration_Page cp = null;
	String name, userName, email, pwd, lang, adds;
	int rowNum = 0;

	@Before
	public void beforeMethod() throws IOException {
		setUpEnvironment();
		openApplication();
	}

	@After
	public void afterMethod() {
		driver.quit();
	}

	@Given("^User opens Selendroid application$")
	public void user_opens_Selendroid_application() throws Throwable {
		hp = new Home_Page(driver);
		XlsReader XLR = new XlsReader(System.getProperty("user.dir") + CONFIG.getProperty("DATAXL_FILE_PATH"));
		int rowCount = XLR.getRowCount("New_Registration");
		for (int i = 2; i <= rowCount; i++) {
			if (XLR.getCellData("New_Registration", "Is_Used", i).isEmpty()) {
				name = XLR.getCellData("New_Registration", "Name", i);
				userName = XLR.getCellData("New_Registration", "UserName", i);
				email = XLR.getCellData("New_Registration", "Email", i);
				pwd = XLR.getCellData("New_Registration", "Password", i);
				lang = XLR.getCellData("New_Registration", "Language", i);
				adds = XLR.getCellData("New_Registration", "Add_Required", i);
				rowNum = i;
				break;
			}
		}
		if (rowNum == 0) {
				throw new NullPointerException("Please provide a valid record in the data file!!!");}
			

	}

	@When("^User clicks on Create New User icon$")
	public void user_clicks_on_Create_New_User_icon() throws Throwable {
		rp = hp.click_NewRegBttn();
	}

	@When("^Unser provides valid details and click on submit button$")
	public void unser_provides_valid_details_and_click_on_submit_button() throws Throwable {
		rp.clearType_userName(userName);

		rp.clearType_emailText(email);

		rp.clearType_pwdText(pwd);

		rp.clearType_nameText(name);

		com_fun.HideKeyBoard(driver);

		if (adds.equalsIgnoreCase("TRUE")) {
			if (rp.addsCkBox.isSelected() != true) {
				rp.selectCkBox_Adds();
			}
		}

		cp = rp.click_NewRegBttn();
	}

	@Then("^User details should be populated correctly on verify screen$")
	public void user_details_should_be_populated_correctly_on_verify_screen() throws Throwable {
		assertEquals(cp.getText_nameVerText(), name);
		assertEquals(cp.getText_userNameVerText(), userName);
		assertEquals(cp.getText_emailVerText(), email);
		assertEquals(cp.getText_passwordVerText(), pwd);
		assertEquals(cp.getText_acceptAddsVerText(), adds);
		assertEquals(cp.getText_langVerText(), lang);
		XlsReader XLR = new XlsReader(System.getProperty("user.dir") + CONFIG.getProperty("DATAXL_FILE_PATH"));
		XLR.setCellData("New_Registration", "Is_Used", rowNum, "Used");
	}

	@When("^user clicks on Confirm button$")
	public void user_clicks_on_Confirm_button() throws Throwable {
		hp = cp.click_finalRegisterBttn();

	}

	@Then("^homepage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
		assertTrue(hp.appTitle.isDisplayed());
	}

}
