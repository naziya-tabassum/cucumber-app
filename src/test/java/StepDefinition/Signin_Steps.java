package StepDefinition;
import org.openqa.selenium.WebDriver;
import com.qa.factory.Driver_Factory;
import com.qa.Pages.Signin_page;
import App_Hooks.Application_Hooks;
import io.cucumber.java.en.*;

public class Signin_Steps {
	WebDriver driver;
	 Application_Hooks hook=new  Application_Hooks();
	private Signin_page page=new Signin_page(Driver_Factory.getDriver());
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		Driver_Factory.getDriver().get("https://122.175.43.71:2801/");
	
		
	}
	@And("User click on emslogin button")
	public void user_click_on_emslogin_button() {
	  page.click_on_ems() ;
	}
	@When("User enter Username{string} and password{string}")
	public void user_enter_username_admin_pathbreaker_com_and_password_passw0rd(String username,String password) {
		
		page.user_enter_username(username);
		page.user_enter_password(password);
	}
	@Then("User can verify the logo should be dipslayed or not after logging")
	public void user_can_verify_the_logo_should_be_dipslayed_or_not_after_logging() throws InterruptedException {
		page.logo_displayed();
	}
	@And("User click on login button")
	public void user_click_on_login_button() {
	  page.click_on_signin();
	}
	@When("Hamburger button is working or not")
	public void hamburger_button_is_working_or_not() {
		page.click_on_hamburger();
	}
	@When("^User enter invalid (.*) and invalid (.*)$")
	public void user_enter_invalid_username_and_invalid_password(String username,String password) {
		page.user_enter_username(username);
		page.user_enter_password(password);






	}
}
