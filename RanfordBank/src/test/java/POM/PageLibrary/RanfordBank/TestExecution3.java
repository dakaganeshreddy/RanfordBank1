package POM.PageLibrary.RanfordBank;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageLibrary.EmployeePage;
import PageLibrary.RolesPage;

public class TestExecution3 extends Repository {
	@Test(priority = 1)
	public void verify_login() {
		login();
	}

	@BeforeTest
	@Parameters("browser")
	public void verifylaunchBrowser(String browser ) {
		launch_browser(browser);
	}

	@Test(priority = 2)
	public void employeeButtonClick() {
		employeeButton_click();	
	}

	/*@Test(priority = 3)
	public void newEmployeeButtonclick() {
		newEmployeePageButton_click();
	}*/
	@Test(priority=7)
	public void employeeSearch() {
		employee_Search();
	}
	

	@DataProvider(name = "employee")
	public Object verify_excel() {
		return excelcontent("Excel.xls", "Sheet3");
	}

	@Test(priority = 5, dataProvider = "employee")
	public void verify_rolesdetails(String ename, String lpwd, String role, String branch) {
		try {
			newEmployeeCreation(ename,lpwd,role,branch);
		} catch (Exception e) {
	}
	}
}
