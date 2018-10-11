package PageLibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class EmployeePage extends Base{
	public static WebElement employeePageHome_button()
	{
		return driver.findElement(getElement("employeePageHomeButton"));
	}
	public static WebElement employeePageChangePassword_button()
	{
		return driver.findElement(getElement("employeePageChangePassword"));
	}
	public static WebElement employeePageLogout_button()
	{
		return driver.findElement(getElement("employeePageLogoutButton"));
	}
	public static WebElement employeePageNewEmployee_button()
	{
		return driver.findElement(getElement("employeePageNewEmployeeButton"));
	}
	public static WebElement employeePageemployee_button()
	{
		return driver.findElement(getElement("employeePageemployeeButton"));
	}
	public static WebElement employeePageBranches_button()
	{
		return driver.findElement(getElement("employeePageBranchesButton"));
	}
	public static WebElement employeePageEmployee_button()
	{
		return driver.findElement(getElement("employeePageEmployeeButton"));
	}
	public static WebElement employeePageUsers_button()
	{
		return driver.findElement(getElement("employeePageUsersButton"));
	}


}
