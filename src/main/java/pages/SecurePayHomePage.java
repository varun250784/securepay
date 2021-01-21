package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Util.CommonFunctionLib;
import objectrepository.SecurePayHomePage_OR;



public class SecurePayHomePage extends SecurePayHomePage_OR{ 
	
	private CommonFunctionLib cfl = new CommonFunctionLib();
	
	public SecurePayHomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public ContactUsPage clickContactUsLink()
	{
		cfl.webdriverClick(contactUSLink);
		
		return new ContactUsPage(cfl.getDriver());	
	}
	
	

}
