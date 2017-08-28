/**
 * 
 */
package test.com.ap.test.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

/**
 * @author choudhuryIqbal
 *
 */
public class LoginSteps {
	@Given("^I have navigated to the application$")
	public void i_have_navigated_to_the_application() throws Throwable {
	   System.out.println("i am here");
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
