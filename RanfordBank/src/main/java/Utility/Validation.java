package Utility;

import org.openqa.selenium.By;

import TestBase.Base;

public class Validation extends Base{
public static boolean isTextPresent(String exp)
{
	boolean b = driver.findElement(By.tagName("tbody")).getText().contains(exp);
	return b;
}
public static boolean isAlertPresent(String exp)
{
	boolean b=driver.switchTo().alert().getText().contains(exp);
	return b;
}
public static boolean isTitlePresent(String exp)
{
	boolean b = driver.getTitle().contains(exp);
	return b;
}
		
}
