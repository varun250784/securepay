package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pages.BasePage;;

public class SecurePayHomePage_OR extends BasePage{
	public SecurePayHomePage_OR(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Contact us')]")
	protected WebElement contactUSLink;
}
