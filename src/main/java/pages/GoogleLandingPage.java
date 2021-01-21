package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Util.CommonFunctionLib;
import objectrepository.GoogleLandingPage_OR;


public class GoogleLandingPage extends GoogleLandingPage_OR{
	
	
	private CommonFunctionLib cfl=new CommonFunctionLib();
	public GoogleLandingPage (WebDriver driver) {
	super(driver);	
	PageFactory.initElements(driver, this);
}
	
	public void searchForItem(String searchKey)
	{
		cfl.sendKeys(searchBox,searchKey);
		cfl.sendKeys(searchBox, Keys.ENTER);
	}
	public SecurePayHomePage clickOnlink()
	{
		cfl.webdriverClick(securePayLink);
		return new SecurePayHomePage(cfl.getDriver());
	}

}
