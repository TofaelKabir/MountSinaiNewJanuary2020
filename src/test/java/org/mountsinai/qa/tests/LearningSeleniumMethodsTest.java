package org.mountsinai.qa.tests;

import java.util.Properties;
import org.mountsinai.qa.test.base.BasePage;
import org.mountsinai.qa.test.pages.LearningSeleniumMethods;
import org.mountsinai.qa.test.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LearningSeleniumMethodsTest {
	
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	LearningSeleniumMethods lsm;
	SoftAssert sa;
    

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		sa = new SoftAssert();
		lsm = PageFactory.initElements(driver, LearningSeleniumMethods.class);
	}
	
	@Test()
	public void testLogo() {
		Assert.assertTrue(lsm.verifyLogo(), "Application logo is not present...");
	}
	
	//Number#1
	@Test(priority = 1, enabled = true)
	public void testMountSinaiAtAGlance() {
		lsm.checkMountSinaiAtAGlance();
	}
	
	//Number#2
	@Test(priority = 2, enabled = true)
	public void testContactNumber() {
		lsm.checkContactNumber();
	}
	
	@Test(invocationCount = 2)
	public void testForPhysician() {
		lsm.verifyForPhysician();
		Assert.assertTrue(true, "For Physician WebElement is not present...");
	}
	
	@Test(invocationCount = 2) //RUN 4 TIMES
	public void testSpecialityButton() {
		lsm.verifySpecialityButton();
		Assert.assertTrue(true); //hard assert
		}
	@Test
	public void testBookAnAppointment() {
		lsm.verifyBookAnAppointment();
		sa.assertTrue(true); //softassert is used
		
		}
	
	
	@Test(dependsOnMethods = {"testLogo"})//THIS TEST DEPEND ON TESTLOGO
	public void testHomePageTitle() {
		//String title = driver.getTitle(); // no need to create a method if we use this line
		String title = lsm.verifyHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE, "Home Page Title doesn't match...");
	
	}
	
	
	//*******************************************************************************//
	
	
	
	//Number#3 //SHORTEST FORM WITHOUT CREATING METHOD IN ANOTHER PAGE
	@Test
	public void testMyChart() {
		driver.findElement(By.xpath("(//a[contains(text(),'MyChart')])[1]")).click();
	}
	
	//Number#3b //SHORTEST FORM
	
	@Test
	public void testUrgentCareDescription() {
		driver.findElement(By.xpath("//p[starts-with(text(),'No appointment needed')]")).click();
		}
	
	
	
	//Number#4
	//when locator is ok but still selenium can't find the webelement
	@Test
	public void testPayMyBill() {
		
		WebElement payMyBill = driver.findElement(By.xpath("(//a[text()='Pay My Bill'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", payMyBill);
		
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
