package PageLibrary;



import org.openqa.selenium.WebElement;

import TestBase.Base;

public class NewEmployeePage extends Base {
	public static WebElement newEmployeePageHome_button() {
		return driver.findElement(getElement("newEmployeePageHomeButton"));
	}

	public static WebElement newEmployeePageChangePassword_button() {
		return driver.findElement(getElement("newEmployeePageChangePassword"));
	}

	public static WebElement newEmployeePageLogout_button() {
		return driver.findElement(getElement("newEmployeePageLogoutButton"));
	}

	public static WebElement newEmployeePageBranches_button() {
		return driver.findElement(getElement("newEmployeePageBranchesButton"));
	}

	public static WebElement newEmployeePageEmployee_button() {
		return driver.findElement(getElement("newEmployeePageEmployeeButton"));
	}

	public static WebElement newEmployeePageUsers_button() {
		return driver.findElement(getElement("newEmployeePageUsersButton"));
	}

	public static WebElement newEmployeePageRoles_button() {
		return driver.findElement(getElement("newEmployeePageRolesButton"));
	}

	

	public static WebElement newEmployeePageReset_button() {
		return driver.findElement(getElement("newEmployeePageResetButton"));
	}

	public static WebElement newEmployeePageCancel_button() {
		return driver.findElement(getElement("newEmployeePageCancelButton"));
	}
	public static WebElement newEmployeePageRole_select() {
		return driver.findElement(getElement("newEmployeePageRoleSelect"));
	}
	public static WebElement newEmployeeEmployeeName_text() {
		return driver.findElement(getElement("newEmployeePageEmployeeNametext"));
	}
	public static WebElement newEmployeePageLoginPassword_text() {
		return driver.findElement(getElement("newEmployeePageLoginPasswordtext"));
	}
	public static WebElement newEmployeePageBranch_select() {
		return driver.findElement(getElement("newEmployeePageBranchSelect"));
	}
	public static WebElement newEmployeePageSubmit_button() {
		return driver.findElement(getElement("newEmployeePageSubmitButton"));
	}

}
