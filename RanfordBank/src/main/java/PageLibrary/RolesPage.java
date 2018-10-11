package PageLibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class RolesPage extends Base {
	public static WebElement rolesPageHome_button()
	{
		return driver.findElement(getElement("rolesPageHomeButton"));
	}
	public static WebElement rolesPageChangePassword_button()
	{
		return driver.findElement(getElement("rolesPageChangePassword"));
	}
	public static WebElement rolesPageLogout_button()
	{
		return driver.findElement(getElement("rolesPageLogoutButton"));
	}
	public static WebElement rolesPageNewRole_button()
	{
		return driver.findElement(getElement("rolesPageNewRoleButton"));
	}
	public static WebElement rolesPageRoles_button()
	{
		return driver.findElement(getElement("rolesPageRolesButton"));
	}
	public static WebElement rolesPageBranches_button()
	{
		return driver.findElement(getElement("rolesPageBranchesButton"));
	}
	public static WebElement rolesPageEmployee_button()
	{
		return driver.findElement(getElement("rolesPageEmployeeButton"));
	}
	public static WebElement rolesPageUsers_button()
	{
		return driver.findElement(getElement("rolesPageUsersButton"));
	}

}
