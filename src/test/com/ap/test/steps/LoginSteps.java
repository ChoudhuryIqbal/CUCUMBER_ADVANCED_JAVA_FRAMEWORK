/**
 * 
 */
package test.com.ap.test.steps;

import org.apache.log4j.Logger;

import com.ap.framework.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import test.com.ap.test.pages.HomePage;
import test.com.ap.test.seleniumTest.LoginTest;

/**
 * @author choudhuryIqbal
 *
 */
public class LoginSteps extends Base{
	public static final Logger log = Logger.getLogger(LoginSteps.class.getName());
	@Given("^I have navigated to the application$")
	public void i_have_navigated_to_the_application() throws Throwable {
		log.info("loading homepage");
		currentPage = GetInstance(HomePage.class);
		currentPage = currentPage.AS(HomePage.class).clickLogin();
	}

	@Given("^I see application opened$")
	public void i_see_application_opened() throws Throwable {
	  
	}

	@Then("^I click login link$")
	public void i_click_login_link() throws Throwable {
	   
	}

	@When("^I enter UserName and Password$")
	public void i_enter_UserName_and_Password(DataTable arg1) throws Throwable {

	}

	@Then("^I click login button$")
	public void i_click_login_button() throws Throwable {

	}

	@Then("^I should see the username$")
	public void i_should_see_the_username() throws Throwable {
	   
	}



}
