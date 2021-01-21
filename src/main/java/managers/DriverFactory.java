package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Util.CommonFunctionLib;
import dataproviders.ConfigFileReader;

public class DriverFactory {

	private WebDriver driver;
	private CommonFunctionLib cfl= new CommonFunctionLib();
	private ConfigFileReader cfr = new ConfigFileReader();
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";


	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		cfl.setDriver(driver);
		return driver;
	}


	private WebDriver createDriver() {

		if(cfr.getDriverName().equalsIgnoreCase("ie"))
			this.driver  = new InternetExplorerDriver();
		else  {
			System.setProperty(CHROME_DRIVER_PROPERTY, cfr.getDriverPath());
			this.driver  = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(cfr.getImplicitWait(), TimeUnit.SECONDS);
		return driver;
	} 

	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
