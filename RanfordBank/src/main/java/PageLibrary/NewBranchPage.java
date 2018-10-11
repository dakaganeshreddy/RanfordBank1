package PageLibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewBranchPage extends Base{
	public static WebElement newBranchPageHome_button()
	{
		return driver.findElement(getElement("newBranchPageHomeButton"));
	}
	public static WebElement newBranchChangePassword_button()
	{
		return driver.findElement(getElement("newBranchPageChangePasswordButton"));
	}
	public static WebElement newBranchPageLogout_button()
	{
		return driver.findElement(getElement("newBranchPageLogoutButton	"));
	}
	public static WebElement newBranchPageRoles_button()
	{
		return driver.findElement(getElement("newBranchPageRolesButton"));
	}
	public static WebElement newBranchPageUsers_button()
	{
		return driver.findElement(getElement("newBranchPageUsersButton"));
	}
	public static WebElement newBranchPageEmployee_button()
	{
		return driver.findElement(getElement("newBranchPageEmployeeButton"));
	}
	public static WebElement newBranchPageBranches_button()
	{
		return driver.findElement(getElement("newBranchPageBranchesButton"));
	}
	public static WebElement newBranchPageBranchName_text()
	{
		return driver.findElement(getElement("newBranchPagebranchName"));
	}
	
	public static WebElement newBranchPageAddr1_text()
	{
		return driver.findElement(getElement("newBranchPagebranchAddr1"));
	}
	public static WebElement newBranchPageAddr2_text()
	{
		return driver.findElement(getElement("newBranchPagebranchAddr2"));
	}
	
	public static WebElement newBranchPageAddr3_text()
	{
		return driver.findElement(getElement("newBranchPagebranchAddr3"));
	}
	public static WebElement newBranchPageArea_text()
	{
		return driver.findElement(getElement("newBranchPagebranchArea"));
	}
	public static WebElement newBranchPageZipcode_text()
	{
		return driver.findElement(getElement("newBranchPagebranchZipcode"));
	}
	public static WebElement newBranchPageCountry_select()
	{
		return driver.findElement(getElement("newBranchPagebranchCountrySelect"));
		
	}
	public static WebElement newBranchPageState_select()
	{
		return driver.findElement(getElement("newBranchPagebranchStateSelect"));
	}
	public static WebElement newBranchPageCity_select()
	{
		return driver.findElement(getElement("newBranchPagebranchCitySelect"));
	}
	public static WebElement newBranchPageSubmit_button()
	{
		return driver.findElement(getElement("newBranchPagebranchSubmitButton"));
	}
	public static WebElement newBranchPageReset_button()
	{
		return driver.findElement(getElement("newBranchPagebranchResetButton"));
	}
	public static WebElement newBranchPageCancel_button()
	{
		return driver.findElement(getElement("newBranchPagebranchCancelButton"));
	}
	}
