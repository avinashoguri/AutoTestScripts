package stepDefenations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.FC_PageObjects;
import resources.Base;

public class FC_Test_StepDeffination extends Base{
	
	public static Logger log =LogManager.getLogger(FC_Test_StepDeffination.class.getName());
	FC_PageObjects fc;
	WebDriver driver;
	
	 @Given("^User is on Firecompass login page$")
	    public void user_is_on_firecompass_login_page() throws Throwable {
		 try{
				driver=initializeDriver();
				driver.get(prop.getProperty("url"));
				log.info("User is on Firecompass login page");
			}catch(Exception e) {
				log.error("Failed to load Login page URL ");
			}
	    }

	    @When("^enter invalid username and password$")
	    public void enter_invalid_username_and_password() throws Throwable {
	    	fc=new FC_PageObjects(driver);
	    	try {
				Thread.sleep(5000);  
				fc.username().sendKeys(prop.getProperty("username1"));
				fc.password().sendKeys(prop.getProperty("password1"));
				log.info("Entered in-valid username and password");
			}catch(Exception e) {
				log.error("Failed to Entered in-valid username and password");
			}
	    }

	    @When("^enter valid username and invalid password$")
	    public void enter_valid_username_and_invalid_password() throws Throwable {
	    	fc=new FC_PageObjects(driver);

	    	try {
				Thread.sleep(5000);  
				fc.username().sendKeys(prop.getProperty("username2"));
				fc.password().sendKeys(prop.getProperty("password2"));
				log.info("Entered in-valid username and password");
			}catch(Exception e) {
				log.error("Failed to Entered in-valid username and password");
			}
	    }

	    @Then("^enter login button$")
	    public void enter_login_button() throws Throwable {
	    	fc=new FC_PageObjects(driver);

	    	try{
				fc.LogInButton().click();
				log.info("entred login button");
			}catch(Exception e) {
				log.error("Failed to entred login button");
			}
	    }

	    @And("^application should display error promt$")
	    public void application_should_display_error_promt() throws Throwable {
	    	fc=new FC_PageObjects(driver);

	    	try {
	    		Thread.sleep(10000);
				String error=fc.errormsg().getText();
				Assert.assertEquals("Please enter valid username and password", error);
				System.out.println(error);
				log.info("application should display error promt");
				//driver.close();
			}catch(Exception e) {
				log.error("failed to application display error promt");
			}
	    }
}
