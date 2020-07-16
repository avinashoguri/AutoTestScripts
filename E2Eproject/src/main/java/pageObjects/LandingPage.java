package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	WebElement loginLink;
	
	@FindBy(id="user_email")
	WebElement email;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement logIn;
	
	@FindBy(xpath="//h2[contains(text(),'Featured Courses')]")
	WebElement gettitle;
	
	@FindBy(xpath="//h2[contains(text(),'Featured Courses')]")
	WebElement navigationBar;
	
	
	
	
	public WebElement loginLink() {
		return loginLink;
	}
	
	public WebElement email() {
		return email;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement logIn() {
		return logIn;
	}
	public WebElement gettitle() {
		return gettitle;
	}
	public WebElement navigationBar() {
		return navigationBar;
	}
	
	
}
