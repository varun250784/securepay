package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pages.BasePage;



public class ContactUsPage_OR extends BasePage {
	public ContactUsPage_OR(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	protected WebElement firstName;
	@FindBy(how=How.XPATH, using="//input[@name='lastName']")
	protected WebElement lastName;
	@FindBy(how=How.XPATH, using="//input[@name='email']")
	protected WebElement workEmail;
	@FindBy(how=How.XPATH, using="//input[@name='phone']")
	protected WebElement phoneNumber;
	@FindBy(how=How.XPATH, using="//input[@name='company']")
	protected WebElement companyName;
	@FindBy(how=How.XPATH, using="//input[@name='website']")
	protected WebElement website;
	@FindBy(how=How.XPATH, using="//select[@name='amount']")
	protected WebElement businessAmountDD;
	@FindBy(how=How.XPATH, using="//textarea[@name='message']")
	protected WebElement message;
	
	@FindBy(how=How.XPATH, using="//input[@id='existingCustomer']")
	protected WebElement isExistingCustomer;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Send message')]")
	protected WebElement sendMessageButton;
}
