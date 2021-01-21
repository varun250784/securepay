package pages;

import org.openqa.selenium.WebDriver;

import Util.CommonFunctionLib;




public class BasePage {
	public BasePage(WebDriver driver)
	{
		CommonFunctionLib cfl=new CommonFunctionLib();
		cfl.setDriver(driver);
	}
}
