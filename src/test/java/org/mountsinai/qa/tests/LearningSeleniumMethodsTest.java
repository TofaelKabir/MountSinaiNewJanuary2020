package org.mountsinai.qa.tests;

import java.util.Properties;
import org.mountsinai.qa.test.base.BasePage;
import org.mountsinai.qa.test.pages.LearningSeleniumMethods;
import org.mountsinai.qa.test.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
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
	Select select;
	WebDriverWait wait;
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		sa = new SoftAssert();
		lsm = PageFactory.initElements(driver, LearningSeleniumMethods.class);
		wait = new WebDriverWait(driver, 5);
		js = (JavascriptExecutor) driver;
	}

	@Test(priority = 1, enabled = true)
	public void logoTest() {
		Assert.assertTrue(lsm.verifyLogo(), "Application logo is not present...");
	}

	// Number#1
	@Test(priority = 2, enabled = true)
	public void mountSinaiAtAGlanceTest() {
		lsm.checkMountSinaiAtAGlance();
	}

	// Number#2
	@Test(priority = 3, enabled = true)
	public void contactNumberTest() {
		lsm.checkContactNumber();
	}

	@Test(invocationCount = 2, enabled = true)
	public void forPhysicianTest() {
		lsm.verifyForPhysician();
		Assert.assertTrue(true, "For Physician WebElement is not present...");
	}

	@Test(invocationCount = 2, enabled = false) // RUN 4 TIMES
	public void specialityButtonTest() {
		lsm.verifySpecialityButton();
		Assert.assertTrue(true); // hard assert
	}

	@Test(priority = 4, enabled = true)
	public void bookAnAppointmentTest() {
		lsm.verifyBookAnAppointment();
		sa.assertTrue(false); // softassert is used
		sa.assertAll();
	}

	// (enabled = true, dependsOnMethods = { "testLogo" }) // THIS TEST DEPEND ON
	// TESTLOGO

	@Test
	public void homePageTitleTest() {
		// String title = driver.getTitle(); // no need to create a method if we use
		// this line
		String title1 = lsm.verifyHomePageTitle();
		System.out.println("home page title is: " + title1);
		Assert.assertEquals(title1, Constants.HOME_PAGE_TITLE, "Home Page Title doesn't match...");
		System.out.println("We are checking asertAll now");
		sa.assertAll();

	}

//
//	// *******************************************************************************//
//
	// Number#3 //SHORTEST FORM WITHOUT CREATING METHOD IN ANOTHER PAGE
	@Test(enabled = false)
	public void myChartTest() {
		driver.findElement(By.xpath("(//a[contains(text(),'MyChart')])[1]")).click();
	}

// Number#3b //SHORTEST FORM

	@Test(enabled = true)
	public void urgentCareDescriptionTest() {
		driver.findElement(By.xpath("//p[starts-with(text(),'No appointment needed')]")).click();
	}

//	Number#4
	// when locator is ok but still selenium can't find the webelement
	// working
	@Test(enabled = true, groups = { "secondGroup" })
	public void payMyBillTest() {

		WebElement payMyBill = driver.findElement(By.xpath("(//a[text()='Pay My Bill'])[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", payMyBill);

	}

	@Test(enabled = true, groups = { "secondGroup" })
	public void findADoctorTest() {
		driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']"))
				.click();
	}

	@Test(groups = { "smokeTest", "functionalTest", "regressionTest" })
	// how to put value in search field
	public void asadMohammadBySearchTest() {
		driver.findElement(By.xpath("//span[text()='Search']//parent::a[@class='hidden-xs dropdown']")).click();
		driver.findElement(By.xpath("(//input[@class='form-control dropdown-menu__input--search'])[2]"))
				.sendKeys("Asad Mohammad");
		driver.findElement(By.xpath("(//input[@class='form-control dropdown-menu__input--search'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@class='form-control dropdown-menu__input--search'])[2]"))
				.sendKeys("Andrea Perez");
		driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]")).click();
	}

	// Nasir bhai //not working
	@Test(groups = { "functionalTest", "regressionTest" })
	public void ireneRahmanBySearchTest() {
		WebElement searchKey = driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]"));
		WebElement searchButton = driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]"));
		// String path = "(//input[@class='form-control
		// dropdown-menu__input--search'])[2]";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", searchKey);
		// js.executeScript("document.evaluate((//input[@class='form-control
		// dropdown-menu__input--search'])[2], document, null,
		// XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;");
		js.executeScript(
				"document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').value = 'Irene Rahman';");
		js.executeScript("arguments[0].click()", searchButton);
	}

	// Nasir bhai
	@Test
	public void ireneRahmanBySearchTest1() throws InterruptedException {
		WebElement searchKey = driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]"));
		WebElement searchButton = driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", searchKey);
		Thread.sleep(3000);
//				js.executeScript(
//						"document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').setAttribute('Value', Irene Rahman);");
//				
//				js.executeScript(
//						"document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').setRangeText('Irene Rahman');");
//				
		js.executeScript("arguments[0].click()", searchButton);
	}

	// do the homework: find asad mohammmad from find a doctor
	@Test(groups = { "functionalTest", "regressionTest" })
	public void findADoctorByNameTest0() {
		driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']"))
				.click();
		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'lastName')])[3]")).sendKeys("AHMED");
		driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("ASAD");
		driver.findElement(By.xpath("(//button[contains(text(),'Go')])[6]")).click();
	}

	@Test
	public void testFindADoctorPrimaryCarePhysician() {
		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='By Name'])[3]")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'lastName')])[3]")).sendKeys("AHMED");
		driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("ASAD");
		driver.findElement(By.xpath("(//button[contains(text(),'Go')])[6]")).click();
	}

	/*
	 * 
	 * @Test public void testRequestAnAppointment() {
	 * driver.findElement(By.xpath("(//a[@class=\"hidden-xs dropdown\"])[3]")).click
	 * (); driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[3]")).
	 * isEnabled(); driver.findElement(By.
	 * xpath("(//input[@aria-label=\"Name\" and @class=\"form-control\"])[1]")).
	 * sendKeys("ASAD AHMED"); driver.findElement(By.xpath()) }
	 *
	 */

	@Test(groups = { "firstGroup" })
	public void newsTest() {
		lsm.checkNews();
	}

	@Test
	public void findADoctorTest0() {
		lsm.checkFindADoctor();
	}

	@Test
	public void requestAnAppointmentTest1() {
		lsm.checkRequestAnAppointment1();
	}

	// use of getAttribute
	// see the next one too.
	@Test
	public void ourLocationsTest0() {
		String value = driver
				.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"))
				.getAttribute("data-toggle");
		System.out.println(value);
	}

	// use of getAttribute
	@Test
	public void ourLocationsTest1() {
		lsm.checkOurLocations();
		String value = driver
				.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"))
				.getAttribute("href");
		System.out.println(value);
	}

	@Test
	public void patientCareTest() {
		lsm.checkPatientCare();
	}

	@Test
	public void searchTest() {
		lsm.checkSearch();
	}

//Nasir bhai, how to use send keys without using driver.findelement, line 128
	@Test
	public void searchButtonTest() throws InterruptedException {
		lsm.checkSearchButton();
		Thread.sleep(2000);
		lsm.searchField.sendKeys("Andrea Perez");
		Thread.sleep(2000);
		lsm.searchButton.click();
	}

	@Test
	public void briefcaseTest() {
		lsm.checkBriefcase();
	}

	@Test(threadPoolSize = 3, invocationCount = 1, timeOut = 10000)
	public void urgentCareTest() throws Exception {

		lsm.checkUrgentCare();
	}

	@Test
	public void descriptionUrgentCareTest() {
		lsm.checkDescriptionUrgentCare();
	}

	@Test(expectedExceptions = NoSuchElementException.class)
	public void sameDayTest() {
		lsm.checkSameDay();
	}

	@Test(expectedExceptions = NoSuchElementException.class)
	public void descriptionSameDayTest() {
		lsm.checkDescriptionSameDay();
	}

	@Test(groups = { "functionalTest" })
	public void requestAnAppointmentTest2() {
		lsm.checkRequestAnAppointment2();
	}

	@Test(groups = "functionalTest")
	public void findADoctorTest2() {
		lsm.checkFindADoctor2();
	}

	@Test(groups = "functionalTest")
	public void specialtyTest() {
		lsm.checkSpecialty();
	}

//    @Test
//	public void testSelectSpecialty() {
//	lsm.checkSelectSpecialty();
//	}

	// use of getText()
	@Test
	public void primaryCareTest() {
		lsm.checkPrimaryCare();
		System.out.println(lsm.pCare.getText());
	}

	@Test
	public void enterZipCodeTest() {
		lsm.checkEnterZipCode();
	}

	@Test
	public void goZipCodeTest() {
		lsm.checkGoZipCode();
	}

	@Test
	public void nameTest() {
		lsm.checkName();
	}

	@Test
	public void lastNameTest() {
		lsm.checkLastName();
	}

	@Test
	public void firstNameTest() {
		lsm.checkFirstName();
	}

	@Test(groups = "unitTest")
	public void symbolOfEmployeesTest() {
		lsm.checkSymbolOfEmployees();
	}

	@Test(groups = "unitTest")
	public void over42000EmployeesTest() {
		lsm.checkOver42000Employees();
	}

	@Test(groups = "unitTest")
	public void captionOfSymbolOfEmployeesTest() {
		lsm.checkCaptionOfSymbolOfEmployees();
	}

	@Test(groups = { "smokeTest", "sanityTest", "regressionTest" })
	public void insideMountSinaiBlogTest() {
		lsm.checkInsideMountSinaiBlog();
	}

	@Test(groups = { "sanityTest", "regressionTest" })
	public void blogInLinkedInTest() {
		lsm.checkBlogInLinkedIn();
	}

	@Test(groups = { "sanityTest", "regressionTest" })
	public void blogInFaceBookTest() {
		lsm.checkBlogInFaceBook();
	}

	@Test(groups = { "sanityTest", "regressionTest" })
	public void blogInTwitterTest() {
		lsm.checkBlogInTwitter();
	}

	@Test(groups = { "sanityTest", "regressionTest" })
	public void blogInYouTubeTest() {
		lsm.checkBlogInYouTube();
	}

	@Test(groups = { "sanityTest", "regressionTest" })
	public void blogInInstagramTest() {
		lsm.checkBlogInInstagram();
	}

	@Test(groups = { "sanityTest", "regressionTest" })
	public void blogInPinterestTest() {
		lsm.checkBlogInPinterest();
	}

	// how to do exception test in TestNG?

	@Test
	public void testNGExceptionTest1() {
		System.out.println("We can verify whether a code throws the expected exception or not. Here it will fail");
		int i = 1 / 0;
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void testNGExceptionTest2() {
		System.out.println(
				"We can verify whether a code throws the expected exception or not. Here it will pass as expected exception is put");
		int i = 1 / 0;
	}

	// How to skip a test
	@Test(enabled = true, groups = { "functionalTest" })
	public void skipHomePageTitleTest() {
		String title = "Mount Sinai Health System - New York City | Mount Sinai - New York";
		if (title.equals(driver.getTitle())) {
			throw new SkipException("Skipping -- as the title matches as expeacted");
		} else {
			System.out.println("Home Page Title doesn't match...");
		}

		System.out.println("I am now out of the if else condition");

	}
	// "Submit" by clicking "Enter" button from keyboard

	@Test(priority = 10, enabled = true)
	public void useOfEnterFromKeyBoardTest() {
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[2]")).click();
		driver.findElement(
				By.xpath("(//input[@name='searchQuery' and @class='form-control dropdown-menu__input--search'])[2]"))
				.sendKeys("Irene Rahman", Keys.ENTER);

	}

	// do the homework: find asad mohammmad from find a doctor
	// "Submit" by clicking "Submit" button from web
	@Test
	public void findADoctorByNameTest1() throws Exception {
		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
		Thread.sleep(2000);// Generally smart tester don't use it //this is called static wait
		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("AHMED");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("ASAD");
		driver.findElement(By.xpath("(//button[@type='submit'])[8]")).click();

	}

	// "Submit" by clicking "Enter" button from keyboard
	@Test
	public void findADoctorByNameTest2() throws Exception {
		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
		Thread.sleep(2000);// Generally smart tester don't use it, they use webdriverWait.
		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("AHMED");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("ASAD", Keys.ENTER);
	}

	// use of Selection Class for drop down -- have 3 way
	// First we are doing selectByIndex() method //not preferable, last choice

	@Test
	public void selectAddictionPsychiatryFromDropdownTest1() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'By Specialty')])[3]")).click();
		WebElement seSp = driver.findElement(By.xpath("//select[@aria-label='speciality_label']"));// selectSpecialty
																									// web element
		select = new Select(seSp);
		select.selectByIndex(2);
		driver.findElement(By.xpath("(//input[@name='zipcode'])[3]")).sendKeys("10029", Keys.ENTER);
		System.out.println(seSp.getText()); // use of getText()
	}

	// Second we are doing selectByVisibleText() method
	// most common method to find drop down

	@Test
	public void selectCardiologyFromDropdownTest2() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click(); // click on findA doctor
		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click(); // click on by name //using to
																							// see it can click on
																							// specialty next
		driver.findElement(By.xpath("(//span[contains(text(),'By Specialty')])[3]")).click(); // click on by specialty
		select = new Select(driver.findElement(By.xpath("//select[@aria-label='speciality_label']")));
		select.selectByVisibleText("Cardiology");
		driver.findElement(By.xpath("(//input[@name='zipcode'])[3]")).sendKeys("10029", Keys.ENTER);

	}
	// third we are doing selectByValue() method
	// Need to know more, similar like visible text
	// Need to ask Nasir ABOUT IT
	// Test ki agey likhte hoi na pore in name.

	@Test
	public void selectSurgeryFromDropdownTest3() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")).click(); // click on findA doctor
		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click(); // click on by name //using to
																							// see it can click on
																							// specialty next
		driver.findElement(By.xpath("(//span[contains(text(),'By Specialty')])[3]")).click(); // click on by specialty
		select = new Select(driver.findElement(By.xpath("//select[@aria-label='speciality_label']")));
		select.selectByValue("Surgery");
		driver.findElement(By.xpath("(//input[@name='zipcode'])[3]")).sendKeys("10029", Keys.ENTER);

	}

	// Using of Web driver wait (dynamic wait)
	// "Submit" by clicking "Enter" button from keyboard
	// Find A doctor by name -- Ahmed Asad
	// using of getCurrentUrl()
	@Test
	public void findADoctorByNameTest() throws Exception {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='hidden-xs dropdown'])[2]")))
				.click();
		driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ahmed");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Asad", Keys.ENTER);
		System.out.println(driver.getCurrentUrl()); //GET CURRENT URL

	}

	// working
	@Test
	public void AndreaPerezBySearchTest() throws InterruptedException {
		WebElement searchKey = driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]"));
		WebElement searchField = driver
				.findElement(By.xpath("(//input[@class='form-control dropdown-menu__input--search'])[2]"));
		WebElement submitButton = driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", searchKey);
		Thread.sleep(3000);
//				js.executeScript("document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').setAttribute('Value', Irene Rahman);");
		js.executeScript("arguments[0].value='Andrea Perez'", searchField);
//				js.executeScript("document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').setRangeText('Irene Rahman');");

		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", submitButton);
	}

	// "Submit" by clicking "Enter" button from keyboard
	// not working after find a doctor, tried it many ways
	@Test
	public void findADoctorByNameTest3() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement findADoctor = driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]"));
		// Thread.sleep(5000);// Generally smart tester don't use it, they use
		// webdriverWait.
		WebElement findADoctorBySpeciality = driver
				.findElement(By.xpath("(//span[contains(text(),'By Specialty')])[3]"));

		WebElement findADoctorByName = driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]"));
		WebElement lastName = driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
		WebElement firstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		WebElement goButton = driver.findElement(By.xpath("(//button[contains(text(),'Go')])[6]"));
		js.executeScript("arguments[0].click()", findADoctor);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", findADoctorBySpeciality);
		js.executeScript("arguments[0].click()", findADoctorByName);
		js.executeScript("arguments[0].value='Perez'", lastName);
		js.executeScript("arguments[0].value='Andrea'", firstName);
		js.executeScript("arguments[0].click()", goButton);

	}

	// use of navigate().to()
	// use of navigate().back()
	// use of navigate().forward()
	// use of navigate().forward()
	// use of Javascript
	// use of setSize() of the browser

	
	@Test
	public void sendKeysToAmazonSearch() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/"); //alternate to .get(), difference -- .get() method helps to initiate the browser until it is loaded
		// This will scroll down the page by 3000 pixel vertical
		Thread.sleep(4000); //used to see the scroll
		js.executeScript("window.scrollBy(0,3000)",""); //scroll down
		// This will scroll up the page by 3000 pixel vertical
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-3000)",""); //scroll-up
		driver.navigate().back(); //Back to Mountsinai
		driver.navigate().forward(); //returned to Amazon
		driver.navigate().refresh();  // to refresh
		
		js.executeScript("history.go(0)"); // To do refresh by Javascript
		String sText =js.executeScript("return document.title;").toString(); // fetching page title by javascript
		System.out.println(sText);
		
		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement submitButton = driver.findElement(By.xpath("//input[@tabindex='20']"));
		
		js.executeScript("arguments[0].value='macbook air'", searchField); //to send keys
		
		js.executeScript("arguments[0].click()", submitButton); //to do click
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.mountsinai.org/");
		
		org.openqa.selenium.Dimension ds = new org.openqa.selenium.Dimension(480, 620); //Dimension class to reset size
		driver.manage().window().setSize(ds);
		Thread.sleep(2000); //to see the change
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		
	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
