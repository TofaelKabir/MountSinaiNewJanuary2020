package org.mountsinai.qa.test.pages;

import org.mountsinai.qa.test.base.BasePage;
import org.mountsinai.qa.test.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningSeleniumMethods extends BasePage {
	WebDriver driver;
	ElementUtil elementUtil;
	WebDriverWait wait;

	public LearningSeleniumMethods(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		elementUtil.waitForElementPresent(logo); // better to use something which is present in home page
		
	}

	By logo = By.xpath("//img[@alt='Mount Sinai']");

	public boolean verifyLogo() {
		return elementUtil.doIsDisplayed(logo);
	}

	// Number#1 standard
	@FindBy(xpath = "//h2[starts-with(text(),'Mount Sinai at a Glance')]") // used when a para or several sentence is used
	public static WebElement mountSinaiAtAGlance;

	public void checkMountSinaiAtAGlance() {
		mountSinaiAtAGlance.click();
	}

	// Number#2
	// This is other way to write @FindBy

	@FindBy(how = How.XPATH, using = "(//span[text()='1-800-MD-SINAI'])[1]")
	public static WebElement contactNumber;

	public void checkContactNumber() {
		contactNumber.click();
	}

	@FindBy(xpath = "(//a[contains(text(),'For Physicians')])[1]")
	WebElement forPhysician;

	// image, link, button, text field, check box etc.--isDisplayed

	public boolean verifyForPhysician() {
		return forPhysician.isDisplayed();
	}

	@FindBy(xpath = "(//span[contains(text(),'Specialty')])[3]")
	WebElement specialityButton;

	// isSelected() method is predominantly used with radio buttons, dropdowns and
	// checkboxes.

	public boolean verifySpecialityButton() {
		return specialityButton.isSelected();
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Book an Appointment']")
	public static WebElement bookAnAppointment;

	// isEnabled() is primarily used with buttons.

	public boolean verifyBookAnAppointment() {
		return bookAnAppointment.isEnabled();
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	@FindBy(xpath = "//a[contains(text(),'News')]//parent::li//parent::ul[@class='contact-list list-inline']")
	public static WebElement news;

	public void checkNews() {
		news.click();
	}

	@FindBy(xpath = "//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']")
	public static WebElement findADoctor;
	@FindBy(xpath = "//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']")
	public static WebElement requestAnAppointment1;
	@FindBy(xpath = "//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']")
	public static WebElement ourLocations;
	@FindBy(xpath = "//a[normalize-space(text())='Patient Care' and @class='hidden-xs dropdown']")
	public static WebElement patientCare;

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

	@FindBy(xpath = "(//span[contains(text(),'Search')]//preceding-sibling::i[@class='fa fa-search'])[1]")
	public static WebElement search;
	@FindBy(xpath = "//input[@title='Site search field']//parent::div[@id='search-input-mega']")
	public static WebElement searchField;
	@FindBy(xpath = "//button[text()='Search']//parent::form[@method='GET']")
	public static WebElement searchButton;

	public void checkSearch() {

		search.click();
	}
//Nasir bhai next page 208
	public void checkSearchButton() throws InterruptedException {
		Thread.sleep(2000);
		search.click();
//		Thread.sleep(2000);
//		searchField.sendKeys("Andrea Perez");
//		Thread.sleep(2000);
//		searchButton.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Book Now') and @class ='hpcards__container--content--title' ]")
	public static WebElement bookNow;
	@FindBy(xpath = "//p[starts-with(text(),'Book')]//parent::span[@class='hpcards__container--content--desc']")
	public static WebElement descriptionBookNow;
	@FindBy(linkText = "Book an Appointment")
	public static WebElement bookAnAppointment1;

	public void checkBookNow() {

		bookNow.click();
	}

	public void checkDescriptionBookNow() {

		descriptionBookNow.click();
	}

	public void checkBookAnAppointment() {

		bookAnAppointment1.click();
	}
	@FindBy(xpath = "//i[@class='fa fa-briefcase']//parent::a[@class='hpcards__container--a']")
    public static WebElement briefcase;
    @FindBy(xpath = "(//span[contains(.,'Urgent Care')]//parent::a[@class='hpcards__container--a'])[2]")
    public static WebElement urgentCare;
    @FindBy(xpath = "//p[starts-with(text(),'No appointment needed. Walk-ins welcome. Locations throughout the New York City area.')]")
    public static WebElement descriptionUrgentCare;
    
public void checkBriefcase() {
        
        briefcase.click();
    }
    public void checkUrgentCare() throws Exception {
        Thread.sleep(2000);
        urgentCare.click();
    }
    public void checkDescriptionUrgentCare() {
        
        descriptionUrgentCare.click();
    }
    @FindBy(xpath = "//span[text()='Same-Day' and @class='hpcards__container--content--title']")
    public static WebElement sameDay; 
    @FindBy(xpath = "//p[starts-with(text(),'Call 844-463-2778 or click')]")
    public static WebElement descriptionSameDay;
    @FindBy(xpath = "//span[text()='Request an Appointment']//parent::a[@class='btn hpcards__container--content--link']")
    public static WebElement requestAnAppointment2;
    
public void checkSameDay() {
        
        sameDay.click();
    }
    public void checkDescriptionSameDay() {
        
        descriptionSameDay.click();
    }
    public void checkRequestAnAppointment2() {
        
        requestAnAppointment2.click();
    }
    
    @FindBy(xpath = "//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']")
    public static WebElement findADoctor2;
    @FindBy(xpath = "(//span[contains(text(),'By Specialty')]//parent::label//child::input[@value='byspecialty'])[2]")
    public static WebElement bySpecialty;
//    @FindBy(xpath = "//select[@id='specialty' and @name='specialty']")
//    public static WebElement selectSpecialty;
    @FindBy(xpath = "(//span[contains(text(),'Primary Care')])[1]")
    public static WebElement pCare;
    @FindBy(xpath = "//span[text()='Name']//parent::label")
    public static WebElement enterZipCode;
    @FindBy(xpath = "//button[text()='Go']//parent::div//parent::div[@class='form-group form-inline panel byzip fad-form__container']//preceding-sibling::div//child::fieldset//child::div//child::h2")
    public static WebElement goZipCode;
    @FindBy(xpath = "(//span[contains(text(),'By Name')])[4]")
    public static WebElement byName;
    @FindBy(xpath = "(//input[@name='lastName']//parent::div[@class='form-group form-inline byname panel fad-form__container'])[2]") 
    public static WebElement lastName;
    @FindBy(xpath = "(//input[@name='firstName']//parent::div[@class='form-group form-inline byname panel fad-form__container'])[2]")
    public static WebElement firstName;
    public void checkFindADoctor2() {
        findADoctor2.click();
    }
    public void checkSpecialty() {
        bySpecialty.click();
    }
//    public void checkSelectSpecialty() {
//        selectSpecialty.click();
//    }
    public void checkPrimaryCare() {
    	wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Primary Care')])[1]"))).click();
    }
    public void checkEnterZipCode() {
        enterZipCode.click();
    }
    public void checkGoZipCode() {
        goZipCode.click();
    }
    public void checkName() {
        byName.click();
    }
    public void checkLastName() {
        lastName.click();
    }
    public void checkFirstName() {
        firstName.click();
    }
    @FindBy(css = "i.fa.fa-group")
    public static WebElement symbolOfEmployees;
    @FindBy(xpath = "//h3[normalize-space(text())='Over 42,000 Employees']")
    public static WebElement over42000Employees;
    @FindBy(xpath= "//span[contains(text(),'Including more than 7,400 primary care physicians and specialists')]")
    public static WebElement captionOfSymbolOfEmployees;
    
    public void checkSymbolOfEmployees() {
        symbolOfEmployees.click();
    }
    public void checkOver42000Employees() {
        over42000Employees.click();
    }
    public void checkCaptionOfSymbolOfEmployees() {
        captionOfSymbolOfEmployees.click();
    }
    
    @FindBy(xpath = "//a[contains(text(),'Inside Mount Sinai Blog')]//parent::li//parent::ul//parent::div[@class='nav navbar col-xs-12']")
    public static WebElement insideMountSinaiBlog;
    
    public void checkInsideMountSinaiBlog() {
        insideMountSinaiBlog.click();
    }
    
    @FindBy(xpath = "//i[@class='fa fa-linkedin']")
    public static WebElement blogInLinkedIn;
    
    public void checkBlogInLinkedIn() {
        blogInLinkedIn.click();
    }
    
    @FindBy(xpath = "//i[@class='fa fa-facebook']")
    public static WebElement blogInFaceBook;
    
    public void checkBlogInFaceBook() {
        blogInFaceBook.click();
    }
    
    @FindBy(xpath = "//i[@class='fa fa-twitter']")
    public static WebElement blogInTwitter;
    
    public void checkBlogInTwitter() {
        blogInTwitter.click();
    }
    
    @FindBy(xpath = "//i[@class='fa fa-youtube']")
    public static WebElement blogInYouTube;
    
    public void checkBlogInYouTube() {
        blogInYouTube.click();
    }
    
    @FindBy(xpath = "//i[@class='fa fa-instagram']")
    public static WebElement blogInInstagram;
    
    public void checkBlogInInstagram() {
        blogInInstagram.click();
    }
    
    @FindBy(xpath = "//i[@class='fa fa-pinterest']")
    public static WebElement blogInPinterest;
    
    public void checkBlogInPinterest() {
        blogInPinterest.click();
    }
    
    
    
    
    
    
    
    
	
	

}
