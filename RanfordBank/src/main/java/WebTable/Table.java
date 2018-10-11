
package WebTable;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import PageLibrary.BranchUpdationPage;
import PageLibrary.Generic;
import TestBase.Base;

public class Table extends Base {
	static boolean status = false;

	public static void table(String operation, By prop, String id)

	{
		try {
			boolean flag = false;
			WebElement table = driver.findElement(prop);
			List<WebElement> rows = table.findElements(By.tagName("tr"));

			String[] pagelinks = rows.get(rows.size() - 1).getText().split(" ");

			for (int i = 1; i < pagelinks.length; i++) {

				table = driver.findElement(prop);

				rows = table.findElements(By.tagName("tr"));

				for (WebElement r : rows)

				{
					List<WebElement> columns = r.findElements(By.tagName("td"));

					for (WebElement c : columns) {
						if (c.getText().contains(id))

							if (operation.equalsIgnoreCase("edit"))

							{
								columns.get(columns.size() - 2).findElement(By.tagName("a")).click();
							} else if (operation.equalsIgnoreCase("delete")) {
								columns.get(columns.size() - 1).findElement(By.tagName("a")).click();
								Generic.alertHandle(driver).accept();
							}

							else

							{
								Reporter.log("operation is failed");

								flag = true;
								break;
							}
					}

					if (flag == true) {
						break;
					}
				}
				if (flag == true) {
					break;
				}

				try {

					if (pagelinks[i].contains("...") & status == true)

					{
						driver.findElement(By.xpath("//a[text()='...'][2]")).click();

					} else {
						table.findElement(By.linkText(pagelinks[i])).click();
					}

				} catch (Exception e) {

				}
				if (pagelinks[i].contains("...")) {

					status = true;
					table(operation, prop, id);
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

	}

}
