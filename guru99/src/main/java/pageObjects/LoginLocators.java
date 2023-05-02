package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {

	WebDriver ldriver;

	public  LoginLocators(WebDriver rdriver)
	{
	    ldriver = rdriver;
	    PageFactory.initElements(rdriver,this);
	}

	
	@FindBy(how = How.XPATH, using = "//input[@name='userName']")
	public WebElement username;
	@FindBy(how = How.XPATH,using ="//input[@type='password']")
	public WebElement password;
	@FindBy(how= How.XPATH,using="//input[@type='submit']")
	public WebElement login;
}
