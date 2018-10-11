package PageLibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewRolePage extends Base {
	public static WebElement newRolesPageHome_button()
	{
		return driver.findElement(getElement("newRolesPageHomeButton"));
	}
	public static WebElement newRolesPageChangePassword_button()
	{
		return driver.findElement(getElement("newRolesPageChangePassword"));
	}
	public static WebElement newRolesPageLogout_button()
	{
		return driver.findElement(getElement("newRolesPageLogoutButton"));
	}
	public static WebElement newRolesPageRoles_button()
	{
		return driver.findElement(getElement("newRolesPageRolesButton"));
	}
	public static WebElement newRolesPageBranches_button()
	{
		return driver.findElement(getElement("newRolesPageBranchesButton"));
	}
	public static WebElement newRolesPageEmployee_button()
	{
		return driver.findElement(getElement("newRolesPageEmployeeButton"));
	}
	public static WebElement newRolesPageUsers_button()
	{
		return driver.findElement(getElement("newRolesPageUsersButton"));
	}
	public static WebElement newRolesPageRoleName_text()
	{
		return driver.findElement(getElement("newRolesPageRoleNameText"));
	}
	public static WebElement newRolesPageRoleDesc_text()
	{
		return driver.findElement(getElement("newRolesPageRoleDescText"));
	}
	public static WebElement newRolesPageType_select()
	{
		return driver.findElement(getElement("newRolesPageRoleTypeSelect"));
	}
	public static WebElement newRolesPageSubmit_button()
	{
		return driver.findElement(getElement("newRolesPageSubmitButton"));
	}
	public static WebElement newRolesPageRest_button()
	{
		return driver.findElement(getElement("newRolesPageResetButton"));
	}
	public static WebElement newRolesPageCancel_button()
	{
		return driver.findElement(getElement("newRolesPageCancelButton"));
	}



}
