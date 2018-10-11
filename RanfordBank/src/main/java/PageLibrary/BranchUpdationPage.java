package PageLibrary;

import org.openqa.selenium.WebElement;

import TestBase.Base;

public class BranchUpdationPage extends Base{
	
	public static WebElement BranchUpdatePageUpdate_button()
	{
		return driver.findElement(getElement("BranchUpdationPageUpdateButton"));
	}
}
