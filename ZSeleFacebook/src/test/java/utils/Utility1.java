package utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility1 {
private WebDriver driver;
	
	public static void capture(WebDriver driver, int testid) throws IOException {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss");
		Date date = new Date();
		String pm = format.format(date);
		
		TakesScreenshot take = (TakesScreenshot)driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Saurabh Zend\\Desktop\\velocity\\Screenshot"+testid+" "+pm+".jpg");
		FileHandler.copy(src, dest);
		
	}

}
