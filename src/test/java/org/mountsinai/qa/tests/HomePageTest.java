package org.mountsinai.qa.tests;

import java.util.Properties;
import org.mountsinai.qa.test.base.BasePage;
import org.mountsinai.qa.test.pages.HomePage;
import org.mountsinai.qa.test.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class HomePageTest {

	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;

	SoftAssert softAssert;

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		// loginPage = new LoginPage(driver);
		//homePage = new HomePage(driver);
		homePage = PageFactory.initElements(driver, HomePage.class);
		
		
		// homePage = loginPage.doLogin(prop.getProperty("username"),
		// prop.getProperty("password"));
		softAssert = new SoftAssert();
	}

//	@Test(priority = 1)
//	public void verifyHomePageHeaderValueTest() {
//		softAssert.assertTrue(homePage.verifyHomePageHeader());
//		String headerValue = homePage.getHomePageHeader();
//		System.out.println("home page header is: " + headerValue);
//		Assert.assertEquals(headerValue, Constants.HOME_PAGE_HEADER, "home page header mismatched...");
//		System.out.println("end of the test.......");
//		softAssert.assertAll();
//	}

//	@Test(priority = 2)
//	public void verifyLoggedInUserTest() {
//		softAssert.assertTrue(homePage.verifyLoggedAccountName());
//		String accountName = homePage.getLoggedAccountName();
//		System.out.println("account Name is: " + accountName);
//		Assert.assertEquals(accountName, prop.getProperty("accountname"));
//		softAssert.assertAll();
//	}

	@Test()
	public void verifyHomePageAppLogo() {
		// System.out.println("Application logo is present");
		Assert.assertTrue(homePage.verifyApplicationLogo(), "Application logo is not present...");
	}

	@Test()
	public void verifyHomePageTitleTest() {
		String title = homePage.getHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE, "Home Page Title doesn't match...");
	}


	@Test
	public void testPhoneNumber() {
		homePage.checkPhoneNumber();
	}

	@Test
	public void testMyChart() {
		homePage.checkMyChart();
	}

	@Test
	public void testForPhysicians() {
		homePage.checkForPhysicians();
	}

	@Test
	public void testNews() {
		homePage.checkNews();
	}

	@Test
	public void testIcahnSchoolOfMedicine() {
		homePage.checkIcahnSchoolOfMedicine();
	}

	@Test
	public void testFindADoctor() {
		homePage.checkFindADoctor();
	}

	@Test
	public void testRequestAnAppointment1() {
		homePage.checkRequestAnAppointment1();
	}

	@Test
	public void testOurLocations() {
		homePage.checkOurLocations();
	}

	@Test
	public void testPatientCare() {
		homePage.checkPatientCare();
	}

	@Test
	public void testAboutUs() {
		homePage.checkAboutUs();
	}

	@Test
	public void testSearch() {
		homePage.checkSearch();
	}

	@Test
	public void testCalender() {
		homePage.checkCalender();
	}

	@Test
	public void testBookNow() {
		homePage.checkBookNow();
	}

	@Test
	public void testDescriptionBookNow() {
		homePage.checkDescriptionBookNow();
	}

	@Test
	public void testBookAnAppointment() {
		homePage.checkBookAnAppointment();
	}

	@Test
	public void testBriefcase() {
		homePage.checkBriefcase();
	}

	@Test
	public void testUrgentCare() {
		homePage.checkUrgentCare();
	}

	@Test
	public void testDescriptionUrgentCare() {
		homePage.checkDescriptionUrgentCare();
	}

	@Test
	public void testFindALocation() {
		homePage.checkFindALocation();
	}

	@Test
	public void testSameDay() {
		homePage.checkSameDay();
	}

	@Test
	public void testClock() {
		homePage.checkClock();
	}

	@Test
	public void testDescriptionSameDay() {
		homePage.checkDescriptionSameDay();
	}

	@Test
	public void testRequestAnAppointment2() {
		homePage.checkRequestAnAppointment2();
	}

	@Test
	public void testGlobe() {
		homePage.checkGlobal();
	}

	@Test
	public void testInternational() {
		homePage.checkInternational();
	}

	@Test
	public void testDescriptionInternational() {
		homePage.checkDescriptionInternational();
	}

	@Test
	public void testLearnMore() {
		homePage.checkLearnMore();
	}

	@Test
	public void testCallUs() {
		homePage.checkCallUs();
	}

	@Test
	public void testFindADoctor2() {
		homePage.checkFindADoctor2();
	}

	@Test
	public void testSpecialty() {
		homePage.checkSpecialty();
	}

	@Test
	public void testSelectSpecialty() {
		homePage.checkSelectSpecialty();
	}

	@Test
	public void testPrimaryCare() {
		homePage.checkPrimaryCare();
	}

	@Test
	public void testEnterZipCode() {
		homePage.checkEnterZipCode();
	}

	@Test
	public void testGoZipCode() {
		homePage.checkGoZipCode();
	}

	@Test
	public void testName() {
		homePage.checkName();
	}

	@Test
	public void testLastName() {
		homePage.checkLastName();
	}

	@Test
	public void testFirstName() {
		homePage.checkFirstName();
	}

	@Test
	public void testChooseALocation() {
		homePage.checkChooseALocation();
	}

	@Test
	public void testHospitals1() {
		homePage.checkHospitals1();
	}

	@Test
	public void testSelectHospitals1() {
		homePage.checkSelectHospitals1();
	}

	@Test
	public void testUrgentCareAndWalkIn1() {
		homePage.checkUrgentCareAndWalkIn1();
	}

	@Test
	public void testGo() {
		homePage.checkGo();
	}

	@Test
	public void testViewMoreLocations() {
		homePage.checkViewMoreLocations();
	}

	@Test
	public void testMountSinaiAtAGlance() {
		homePage.checkMountSinaiAtAGlance();
	}

	@Test
	public void testSymbolOfEmployees() {
		homePage.checkSymbolOfEmployees();
	}

	@Test
	public void testOver42000Employees() {
		homePage.checkOver42000Employees();
	}

	@Test
	public void testCaptionOfSymbolOfEmployees() {
		homePage.checkCaptionOfSymbolOfEmployees();
	}

	@Test
	public void testSymbolOfMap() {
		homePage.checkSymbolOfMap();
	}

	@Test
	public void testCommunityLocations300Plus() {
		homePage.checkCommunityLocations300Plus();
	}

	@Test
	public void testCaptionOfSymbolOfMap() {
		homePage.checkCaptionOfSymbolOfMap();
	}

	@Test
	public void testSymbolOfInstitutes() {
		homePage.checkSymbolOfInstitutes();
	}

	@Test
	public void testThirtyEightSInstitutes() {
		homePage.checkThirtyEightInstitutes();
	}

	@Test
	public void testCaptionOfSymbolOfInstitutes() {
		homePage.checkCaptionOfSymbolOfInstitutes();
	}

	@Test
	public void testInsideMountSinaiBlog() {
		homePage.checkInsideMountSinaiBlog();
	}

	@Test
	public void testBlogInLinkedIn() {
		homePage.checkBlogInLinkedIn();
	}

	@Test
	public void testBlogInFaceBook() {
		homePage.checkBlogInFaceBook();
	}

	@Test
	public void testBlogInTwitter() {
		homePage.checkBlogInTwitter();
	}

	@Test
	public void testBlogInYouTube() {
		homePage.checkBlogInYouTube();
	}

	@Test
	public void testBlogInInstagram() {
		homePage.checkBlogInInstagram();
	}

	@Test
	public void testBlogInPinterest() {
		homePage.checkBlogInPinterest();
	}

	@Test
	public void testPatientInformation() {
		homePage.checkPatientInformation();
	}

	@Test
	public void testPayMyBill() {
		homePage.checkPayMyBill();
	}

	@Test
	public void testInternationalServices() {
		homePage.checkInternationalServices();
	}

	@Test
	public void testMountSinaiAccess() {
		homePage.checkMountSinaiAccess();
	}

	@Test
	public void testFindADoctor3() {
		homePage.checkFindADoctor3();
	}

	@Test
	public void testPatientRepresentativesOffices() {
		homePage.checkPatientRepresentativesOffices();
	}

	@Test
	public void testLanguageAndAccessibilityContacts() {
		homePage.checkLanguageAndAccessibilityContacts();
	}

	@Test
	public void testHealthLibrary() {
		homePage.checkHealthLibrary();
	}

	@Test
	public void testClinicalTrials() {
		homePage.checkClinicalTrials();
	}

	@Test
	public void testResearchAndEducation() {
		homePage.checkResearchAndEducation();
	}

	@Test
	public void testIcahnSchoolOfMedicineAtMountSinai() {
		homePage.checkIcahnSchoolOfMedicineAtMountSinai();
	}

	@Test
	public void testMedicalEducation() {
		homePage.checkMedicalEducation();
	}

	@Test
	public void testGraduateEducation() {
		homePage.checkGraduateEducation();
	}

	@Test
	public void testResearch() {
		homePage.checkResearch();
	}

	@Test
	public void testFindFaculty() {
		homePage.checkFindFaculty();
	}

	@Test
	public void testPhillipsSchoolOfNursing() {
		homePage.checkPhillipsSchoolOfNursing();
	}

	@Test
	public void testForHealthProfessionals() {
		homePage.checkForHealthProfessionals();
	}

	@Test
	public void testTransferAPatient() {
		homePage.checkTransferAPatient();
	}

	@Test
	public void testMountSinaiConnect() {
		homePage.checkMountSinaiConnect();
	}

	@Test
	public void testReferAPatient() {
		homePage.checkReferAPatient();
	}

	@Test
	public void testNursing() {
		homePage.checkNursing();
	}

	@Test
	public void testhospitalSponsoredPrograms() {
		homePage.checkHospitalSponsoredPrograms();
	}

	@Test
	public void testSelecthospitals() {
		homePage.checkSelectHospitals();
	}

	@Test
	public void testSelectUrgentCareOrWalkIn() {
		homePage.checkSelectUrgentCareOrWalkIn();
	}

	@Test
	public void testChooseAHospitalLocation() {
		homePage.checkChooseAHospitalLocation();
	}

	@Test
	public void testChooseAUrgentCareLocation() {
		homePage.checkChooseAUrgentCareLocation();
	}

	@Test
	public void testCopyright() {
		homePage.checkCopyright();
	}

//	@Test
//    public void testFindADoctor1() {
//		homePage.clickFindADoctor ();
//	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
