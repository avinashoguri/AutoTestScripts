package com.base_pkg.org;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.Base;

public class Validation_NavigationBar extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
	

	@BeforeMethod
	public void initilize() throws IOException {
		
		driver=initializeDriver();
		

		
		log.info("Browser initilized");
		
	}
	
	@Test
	public void validationTitle() throws IOException {
		 
		 driver.get(prop.getProperty("url"));
		 
		 log.debug("browser Lanched");
			
		 LandingPage lp=new LandingPage(driver);
		
		 Assert.assertTrue(lp.navigationBar().isDisplayed());
		// System.out.println("test passed");

			log.info("Navegation Bar displayed");
		 
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();

		driver=null;
		log.info("Browser closed");
	}

}
