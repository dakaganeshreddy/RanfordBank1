package Utility;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import TestBase.Base;

public class Library_class extends Base {
	public static String captureScreenshot(String screenshotname) {
		Date date = new Date();
		String currentDate = date.toString().replaceAll(":", "_");
		String path=getValue("screenshotpath") + screenshotname + "__" + currentDate + ".png";
		try {

		
			
			
			/* TakesScreenshot ts = (TakesScreenshot) driver; 
			 File srcFile = ts.getScreenshotAs(OutputType.FILE); File destFile = new File(getValue("screenshotpath") +screenshotname+"__" + currentDate + ".png");
			  FileUtils.copyFile(srcFile, destFile);*/
			 

			Robot r = new Robot();
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rc = new Rectangle(d);
			BufferedImage bi = r.createScreenCapture(rc);
			ImageIO.write(bi, "png",new File(path));

		} catch (Exception e) {
		}
		return path;
	}

}
