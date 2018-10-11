package PageLibrary;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic {
	public static Select dd_handle(WebElement e)
	{
		Select s=new Select(e);
		return s;
	}
	public static void dd_options(WebElement e, String exp)
	{
		Select s=new Select(e);
		List<WebElement> list = s.getOptions();
		for (WebElement op : list) {
			String x = op.getText();
			System.out.println(x);
			if(x.contains(exp))
			{
				s.selectByVisibleText(exp);
				break;
			}
		}
	}
	public static Alert alertHandle(WebDriver driver) {
		return driver.switchTo().alert();
	}

}

