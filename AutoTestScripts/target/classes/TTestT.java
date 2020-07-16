package resources;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TTestT {

	   public  WebDriver driver=null;

		public  WebDriver initializeDriver() throws IOException
		{
		
		
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Nexus 5");


		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Malempati Parvathi\\Desktop\\drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver(chromeOptions);
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		 return driver;
		}
		 
		 
		
		 
		
	}


