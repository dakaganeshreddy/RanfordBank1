package POM.PageLibrary.RanfordBank;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageLibrary.RolesPage;

public class TestExecution2 extends Repository {

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
	public void rolesButtonclick() {
		rolesButton_click();
	}

	/*@Test(priority = 3)
	public void newBrancheButtonclick() {
		RolesPage.rolesPageNewRole_button().click();
	}*/
	@Test(priority=10)
	public void roleSearch() {
		role_Search();
	}
	

	@DataProvider(name = "roles")
	public Object verify_excel() {
		return excelcontent("Excel.xls", "Sheet2");
	}

	@Test(priority = 5, dataProvider = "roles")
	public void verify_rolesdetails(String rname, String rdesc, String rtype) {
		try {
			newRoleCreation(rname,rdesc,rtype);
		} catch (Exception e) {
	}
	
	}
}
