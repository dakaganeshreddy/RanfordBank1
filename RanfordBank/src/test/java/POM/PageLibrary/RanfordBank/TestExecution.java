package POM.PageLibrary.RanfordBank;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestExecution extends Repository {

	
	@Test(priority=1)
	public void verify_login() {
		login();
	}

	@Test(priority=0)
	@Parameters("browser")
	public void verifylaunchBrowser(String browser) {
		launch_browser(browser);
	}

	@Test(priority = 3)
	public void branchesButtonclick() {
		branchesButton_click();
	}

	/*@Test(priority=4)
	public void newBrancheButtonclick() {
		newBranchButton_click();
	}*/

	@Test(priority = 10)
	public void branch_search() {

		branchSearch();

	}
	
	@DataProvider(name = "branches")
	public Object verify_excel() {
		return excelcontent("Excel.xls", "Sheet1");
	}

	@Test(priority = 5, dataProvider = "branches")
	public void verify_branchDetails(String bname, String address, String zipcode, String country, String state,
			String city) {
		try {
			
			newBranchCreation(bname, address, zipcode, country, state, city);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
