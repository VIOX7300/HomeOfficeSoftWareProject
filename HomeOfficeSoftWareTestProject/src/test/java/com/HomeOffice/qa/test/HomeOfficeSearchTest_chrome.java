package com.HomeOffice.qa.test;

import org.testng.annotations.AfterMethod;
/***
 * 
 * @author Emmanuel A
 *
 */
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.HomeOffice.qa.base.TestBase;
import com.HomeOffice.qa.pages.HomeOfficeSearchPage;
import com.HomeOffice.qa.pages.HomeOfficeSearchResultPage;

public class HomeOfficeSearchTest_chrome extends TestBase {
	HomeOfficeSearchPage gsp;
	HomeOfficeSearchResultPage gsrp;

	public HomeOfficeSearchTest_chrome(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		String browserType="chrome";
		//initialise();
		initialiseRemote(browserType);
		gsp = new HomeOfficeSearchPage();
		gsrp = new HomeOfficeSearchResultPage();		
	}

	@Test
	public void googleSearchTest1(){
		// Home Office Search Test
		System.out.println("inside googleSearchTest1 ");
		gsp.goToGooglePage();		 	
		gsp.doSearch("Home Office");	
		//driver.get("https://www.google.co.uk/search?q=HomeOffice");		 
		gsrp.navigateAndScreenShot("Home Office");


	}

	@Test
	public void googleSearchTest2(){
		// Home Office Search Test
		System.out.println("inside googleSearchTest2 ");
		gsp.goToGooglePage();		 
		gsp.doSearch("Home Office");		
		gsrp.verifyText("Home Office");

	}


	@AfterMethod
	public void tearDown(){
		driver.quit();
	}



}
