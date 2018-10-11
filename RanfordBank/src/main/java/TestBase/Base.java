package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base {
	static Properties p;
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	public static void loadProperty() {

		try {
			File f = new File(".\\src\\main\\java\\configuration\\OR.properties");

			FileReader fr = new FileReader(f);
			p = new Properties();
			p.load(fr);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static By getElement(String key) {
		loadProperty();
		By by = null;
		String value = p.getProperty(key);
		String locType = value.split(":")[0];
		String locValue = value.split(":")[1];
		switch (locType) {
		case "id":
			by = By.id(locValue);
			break;

		case "name":
			by = By.name(locValue);
			break;
		case "xpath":
			by = By.xpath(locValue);
			break;
		}
		return by;

	}

	public static void loadProperty1() {

		try {
			File f = new File(".\\src\\main\\java\\configuration\\config.properties");

			FileReader fr = new FileReader(f);
			p = new Properties();
			p.load(fr);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static String getValue(String key) {
		loadProperty1();
		String value = p.getProperty(key);
		return value;

	}
	
}
