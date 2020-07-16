package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class MobileEmmulation {

	public WebDriver driver;
	
	public WebDriver ffinitializeDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Malempati Parvathi\\Desktop\\practice\\drivers\\geckodriver.exe");

		FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setPreference("general.useragent.override", "iPhone"); //this will change the user agent which will open mobile browser
		 driver = new FirefoxDriver(ffprofile);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(400,800)); //just to change the window size so that it will look like mobile ;)
		return driver;
	}
	public void getScreenshot(String result) throws IOException
	{
		//time and date stamp
		String TD=systemDateAndTime();

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshots\\"+TD+result+".png"));



	}
	public String systemDateAndTime() {

		//system current time and date stamp.

		//DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		// Date date = new Date();
		// String date1= dateFormat.format(date);
		String date1 = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
		return date1;
	}


}



