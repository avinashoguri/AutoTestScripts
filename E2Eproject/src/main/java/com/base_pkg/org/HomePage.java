package com.base_pkg.org;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;


public class HomePage extends Base {

	public static Logger log=LogManager.getLogger(Base.class.getName());



	@BeforeMethod
	public void initilize() throws IOException {
		driver=initializeDriver();

		log.info("Browser initilized");

	}


	@Test(dataProvider="getData")

	public void basepageNavigation(String username,String password) throws IOException {

		driver.get(prop.getProperty("url"));

		LandingPage lp=new LandingPage(driver);
		lp.loginLink().click();
		lp.email().sendKeys(username);
		lp.password().sendKeys(password);

		lp.logIn().click();
		System.out.print(username+ ""+password);
		System.out.println("----Test passed");

		log.info(username);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver=null;
		log.info("Browser closed");
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data=new Object[2][2];

		data[0][0]="restricted@gmail.com";
		data[0][1]="1234567";

		data[1][0]="unrestricted@gmail.com";
		data[1][1]="0004567";

		return data;


	}

}
