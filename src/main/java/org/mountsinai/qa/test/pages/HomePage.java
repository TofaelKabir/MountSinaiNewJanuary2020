package org.mountsinai.qa.test.pages;

import org.mountsinai.qa.test.base.BasePage;
import org.mountsinai.qa.test.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class HomePage extends BasePage {
	WebDriver driver;
	ElementUtil elementUtil;

	//By header = By.cssSelector("");
	//By accountname = By.cssSelector("span.account-name ");
	By logo = By.xpath("//img[@alt='Mount Sinai']");
	
//	@FindBy(xpath = "//img[@alt='Mount Sinai']")
//	WebElement logo1;
//	
	

//	By contactsParentTab = By.id("nav-primary-contacts-branch");
//	By contactsChildTab = By.id("nav-secondary-contacts");
	
//	   @FindBy(xpath = "//img[@alt='Mount Sinai']")
//	    public static WebElement logo;
	    @FindBy(xpath = "//span[@class='hidden-xs']")
	    public static WebElement phoneNumber;
	    @FindBy(xpath = "//a[text()='MyChart']")
	    public static WebElement myChart;
	    @FindBy(xpath = "//a[text()='For Physicians']")
	    public static WebElement forPhysicians;
	    @FindBy(xpath = "//a[contains(text(),'News')]//parent::li//parent::ul[@class='contact-list list-inline']")
	    public static WebElement news;
	    @FindBy(xpath = "//a[text()='Icahn School of Medicine']")
	    public static WebElement icahnSchoolOfMedicine;
	    @FindBy(xpath = "//a[contains(text(),'Make a Gift')]")
	    public static WebElement makeAGift;
	    @FindBy(xpath = "//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']")
	    public static WebElement findADoctor;
	    @FindBy(xpath = "//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']")
	    public static WebElement requestAnAppointment1;
	    @FindBy (xpath = "//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']")
	    public static WebElement ourLocations;
	    @FindBy (xpath = "//a[normalize-space(text())='Patient Care' and @class='hidden-xs dropdown']")
	    public static WebElement patientCare;
	    @FindBy (xpath = "//a[contains(text(),'About Us')]")
	    public static WebElement aboutUs;
	    @FindBy (xpath = "(//span[contains(text(),'Search')]//preceding-sibling::i[@class='fa fa-search'])[1]")
	    public static WebElement search;
	    @FindBy(xpath = "//div[@class='dropdown-menu mega-dropdown-menu search']//button[@class='btn btn-large']")
	    public static WebElement searchButton;
	    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-calendar']")
	    public static WebElement calender;
	    @FindBy(xpath = "//span[contains(text(),'Book Now') and @class ='hpcards__container--content--title' ]")
	    public static WebElement bookNow;
	    @FindBy(xpath = "//p[starts-with(text(),'Book')]//parent::span[@class='hpcards__container--content--desc']")
	    public static WebElement descriptionBookNow;
	    @FindBy(linkText = "Book an Appointment")
	    public static WebElement bookAnAppointment;
	    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-briefcase']")
	    public static WebElement briefcase;
	    @FindBy(xpath = "//span[contains(text(),'Urgent Care') and @class ='hpcards__container--content--title']")
	    public static WebElement urgentCare;
	    @FindBy(xpath = "//p[starts-with(text(),'No appointment needed')]")
	    public static WebElement descriptionUrgentCare;
	    @FindBy(xpath = "//span[text()='Find a Location']")
	    public static WebElement findALocation;
	    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-clock-o']")
	    public static WebElement clock;
	    @FindBy(xpath = "//span[text()='Same-Day' and @class='hpcards__container--content--title']")
	    public static WebElement sameDay; 
	    @FindBy(xpath = "//p[starts-with(text(),'Call 844-463-2778 or click')]")
	    public static WebElement descriptionSameDay;
	    @FindBy(xpath = "//span[text()='Request an Appointment']//parent::a[@class='btn hpcards__container--content--link']")
	    public static WebElement requestAnAppointment2;
	    @FindBy(xpath = "//a[@class='hpcards__container--a']//i[@class='fa fa-globe']")
	    public static WebElement global;
	    @FindBy(xpath = "//span[contains(text(),'International') and @class ='hpcards__container--content--title' ]")
	    public static WebElement international;
	    @FindBy(xpath = "//p[starts-with(text(),'International Services')]")
	    public static WebElement descriptionInternational;
	    @FindBy(xpath = "//span[text()='Learn More']")
	    public static WebElement learnMore;
	    @FindBy(xpath = "//h2[@class='section_title hpcards__container--main--title']")
	    public static WebElement callUs;
	    @FindBy(xpath = "//h1[contains(text(),'Find a Doctor')]")
	    public static WebElement findADoctor2;
	    @FindBy(xpath = "(//span[contains(text(),'Specialty')])[3]")
	    public static WebElement specialty;
	    @FindBy(xpath = "//select[@id='specialty' and @name='specialty']")
	    public static WebElement selectSpecialty;
	    @FindBy(xpath = "(//span[contains(text(),'Primary Care')])[1]")
	    public static WebElement primaryCare;
	    @FindBy(xpath = "//span[text()='Name']//parent::label")
	    public static WebElement enterZipCode;
	    @FindBy(xpath = "//div[@id='byspecialty_div']//button[@type='submit']")
	    public static WebElement goZipCode;
	    @FindBy(xpath = "//h2[contains(text(),'Choose a Location')]")
	    public static WebElement name;
	    @FindBy(xpath = "(//input[@name='lastName']//parent::div[@class='form-group form-inline byname panel fad-form__container'])[2]") 
	    public static WebElement lastName;
	    @FindBy(xpath = "(//input[@name='firstName']//parent::div[@class='form-group form-inline byname panel fad-form__container'])[2]")
	    public static WebElement firstName;
	    @FindBy(xpath = "//select[@id='specialty']")
	    public static WebElement chooseALocation;
	    @FindBy(xpath = "//li[@class='hploc__radio-btn hploc__radio-btn--hospital']")
	    public static WebElement hospitals1;
	    @FindBy(xpath = "//a[@id='hploc__sel-text-hosp']")
	    public static WebElement selectHospitals1;
	    @FindBy(xpath = "//li[@class='hploc__radio-btn hploc__radio-btn--urgentcare']")
	    public static WebElement urgentCareAndWalkIn1;
	    @FindBy(xpath = "//a[@id='hploc__sel-text-urgentcare' and @class ='font-14 dropdown hploc__placeholder--select']")//not working
	    public static WebElement selectUrgentCareAndWalkIn1;
	    @FindBy(className = "hploc__btn--submit")
	    public static WebElement go;
	    @FindBy(xpath = "//a[@class='view-more text-center']")
	    public static WebElement viewMoreLocations;
	    @FindBy(xpath = "//h2[contains(text(), 'Mount Sinai at a Glance')]")
	    public static WebElement mountSinaiAtAGlance;
	    @FindBy(xpath = "//i[@class='fa fa-group' and @aria-hidden='true']")
	    public static WebElement symbolOfEmployees;
	    @FindBy(xpath = "//h3[normalize-space(text())='Over 42,000 Employees']")
	    public static WebElement over42000Employees;
	    @FindBy(xpath= "//span[contains(text(),'Including more than 6,500 primary care physicians and specialists')]")
	    public static WebElement captionOfSymbolOfEmployees;
	    @FindBy(xpath = "//i[@class='fa fa-map-marker' and @aria-hidden='true']")
	    public static WebElement symbolOfMap;
	    @FindBy(xpath = "//h3[contains(text(),'300+ Community Locations')]")
	    public static WebElement communityLocations300Plus;
	    @FindBy(xpath = "//span[contains(text(),'You can access Mount Sinai health care across New York City and beyond')]")
	    public static WebElement captionOfSymbolOfMap;
	    @FindBy(xpath = "//i[@class='fa fa-building' and @aria-hidden='true']")
	    public static WebElement symbolOfInstitutes;
	    @FindBy(xpath = "//h3[normalize-space(text())='38 Institutes']")
	    public static WebElement thirtyEightInstitutes;
	    @FindBy(xpath = "//p[contains(text(),'Focused on multidisciplinary research, educational, and clinical progress')]")
	    public static WebElement captionOfSymbolOfInstitutes;
	    @FindBy(xpath = "//a[contains(text(),'Inside Mount Sinai Blog')]//parent::li//parent::ul//parent::div[@class='nav navbar col-xs-12']")
	    public static WebElement insideMountSinaiBlog;
	    @FindBy(xpath = "//i[@class='fa fa-linkedin']")
	    public static WebElement blogInLinkedIn;
	    @FindBy(xpath = "//i[@class='fa fa-facebook']")
	    public static WebElement blogInFaceBook;
	    @FindBy(xpath = "//i[@class='fa fa-twitter']")
	    public static WebElement blogInTwitter;
	    @FindBy(xpath = "//i[@class='fa fa-youtube']")
	    public static WebElement blogInYouTube;
	    @FindBy(xpath = "//i[@class='fa fa-instagram']")
	    public static WebElement blogInInstagram;
	    @FindBy(xpath = "//i[@class='fa fa-pinterest']")
	    public static WebElement blogInPinterest;
	    @FindBy(xpath = "//li[contains(text(),'Patient Information')]")
	    public static WebElement patientInformation;
	    @FindBy(xpath = "//a[contains(text(),'Pay My Bill')]")
	    public static WebElement payMyBill;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[contains(text(),'International Services')]")
	    public static WebElement internationalServices;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[contains(text(),'Mount Sinai Access')]")
	    public static WebElement mountSinaiAccess;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Find a Doctor']")
	    public static WebElement findADoctor3;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Patient Representatives Offices']")
	    public static WebElement patientRepresentativesOffices;
	    @FindBy(xpath = "//a[text()='Language and Accessibility']")
	    public static WebElement languageAndAccessibilityContacts;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Health Library']")
	    public static WebElement healthLibrary;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Clinical Trials ']")
	    public static WebElement clinicalTrials ;
	    @FindBy(xpath = "//li[contains(text(),'Research & Education')]")
	    public static WebElement researchAndEducation ;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Icahn School of Medicine at Mount Sinai']")
	    public static WebElement icahnSchoolOfMedicineAtMountSinai ;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Medical Education']")
	    public static WebElement medicalEducation ;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Graduate Education']")
	    public static WebElement graduateEducation ;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Research']")
	    public static WebElement research ;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Find Faculty']")
	    public static WebElement findFaculty ;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[text()='Phillips School of Nursing']")
	    public static WebElement phillipsSchoolOfNursing ;
	    @FindBy(xpath = "//li[contains(text(),'For Health Professionals')]")
	    public static WebElement forHealthProfessionals ;
	    @FindBy(xpath = "//a[contains(text(),'Transfer a Patient')] ")
	    public static WebElement transferAPatient ;
	    @FindBy(xpath = "//a[contains(text(),'Mount Sinai Connect')] ")
	    public static WebElement mountSinaiConnect ;
	    @FindBy(xpath = "//div[@class='nav col-xs-12 col-sm-4']//a[contains(text(),'Refer a Patient')] ")
	    public static WebElement referAPatient ;
	    @FindBy(xpath = "//a[contains(text(),'Nursing')] ")
	    public static WebElement nursing ;
	    @FindBy(xpath = "//a[contains(text(),'Hospital Sponsored Programs')]")
	    public static WebElement hospitalSponsoredPrograms ;
	    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-4 pull-right']//span[text()='Hospitals']")
	    public static WebElement selectHospitals ;
	    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-4 pull-right']//span[text()='Urgent Care/Walk-In']")
	    public static WebElement selectUrgentCareOrWalkIn ;
	    @FindBy(xpath = "//div[@class='select hospitals']//option[text()='Choose a location']")
	    public static WebElement chooseAHospitalLocation ;
	    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-4 pull-right']//div[@class='select urgent-care']")
	    public static WebElement chooseAUrgentCareLocation ;
	    @FindBy(xpath = "//div[contains(text(),'Icahn School of Medicine at Mount Sinai') and @class='copyright']")
	    public static WebElement copyright ;

	    

	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		elementUtil.waitForElementPresent(logo); //better to use something which is present in home page

	}

	public String getHomePageTitle() {
		return elementUtil.doGetTitle();
	}
//
//	public boolean verifyHomePageHeader() {
//		return elementUtil.doIsDisplayed(header);
//	}
//
//	public String getHomePageHeader() {
//		return elementUtil.doGetText(header);
//	}
//
//	public boolean verifyLoggedAccountName() {
//		return elementUtil.doIsDisplayed(accountname);
//	}
//
//	public String getLoggedAccountName() {
//		return elementUtil.doGetText(accountname);
	//}

	public boolean verifyApplicationLogo() {
		return elementUtil.doIsDisplayed(logo);
	}

//	public ContactsPage goToContactsPage() {
//		elementUtil.waitForElementPresent(contactsParentTab);
//		elementUtil.doClick(contactsParentTab);
//		elementUtil.waitForElementPresent(contactsChildTab);
//		elementUtil.doClick(contactsChildTab);
//
//		return new ContactsPage(driver);
//	}
	
//	public void checkLogo() {
//        
//        logo.click();
//    }
    public void checkPhoneNumber() {
        
        phoneNumber.click();
    }
    public void checkMyChart() {
        
        myChart.click();
    }
    public void checkForPhysicians() {
        
        forPhysicians.click();
    }
    public void checkNews() {
        
        news.click();
    }
    public void checkIcahnSchoolOfMedicine() {
        
        icahnSchoolOfMedicine.click();
    }
    public void checkMakeAGift() {
        
        makeAGift.click();
    }
    public void checkFindADoctor() {
       
        findADoctor.click();
    }
    public void checkRequestAnAppointment1() {
        
        requestAnAppointment1.click();
    }
    public void checkOurLocations() {
        
        ourLocations.click();
    }
    public void checkPatientCare() {
      
        patientCare.click();
    }
    public void checkAboutUs() {
       
        aboutUs.click();
    }
    public void checkSearch() {
    
        search.click();
    }
    public void checkCalender() {
        
        calender.click();
    }
    public void checkBookNow() {
       
        bookNow.click();
    }
    public void checkDescriptionBookNow() {
        
        descriptionBookNow.click();
    }
    public void checkBookAnAppointment() {
        
        bookAnAppointment.click();
    }
    public void checkBriefcase() {
        
        briefcase.click();
    }
    public void checkUrgentCare() {
        
        urgentCare.click();
    }
    public void checkDescriptionUrgentCare() {
        
        descriptionUrgentCare.click();
    }
    public void checkFindALocation() {
        
        findALocation.click();
    }
    public void checkClock() {
        
        clock.click();
    }
    public void checkSameDay() {
        
        sameDay.click();
    }
    public void checkDescriptionSameDay() {
        
        descriptionSameDay.click();
    }
    public void checkRequestAnAppointment2() {
        
        requestAnAppointment2.click();
    }
    public void checkGlobal() {
        
        global.click();
    }
    public void checkInternational() {
        
        international.click();
    }
    public void checkDescriptionInternational() {
      
        descriptionInternational.click();
    }
    public void checkLearnMore() {
        learnMore.click();
    }
    public void checkCallUs() {
        callUs.click();
    }
    public void checkFindADoctor2() {
        findADoctor2.click();
    }
    public void checkSpecialty() {
        specialty.click();
    }
    public void checkSelectSpecialty() {
        selectSpecialty.click();
    }
    public void checkPrimaryCare() {
        primaryCare.click();
    }
    public void checkEnterZipCode() {
        enterZipCode.click();
    }
    public void checkGoZipCode() {
        goZipCode.click();
    }
    public void checkName() {
        name.click();
    }
    public void checkLastName() {
        lastName.click();
    }
    public void checkFirstName() {
        firstName.click();
    }
    public void checkChooseALocation() {
        chooseALocation.click();
    }
    public void checkHospitals1() {
        hospitals1.click();
    }
    public void checkSelectHospitals1() {
        selectHospitals1.click();
    }
    public void checkUrgentCareAndWalkIn1() {
        urgentCareAndWalkIn1.click();
    }
    public void checkSelectUrgentCareAndWalkIn1() {
        selectUrgentCareAndWalkIn1.click();
    }
    public void checkGo() {
        go.click();
    }
    public void checkViewMoreLocations() {
        viewMoreLocations.click();
    }
    public void checkMountSinaiAtAGlance() {
        mountSinaiAtAGlance.click();
    }
    public void checkSymbolOfEmployees() {
        symbolOfEmployees.click();
    }
    public void checkOver42000Employees() {
        over42000Employees.click();
    }
    public void checkCaptionOfSymbolOfEmployees() {
        captionOfSymbolOfEmployees.click();
    }
    public void checkSymbolOfMap() {
        symbolOfMap.click();
    }
    public void checkCommunityLocations300Plus() {
        communityLocations300Plus.click();
    }
    public void checkCaptionOfSymbolOfMap() {
        captionOfSymbolOfMap.click();
    }
    public void checkSymbolOfInstitutes() {
        symbolOfInstitutes.click();
    }
    public void checkThirtyEightInstitutes() {
        thirtyEightInstitutes.click();
    }
    public void checkCaptionOfSymbolOfInstitutes() {
        captionOfSymbolOfInstitutes.click();
    }
    public void checkInsideMountSinaiBlog() {
        insideMountSinaiBlog.click();
    }
    public void checkBlogInLinkedIn() {
        blogInLinkedIn.click();
    }
    public void checkBlogInFaceBook() {
        blogInFaceBook.click();
    }
    public void checkBlogInTwitter() {
        blogInTwitter.click();
    }
    public void checkBlogInYouTube() {
        blogInYouTube.click();
    }
    public void checkBlogInInstagram() {
        blogInInstagram.click();
    }
    public void checkBlogInPinterest() {
        blogInPinterest.click();
    }
    public void checkPatientInformation() {
        patientInformation.click();
    }
    public void checkPayMyBill() {
        payMyBill.click();
    }
    public void checkInternationalServices() {
        internationalServices.click();
    }
    public void checkMountSinaiAccess() {
        mountSinaiAccess.click();
    }
    public void checkFindADoctor3() {
        findADoctor3.click();
    }
    public void checkPatientRepresentativesOffices() {
        patientRepresentativesOffices.click();
    }
    public void checkLanguageAndAccessibilityContacts() {
        languageAndAccessibilityContacts.click();
    }
    public void checkHealthLibrary() {
        healthLibrary.click();
    }
    public void checkClinicalTrials() {
        clinicalTrials.click();
    }
    public void checkResearchAndEducation() {
        researchAndEducation.click();
    }
    public void checkIcahnSchoolOfMedicineAtMountSinai() {
        icahnSchoolOfMedicineAtMountSinai.click();
    }
    public void checkMedicalEducation() {
        medicalEducation.click();
    }
    public void checkGraduateEducation() {
        graduateEducation.click();
    }
    public void checkResearch() {
        research.click();
    }
    public void checkFindFaculty() {
        findFaculty.click();
    }
    public void checkPhillipsSchoolOfNursing() {
        phillipsSchoolOfNursing.click();
    }
    public void checkForHealthProfessionals() {
        forHealthProfessionals.click();
    }
    public void checkTransferAPatient() {
        transferAPatient.click();
    }
    public void checkMountSinaiConnect() {
        mountSinaiConnect.click();
    }
    public void checkReferAPatient () {
        referAPatient .click();
    }
    public void checkNursing () {
        nursing .click();
    }
    public void checkHospitalSponsoredPrograms () {
        hospitalSponsoredPrograms .click();
    }
    public void checkSelectHospitals () {
        selectHospitals .click();
    }
    public void checkSelectUrgentCareOrWalkIn () {
        selectUrgentCareOrWalkIn .click();
    }
    public void checkChooseAHospitalLocation () {
        chooseAHospitalLocation .click();
    }
    public void checkChooseAUrgentCareLocation () {
        chooseAUrgentCareLocation .click();
    }
    public void checkCopyright () {
        copyright .click();
    }	
	
	

}
