package steps;


import java.io.IOException;


import Util.CommonFunctionLib;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataproviders.ConfigFileReader;
import managers.DriverFactory;
import pages.ContactUsPage;
import pages.GoogleLandingPage;
import pages.SecurePayHomePage;

public class VerifyContactUS {

	private CommonFunctionLib cfl= new CommonFunctionLib();
	private ConfigFileReader cfr = new ConfigFileReader();
	private DriverFactory df = new DriverFactory();
	private GoogleLandingPage gp;
	private SecurePayHomePage shp;
	private ContactUsPage cup;
	
	@Given("^I launch google$")
	public void launchApp() throws IOException
	{
		df.getDriver();
		cfl.navigate_to_url(cfr.getApplicationUrl());
		gp=new GoogleLandingPage(df.getDriver());
	}
	
	
	@When("^I search for key\"([^\"]*)\"$")
	public void searchItem(String key) throws IOException
	{
		gp.searchForItem(key);
		
	}
	
	@Then("^I click on desired link$")
	public void clickOnlink() throws IOException
	{
		shp = gp.clickOnlink();
	}
	@And("^I navigate to the contact us page$")
	public void navigateToPage() throws IOException
	{
		cup=shp.clickContactUsLink();
	}
	
	@Then("^I fill the contact us form$")
	public void fillContactForm() throws IOException
	{
		cup.fillFirstName();
		cup.fillLastName();
		cup.fillEmailAddress();
		cup.fillPhoneNumber();
		cup.fillCompanyName();
		cup.fillWebsiteUrl();
		cup.fillBusinessAmountDD();
		cup.fillMessage();
	}
	@After public void cleanUp(){ 
	       df.closeDriver();
	   } 
}
