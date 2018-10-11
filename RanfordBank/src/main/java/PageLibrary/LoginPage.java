package PageLibrary;

import org.openqa.selenium.WebElement;

import POM.PageLibrary.RanfordBank.Repository;
import TestBase.Base;

public class LoginPage extends Base{
	public static WebElement username_editbox()
	{
		return driver.findElement(getElement("username"));
	}
	public static WebElement username_pass()
	{
		return driver.findElement(getElement("pass"));
	}
	public static WebElement branchSelect()
	{
		return driver.findElement(getElement("branchSelect"));
	}
	public static WebElement login_button()
	{
		return driver.findElement(getElement("loginButton"));
	}
	public static WebElement home_button()
	{
		return driver.findElement(getElement("homeButton"));
	}
	public static WebElement personalBanking_button()
	{
		return driver.findElement(getElement("personalBankingButton"));
	}
	public static WebElement corporateBanking_button()
	{
		return driver.findElement(getElement("corporateBankingButton"));
	}
	public static WebElement internationalBanking_button()
	{
		return driver.findElement(getElement("internationalBankingButton"));
	}
	public static WebElement aboutUs_button()
	{
		return driver.findElement(getElement("aboutUsButton"));
	}
	public static WebElement personal_button()
	{
		return driver.findElement(getElement("personalButton"));
	}
	public static WebElement corporate_button()
	{
		return driver.findElement(getElement("corporateButton"));
	}
	public static WebElement international_button()
	{
		return driver.findElement(getElement("internationalButton"));
	}
	
}
