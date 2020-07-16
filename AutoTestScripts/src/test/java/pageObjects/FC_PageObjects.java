package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FC_PageObjects {

	WebDriver driver;
	public FC_PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
				this.driver=driver;
				PageFactory.initElements(driver, this);
			
		}


	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;



	public WebElement username() {
		return username;
	}

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;

	public WebElement password() {
		return password;
	}

	@FindBy(xpath="//button[@class='btn btn-primary px-4']")
	WebElement LogInButton;

	public WebElement LogInButton() {
		return LogInButton;
	}

	@FindBy(xpath="//p[@class='color-txt-red']")
	WebElement errormsg;

	public WebElement errormsg() {
		return errormsg;
	}



}
