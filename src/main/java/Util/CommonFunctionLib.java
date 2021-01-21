package Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonFunctionLib {

	private static WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	/*
	 * Click the Web Element
	 */
	public void webdriverClick (WebElement webElement)
	{
		webElement.click();
	}
	/*
	 * Return the title of page
	 */
	public String getPageTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	/*
	 * Navigate to specific URL
	 */

	public void navigate_to_url(String url)
	{
		driver.get(url);
	}

	/*
	 * Send String
	 */
	public void sendKeys(WebElement element, String keys)
	{
		element.clear();
		element.sendKeys(keys);
	}

	/*
	 * Send specific keyboard keys
	 */
	public void sendKeys(WebElement element, Keys keys)
	{
		
		element.sendKeys(keys);
	}
	public void selectFromDropDown (WebElement ddb, String value)
	{
		Select dropdown = new Select(ddb);
		dropdown.selectByVisibleText(value);

	}
}



