package POM.PageLibrary.RanfordBank;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.Library;
import com.thoughtworks.selenium.webdriven.commands.GetValue;

import Excel.Excel_class;
import PageLibrary.AdminPage;
import PageLibrary.BranchUpdationPage;
import PageLibrary.BranchesPage;
import PageLibrary.EmployeePage;
import PageLibrary.Generic;
import PageLibrary.LoginPage;
import PageLibrary.NewBranchPage;
import PageLibrary.NewEmployeePage;
import PageLibrary.NewRolePage;
import PageLibrary.RolesPage;
import TestBase.Base;
import Utility.Library_class;
import Utility.Validation;
import WebTable.Table;
public class Repository extends Base {
	@BeforeSuite
	public void extentReports()
	{
		report=new ExtentReports(".\\extentreports\\report.html",true);
	}
	@BeforeMethod
	public void beforeMethod(Method method)
	{
		test=report.startTest((this.getClass().getSimpleName()+"::"+method.getName()));
		test.assignAuthor("ganesh");
		test.assignCategory("Regression");
	}
	@AfterSuite
	public void savereport() {
		report.flush();
	}
	

	public void login() {
		LoginPage.username_editbox().sendKeys(getValue("username"));
		LoginPage.username_pass().sendKeys(getValue("pass"));
		LoginPage.login_button().click();
		if(Validation.isTextPresent("Branches, Roles and Users related to KEXIM Bank"))
		{
			Reporter.log("login is passed");
			System.out.println("login is passed");
			test.log(LogStatus.PASS,"login test is passed");
		}
		else
		{
			Reporter.log("login is failed");
			System.out.println("login is failed");
			//Library_class.captureScreenshot("login");
			try {
				Thread.sleep(3000);
				test.log(LogStatus.FAIL,"login test is failed",test.addScreenCapture(Library_class.captureScreenshot("login")));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		public void launch_browser(String browser) {
				
			System.out.println(browser);
			if(browser.equals("firefox"))
			{
				
				System.setProperty(getValue("geckodrivername"), getValue("geckodriverpath"));
				driver=new FirefoxDriver();			
			}
			else
			{
				System.setProperty(getValue("chromedrivername"), getValue("chromedriverpath"));
	
				driver=new ChromeDriver();
			}
		
		/*String browser = getValue("browser");
		if (browser.equals("firefox")) {
			System.setProperty(getValue("geckodrivername"), getValue("geckodriverpath"));
			driver = new FirefoxDriver();

		} else {
			System.setProperty(getValue("chromedrivername"), getValue("chromedriverpath"));
			driver = new ChromeDriver();

		}*/
		driver.get(getValue("build1"));
		driver.manage().timeouts().implicitlyWait(Long.parseLong(getValue("timeouts")), TimeUnit.SECONDS);
		if (Validation.isTextPresent("KEXIM Bank dates back to 1955")) {
			Reporter.log("launch is passed");
			test.log(LogStatus.PASS,"login test is passed");
		}
		else
		{
			Reporter.log("launch is failed");
			System.out.println("launch failed");
			test.log(LogStatus.FAIL,"launch browser is failed",test.addScreenCapture(Library_class.captureScreenshot("launchBrowser")));
			//Library_class.captureScreenshot("launchbrowser");
			
		}
	}

	public void branchesButton_click() {
		AdminPage.adminPageBranches_button().click();
		if (BranchesPage.branchesPageNewBranch_button().isDisplayed()) {
			Reporter.log("Branches page is displayed");
			System.out.println("Branches page is displayed");
			test.log(LogStatus.PASS,"branches button click passed");
		}
		else
		{
			Reporter.log("Branches page is not displayed");
			System.out.println("Branches page is not displayed");
			test.log(LogStatus.FAIL,"branches button click is failed",test.addScreenCapture(Library_class.captureScreenshot("branchesbuttonclick")));
			//Library_class.captureScreenshot("branchesButton_click");
		}
		
	}

	/*public void newBranchButton_click() {

	}*/

	public void rolesButton_click() {
		AdminPage.adminPageRoles_button().click();
		if(RolesPage.rolesPageNewRole_button().isDisplayed())
		{
			Reporter.log("Roles page displayed");
			System.out.println("Roles page displayed");
		}
		else
		{
			Reporter.log("Roles page not displayed");
			System.out.println("Roles page not displayed");
			Library_class.captureScreenshot("rolesButton_click");
		}
	}

	public void employeeButton_click() {
		AdminPage.adminPageEmployee_button().click();
		if (EmployeePage.employeePageNewEmployee_button().isDisplayed()) {
			Reporter.log("Employee page is displayed");
			System.out.println("Employee page is displayed");
		}
		else
		{
			Reporter.log("Employee page is not displayed");
			System.out.println("Employee page is not displayed");
			Library_class.captureScreenshot("employeeButton_click");
		}
		
	}
	/*
	 * public void newEmployeePageButton_click() {
	 * EmployeePage.employeePageNewEmployee_button().click(); }
	 */

	/*public void newRolesButton_click() {
		RolesPage.rolesPageNewRole_button().click();
		}*/

	public void newRoleCreation(String rname, String rdesc, String rtype) {

		try {
			RolesPage.rolesPageNewRole_button().click();
			NewRolePage.newRolesPageRoleName_text().sendKeys(rname);
			NewRolePage.newRolesPageRoleDesc_text().sendKeys(rdesc);
			Generic.dd_options(NewRolePage.newRolesPageType_select(), rtype);
			NewRolePage.newRolesPageSubmit_button().click();
			if (Validation.isAlertPresent("New Role with id")) {
				Reporter.log("new role is created succesfully");
				System.out.println("new role is created succesfully");
				
			}
			else if(Validation.isAlertPresent("Role Already existed"))
			{
				Reporter.log("Role already exist new role creation failed");
				System.out.println("Role already exist new role creation failed");
				Library_class.captureScreenshot("newRoleCreation");
			}
			else
			{
				Reporter.log("new role creation failed");
				System.out.println("new role creatin failed");
				Library_class.captureScreenshot("newRoleCreation");
				
			}
			
			Generic.alertHandle(driver).accept();

		} catch (Exception e) {
		}
	}

	public void newEmployeeCreation(String ename, String lpwd, String role, String branch) {
		try {
			EmployeePage.employeePageNewEmployee_button().click();
			NewEmployeePage.newEmployeeEmployeeName_text().sendKeys(ename);
			NewEmployeePage.newEmployeePageLoginPassword_text().sendKeys(lpwd);
			Generic.dd_handle(NewEmployeePage.newEmployeePageRole_select()).selectByVisibleText(role);
			Generic.dd_handle(NewEmployeePage.newEmployeePageBranch_select()).selectByVisibleText(branch);
			NewEmployeePage.newEmployeePageSubmit_button().click();
			if (Validation.isAlertPresent("New Employer")) {
				Reporter.log("new employee is created succesfully");
				System.out.println("new employee is created succesfully");
			}
			else if(Validation.isAlertPresent("Employer Already Existed...Try again"))
			{
				Reporter.log("Employee already exist new role creation failed");
				System.out.println("Employee already exist new role creation failed");
				Library_class.captureScreenshot("newEmployeeCreation");
			}
			else
			{
				Reporter.log("new Employee creation failed");
				System.out.println("new employee creatin failed");
				Library_class.captureScreenshot("newEmployeeCreation");
				
			}
			Generic.alertHandle(driver).accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

	public void newBranchCreation(String bname, String address, String zipcode, String country, String state,
			String city) {
		try {
			BranchesPage.branchesPageNewBranch_button().click();
			NewBranchPage.newBranchPageBranchName_text().sendKeys(bname);
			NewBranchPage.newBranchPageAddr1_text().sendKeys(address);
			NewBranchPage.newBranchPageZipcode_text().sendKeys(zipcode);
			Generic.dd_options(NewBranchPage.newBranchPageCountry_select(), country);
			Generic.dd_options(NewBranchPage.newBranchPageState_select(), state);
			Generic.dd_options(NewBranchPage.newBranchPageCity_select(), city);
			NewBranchPage.newBranchPageSubmit_button().click();
			Thread.sleep(500);
			if (Validation.isAlertPresent("created Sucessfully")) {
				Reporter.log("new branch is created succesfully");
				System.out.println("new branch is created succesfully");
				test.log(LogStatus.PASS,"new branch creation is passed");
			}
			else if(Validation.isAlertPresent("already Exist"))
			{
				Reporter.log("Branch already exist new branch creation failed");
				System.out.println("Branch already exist new branch craetion failed");
				test.log(LogStatus.FAIL,"branch creation is failed",test.addScreenCapture(Library_class.captureScreenshot("branchcreation")));
				//Library_class.captureScreenshot("newBranchCreation");
			}
			else
			{
				Reporter.log("new branch creation failed");
				System.out.println("new branch creation failed");
				test.log(LogStatus.FAIL,"branch creation is failed",test.addScreenCapture(Library_class.captureScreenshot("branchcreation")));
				//Library_class.captureScreenshot("newBranchCreation");
				
			}

			Generic.alertHandle(driver).accept();
		} catch (Exception e) {
		}
	}

	public void branchSearch() {

		AdminPage.adminPageBranches_button().click();

		Table.table("edit", By.id("DG_bankdetails"), "1");
		if(BranchUpdationPage.BranchUpdatePageUpdate_button().isDisplayed())
		{
			Reporter.log("Branch search successfull");
			System.out.println("Branch search successfull");
		}
		else
		{
			Reporter.log("Branch search unsuccessfull");
			System.out.println("Branch search unsuccessfull");
			Library_class.captureScreenshot("branchSearch");
		}

	}

	public void role_Search() {

		Table.table("edit", By.id("DGRoles"), "109");
		if(Validation.isTextPresent("Roles Updation"))
		{
			Reporter.log("Role search successfull");
			System.out.println("Role search successfull");
		}
		else
		{
			Reporter.log("Role search unsuccessfull");
			System.out.println("Role search successfull");
			Library_class.captureScreenshot("role_Search");
		}

	}

	public void employee_Search() {

		Table.table("edit", By.id("DGBanker"), "5461");
		if(Validation.isTextPresent("Employee Updation"))
		{
			Reporter.log("employee search successfull");
			System.out.println("employee search successfull");
		}
		else
		{
			Reporter.log("employee search unsuccessfull");
			System.out.println("employee search unsuccessfull");
			Library_class.captureScreenshot("employee_Search");
		}

	}

	public Object[][] excelcontent(String filename, String sheetname) {
		Excel_class.excelconnection(filename, sheetname);
		int rc = Excel_class.rcount();
		int cc = Excel_class.ccount();
		String[][] data = new String[rc - 1][cc];
		for (int r = 1; r < rc; r++) {
			{
				for (int c = 0; c < cc; c++) {
					{
						data[r - 1][c] = Excel_class.readData(c, r);
					}

				}
			}

		}
		return data;

	}

}
