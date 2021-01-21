package pages;
import java.util.Locale;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import Util.CommonFunctionLib;
import objectrepository.ContactUsPage_OR;



public class ContactUsPage extends ContactUsPage_OR{

	private CommonFunctionLib cfl = new CommonFunctionLib();
	Faker faker =new Faker();
	
	public ContactUsPage(WebDriver driver)
	{
		
		super(driver);
		PageFactory.initElements(driver, this);
		// Verify Page is loaded
		new WebDriverWait(cfl.getDriver(), 60).until(ExpectedConditions.elementToBeClickable(firstName));
	}
	
	public void fillFirstName()
	{
		cfl.sendKeys(firstName,faker.name().firstName());
	}
	public void fillLastName()
	{
		cfl.sendKeys(lastName, faker.name().lastName());
	}
	public void fillEmailAddress()
	{
		cfl.sendKeys(workEmail, faker.internet().emailAddress());
	}
	public void fillPhoneNumber()
	{
		cfl.sendKeys(phoneNumber, faker.phoneNumber().cellPhone());
	}
	public void fillCompanyName()
	{
		cfl.sendKeys(companyName, faker.company().name());
	}
	public void fillWebsiteUrl()
	{
		cfl.sendKeys(website, faker.internet().url());
		cfl.sendKeys(website, Keys.TAB);
		
	}
	public void fillBusinessAmountDD()
	{
		cfl.selectFromDropDown(businessAmountDD,"Less than $100,000");
		cfl.sendKeys(businessAmountDD, Keys.TAB);
	}
	public void fillMessage()
	{
		cfl.sendKeys(message, faker.lorem().sentence());
		cfl.sendKeys(message, Keys.TAB);
	}
	
		
}
