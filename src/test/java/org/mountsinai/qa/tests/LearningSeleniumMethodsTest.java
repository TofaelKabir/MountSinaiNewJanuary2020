package org.mountsinai.qa.tests;

import java.util.Properties;

import org.mountsinai.qa.test.base.BasePage;
import org.mountsinai.qa.test.pages.HomePage;
import org.mountsinai.qa.test.pages.LearningSeleniumMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSeleniumMethodsTest {
	
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	LearningSeleniumMethods lsm;
    

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		lsm = PageFactory.initElements(driver, LearningSeleniumMethods.class);
	}
	//Number#1
	@Test(priority = 1, enabled = false)
	public void testLogo() {
		lsm.checkLogo();
	}
	
	//Number#2
	@Test(priority = 2, enabled = true)
	public void testContactNumber() {
		lsm.checkContactNumber();
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
