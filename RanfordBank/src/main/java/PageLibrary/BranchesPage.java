package PageLibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class BranchesPage extends Base{
	public static WebElement branchesPageHome_button()
	{
		return driver.findElement(getElement("branchesPageHomeButton"));
	}
	public static WebElement branchesPageChangePassword_button()
	{
		return driver.findElement(getElement("branchesPageChangePassword"));
	}
	public static WebElement branchesPageLogout_button()
	{
		return driver.findElement(getElement("branchesPageLogoutButton"));
	}
	public static WebElement branchesPageNewBranch_button()
	{
		return driver.findElement(getElement("branchesPageNewBranchButton"));
	}
	public static WebElement branchesPageRoles_button()
	{
		return driver.findElement(getElement("branchesPageRolesButton"));
	}
	public static WebElement branchesPageUsers_button()
	{
		return driver.findElement(getElement("branchesPageUsersButton"));
	}
	public static WebElement branchesPageEmployee_button()
	{
		return driver.findElement(getElement("branchesPageEmployeeButton"));
	}
	public static WebElement branchesPageBranches_button()
	{
		return driver.findElement(getElement("branchesPageBranchesButton"));
	}
	public static WebElement branchesPageCountrySelect()
	{
		return driver.findElement(getElement("branchesPageCountrySelect"));
	}
	
	public static WebElement branchesPageStateSelect()
	{
		return driver.findElement(getElement("branchesPageStateSelect"));
	}
	public static WebElement branchesPageCitySelect()
	{
		return driver.findElement(getElement("branchesPageCitySelect"));
	}
	public static WebElement branchesPageSearch_button()
	{
		return driver.findElement(getElement("branchesPageSearchButton"));
	}
	public static WebElement branchesPageClear_button()
	{
		return driver.findElement(getElement("branchesPageClearButton"));
	}
	public static WebElement branchesPageEdit_button()
	{
		return driver.findElement(getElement("branchesPageEditButton"));
	}
	public static WebElement branchesPageDelete_button()
	{
		return driver.findElement(getElement("branchesPageDeleteButton"));
	}
	
	
	
	
	
	
	
	
	
	
	

}
