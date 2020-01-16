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

	@Test(priority = 1, enabled = true)
	public void testLogo() {
		Assert.assertTrue(lsm.verifyLogo(), "Application logo is not present...");
	}

	// Number#1
	@Test(priority = 2, enabled = true)
	public void testMountSinaiAtAGlance() {
		lsm.checkMountSinaiAtAGlance();
	}

	// Number#2
	@Test(priority = 3, enabled = true)
	public void testContactNumber() {
		lsm.checkContactNumber();
	}

	@Test(invocationCount = 2, enabled = true)
	public void testForPhysician() {
		lsm.verifyForPhysician();
		Assert.assertTrue(true, "For Physician WebElement is not present...");
	}

	@Test(invocationCount = 2, enabled = false) // RUN 4 TIMES
	public void testSpecialityButton() {
		lsm.verifySpecialityButton();
		Assert.assertTrue(true); // hard assert
	}

	@Test(priority = 4, enabled = true)
	public void testBookAnAppointment() {
		lsm.verifyBookAnAppointment();
		sa.assertTrue(false); // softassert is used

	}

	@Test(enabled = true, dependsOnMethods = { "testLogo" }) // THIS TEST DEPEND ON TESTLOGO
	public void testHomePageTitle() {
		//String title = driver.getTitle(); // no need to create a method if we use this line
		String title1 = lsm.verifyHomePageTitle();
		System.out.println("home page title is: " + title1);
		Assert.assertEquals(title1, Constants.HOME_PAGE_TITLE, "Home Page Title doesn't match...");

	}

	// *******************************************************************************//

	// Number#3 //SHORTEST FORM WITHOUT CREATING METHOD IN ANOTHER PAGE
	@Test(enabled = false)
	public void testMyChart() {
		driver.findElement(By.xpath("(//a[contains(text(),'MyChart')])[1]")).click();
	}

	// Number#3b //SHORTEST FORM

	@Test(enabled = false)
	public void testUrgentCareDescription() {
		driver.findElement(By.xpath("//p[starts-with(text(),'No appointment needed')]")).click();
	}

	// Number#4
	// when locator is ok but still selenium can't find the webelement
	@Test(enabled = true)
	public void testPayMyBill() {

		WebElement payMyBill = driver.findElement(By.xpath("(//a[text()='Pay My Bill'])[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", payMyBill);

	}
	
	@Test(enabled = false)
	public void findADoctor() {
		driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']")).click();
	}
	
	@Test
	// how to put value in search field
	public void testAsadMohammadBySearch() {
	driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]")).click();
	driver.findElement(By.xpath("(//input[@class='form-control dropdown-menu__input--search'])[2]")).sendKeys("Asad Mohammad");
	driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]")).click();
	}
    //Nasir bhai
	@Test
	public void testIreneRahmanBySearch() {

	WebElement searchKey = driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]"));
	WebElement searchButton = driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]"));
	//String path = "(//input[@class='form-control dropdown-menu__input--search'])[2]";
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", searchKey);
	//js.executeScript("document.evaluate((//input[@class='form-control dropdown-menu__input--search'])[2], document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
	js.executeScript("document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').value = 'Irene Rahman';");
	js.executeScript("arguments[0].click()", searchButton);

	}

	// do the homework: find asad mohammmad from find a doctor
	@Test
	public void testFindADoctorByName() {
	driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']")).click();
	driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
	driver.findElement(By.xpath("(//input[contains(@name,'lastName')])[3]")).sendKeys("AHMED");
	driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("ASAD");
	driver.findElement(By.xpath("(//button[contains(text(),'Go')])[6]")).click();
	}

//	@Test
//	public void testFindADoctorPrimaryCarePhysician() {
//	driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
//	driver.findElement(By.xpath("(//span[text()='By Name'])[3]")).click();
//	driver.findElement(By.xpath("(//input[contains(@name,'lastName')])[3]")).sendKeys("AHMED");
//	driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("ASAD");
//	driver.findElement(By.xpath("(//button[contains(text(),'Go')])[6]")).click();
//	}
	/*
	* @Test void testRequestAnAppointment() {
	* driver.findElement(By.xpath("(//a[@class=\"hidden-xs dropdown\"])[3]")).click
	* (); driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[3]")).
	* isEnabled(); driver.findElement(By.
	* xpath("(//input[@aria-label=\"Name\" and @class=\"form-control\"])[1]")).
	* sendKeys("ASAD AHMED"); driver.findElement(By.xpath()) }
	*/

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

	
}
