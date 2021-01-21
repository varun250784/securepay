package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pages.BasePage;






public class GoogleLandingPage_OR extends BasePage {
	public GoogleLandingPage_OR(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='q']")
	protected WebElement searchBox;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(), 'SecurePay | Trusted Online Payment Gateway Provider in')]")
	protected WebElement securePayLink;
}
