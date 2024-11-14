package StepDefinition;

import org.openqa.selenium.WebDriver;

import com.qa.Pages.Company_RegistrationPage;
import com.qa.factory.Driver_Factory;

import App_Hooks.Application_Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Company_RegistrationSteps {
	
	WebDriver driver;
	 Application_Hooks hook=new  Application_Hooks();
	private Company_RegistrationPage page=new Company_RegistrationPage(Driver_Factory.getDriver());
	@Given("User is on application login page")
	public void user_is_on_application_login_page() {
		
		Driver_Factory.getDriver().get("https://122.175.43.71:2801/");
	}

	@When("User provides Username{string} and password{string}")
	public void user_provides_username_admin_pathbreaker_com_and_password_passw0rd(String username,String password) {
		page.user_enter_username(username);
		page.user_enter_password(password);
		
	}

	@When("Hamburger button is working proerly or not")
	public void hamburger_button_is_working_proerly_or_not() {
		page.click_on_hamburger();
	}

	//@Then("User can verify the logo should be dipslayed or not after logging the application")
	//public void user_can_verify_the_logo_should_be_dipslayed_or_not_after_logging_the_application() {
		//page.logo_displayed();
	//}

	@Then("user click on employer tab")
	public void user_click_on_employer_tab() {
		page.employertab();
	}

	@Then("user selects registration option")
	public void user_selects_registration_option() {
		page.registrationtab();
	}

	@Then("user selects company type")
	public void user_selects_company_type() {
		page.companytype();
	}

	@When("user enters valid details as {string},  {string}, {string}, {string}, {string},  {string}, {string},  {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void user_enters_valid_details_as(String companyname,String service_name, String compay_emailid, String password, String contact_number, String alternate_number, String company_address, String company_cin_number, String gst_number, String PAN_number, String authorised_name, String personal_emailid,String personal_mobile_number, String authorised_address)
	{
	
		page.companyName(companyname);
		page.serviceName(service_name);
		page.CompanyEmailId(compay_emailid);
		page.Password(password);
		page.ContactNumber(contact_number);
		page.AlternateNumber(alternate_number);
		page.CompanyAddress(company_address);
		page.CompanyCINNumber(company_cin_number);
		page.gstNumber(gst_number);
		page.PANnumber(PAN_number);
		page.authorisedName(authorised_name);
		page.PersonalEmailId(personal_emailid);
		page.PersonalMblNumber(personal_mobile_number);
		page.authorisedAddress(authorised_address);
		
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {
	page.submitbutton();

}
}
