package PageLibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class AdminPage extends Base{
	public static WebElement adminPageHome_button()
	{
		return driver.findElement(getElement("adminPageHomeButton"));
	}
	public static WebElement adminPageChangePassword_button()
	{
		return driver.findElement(getElement("adminPageChangePasswordButton"));
	}
	public static WebElement adminPageLogout_button()
	{
		return driver.findElement(getElement("adminPageLogoutButton"));
	}
	public static WebElement adminPageBranches_button()
	{
		return driver.findElement(getElement("adminPageBranchesButton"));
	}
	public static WebElement adminPageRoles_button()
	{
		return driver.findElement(getElement("adminPageRolesButton"));
	}
	public static WebElement adminPageUsers_button()
	{
		return driver.findElement(getElement("adminPageUsersButton"));
	}
	public static WebElement adminPageEmployee_button()
	{
		return driver.findElement(getElement("adminPageEmployeeButton"));
	}

}
