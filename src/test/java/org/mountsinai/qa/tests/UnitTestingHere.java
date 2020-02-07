package org.mountsinai.qa.tests;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnitTestingHere {

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
		wait = new WebDriverWait(driver, 5); //explicit wait
		js = (JavascriptExecutor) driver;
	}

	/*
	 * Nasir Shaheb::: 1) driver.manage().timeouts().implicitlyWait(TimeOut,
	 * TimeUnit.SECONDS); why it is not in our code? 2) can I put name of webelement
	 * inside the webdriver wait? 3) can we use imlicit wait and explicit wait at
	 * the same time? 4) fluentwait need to be clear 5) 6)clear possible by
	 * javascript 7) use .getAttribute() method---47 8)hyperlink -- by linketext or
	 * partial, or other way? 9) at 50, i have to add shohag's attachment of keys
	 * 10) use of @CacheLookup 11) use of @SuppressWarnings("static-access") 12)
	 * will run google.com without http, what will happen? open or not? 13) use of
	 * driver.navigate().to(). 57, use all the navigate method together. 14)
	 */

	// Using of Web driver wait (dynamic wait)
	// "Submit" by clicking "Enter" button from keyboard
	// Find A doctor by name -- Ahmed Asad
//	@Test
//	public void findADoctorByNameTest() throws Exception {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='hidden-xs dropdown'])[2]"))).click();
//	driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]")).click();
//	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ahmed");
//	driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Asad", Keys.ENTER);
//	System.out.println(driver.getCurrentUrl());
//	}
//	
//	
    
	
	//use of navigate().to()
	//use of navigate().back()
	//use of navigate().forward()
	//use of navigate().forward()
	//use of Javascript
	//use of setSize() of the browser
	
	@Test
	public void sendKeysToAmazonSearch() throws InterruptedException, AWTException {
		
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
		
		Robot robot = new Robot();

        // Scroll Down using Robot class
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

        // Scroll Up using Robot class
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

//		//Find element by link text and store in variable "Element"        		
//        WebElement Element = driver.findElement(By.linkText("Linux"));
//
//        //This will scroll the page till the element is found		
//        js.executeScript("arguments[0].scrollIntoView();", Element);
////This will scroll the web page till end.		
	// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	// WebElement Element = driver.findElement(By.linkText("VBScript"));

	// This will scroll the page Horizontally till the element is found
	// js.executeScript("arguments[0].scrollIntoView();", Element);

	// This will scroll down the page by 600 pixel vertical
	// js.executeScript("window.scrollBy(0,600)","");
	// This will scroll up the page by 600 pixel vertical
	// js.executeScript("window.scrollBy(0,-600)","");

//		String script = "window.location = \'"+url+"\'";
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript(script)
//       
	// To do refresh by Javascript
//		js.executeScript("history.go(0)");

	// fetching page title
//		String sText =js.executeScript("return document.title;").toString();

	// fetching elements using js
//		WebElement search =(WebElement) js.executeScript("return document.getElementById('searchBtn');");

	// fetching total frames
//		String frames = js.executeScript("document.frames.length;").toString();

	// scrolling down to the element
//		js.executeScript("arguments[0].scrollIntoView(true);", element);

	// scrolling down to coordinate
//		js.executeScript("window.scrollBy(300,2000)");

	// highlighting the element
//		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", ele, "background:"
//		    + "yellow; color: Red; border: 4px dotted solid yellow;");
//		
	// clicking an element
	// js.executeScript("arguments[0].click();",element);

	// if you wanna open in a same tab as above
//		js.executeScript("arguments[0].setAttribute('target','_self');",element); // to open in same tab
	// element.click(); //is it necessary need to check

	// popup
//		js.executeScript("alert('Enter your Facebook crednetials');");
//		js.executeScript("confirm('Enter your Facebook crednetials');");
//		js.executeScript("prompt('Enter your crednetials',’Enter domain’);")
//

	// https://www.guru99.com/using-robot-api-selenium.html

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
