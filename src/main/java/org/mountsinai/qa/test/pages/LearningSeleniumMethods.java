package org.mountsinai.qa.test.pages;

import org.mountsinai.qa.test.base.BasePage;
import org.mountsinai.qa.test.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LearningSeleniumMethods extends BasePage {
	WebDriver driver;
	ElementUtil elementUtil;
	
	public LearningSeleniumMethods(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		elementUtil.waitForElementPresent(logo); //better to use something which is present in home page

	}
	By logo = By.xpath("//img[@alt='Mount Sinai']");
	
	public boolean verifyLogo() {
		return elementUtil.doIsDisplayed(logo);
	}
	
	//Number#1 standard
	@FindBy(xpath = "//h2[starts-with(text(),'Mount Sinai at a Glance')]")
	public static WebElement mountSinaiAtAGlance;

	public void checkMountSinaiAtAGlance() {
		mountSinaiAtAGlance.click();
	}
	
	//Number#2
	//This is other way to write @FindBy
	
	@FindBy(how = How.XPATH, using = "(//span[text()='1-800-MD-SINAI'])[1]")
	public static WebElement contactNumber;
	
	public void checkContactNumber() {
		contactNumber.click();
	}
	
	@FindBy(xpath = "(//a[contains(text(),'For Physicians')])[1]")
	WebElement forPhysician;
	
	//image, link, button, text field, check box etc.--isDisplayed
	
	public boolean verifyForPhysician() {
		return forPhysician.isDisplayed();
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Specialty')])[3]")
	WebElement specialityButton;
	
	//isSelected() method is predominantly used with radio buttons, dropdowns and checkboxes.
	
	public boolean verifySpecialityButton() {
		return specialityButton.isSelected();
		}
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Book an Appointment']")
	public static WebElement bookAnAppointment;
	
	//isEnabled() is primarily used with buttons.
	
	public boolean verifyBookAnAppointment() {
		return bookAnAppointment.isEnabled();
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	
	
	
	

}
