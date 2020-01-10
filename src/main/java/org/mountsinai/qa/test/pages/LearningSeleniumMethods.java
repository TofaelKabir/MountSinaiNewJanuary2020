package org.mountsinai.qa.test.pages;

import org.mountsinai.qa.test.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LearningSeleniumMethods extends BasePage {
	WebDriver driver;
	//ElementUtil elementUtil;

	//Number#1 standard
	@FindBy(xpath = "//img[@alt='Mount Sinai']")
	public static WebElement logo;

	public void checkLogo() {
		logo.click();
	}
	
	//Tanzina please write 5 webelement and method
	
	//Number#2
	//This is other way to write @FindBy
	
	@FindBy(how = How.XPATH, using = "(//span[text()='1-800-MD-SINAI'])[1]")
	public static WebElement contactNumber;
	
	public void checkContactNumber() {
		contactNumber.click();
	}
	
	
	
	
	

}
