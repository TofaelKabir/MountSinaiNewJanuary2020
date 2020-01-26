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

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		sa = new SoftAssert();
		lsm = PageFactory.initElements(driver, LearningSeleniumMethods.class);
		wait = new WebDriverWait(driver, 5);
	}

	 /* Nasir Shaheb:::
	  1) driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS); why it is not in our code?
	  2) can I put name of webelement inside the webdriver wait?
	  3) can we use imlicit wait and explicit wait at the same time?
	  4) fluentwait need to be clear
	  5) javascript kaj kortase for all?
	  6)clear possible by javascript
	  7) use .getAttribute() method---47
	  8)hyperlink -- by linketext or partial, or other way?
	  9) at 50, i have to add shohag's attachment of keys
	  10) use of @CacheLookup
      11) use of @SuppressWarnings("static-access")
      12) will run google.com without http, what will happen? open or not?
      13) use of driver.navigate().to(). 57, use all the navigate method together.
      14) 
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
	
	
	// Nasir bhai
		@Test
		public void AndreaPerezBySearchTest() throws InterruptedException {
			WebElement searchKey = driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]"));
			WebElement searchField = driver.findElement(By.xpath("(//input[@class='form-control dropdown-menu__input--search'])[2]"));
			WebElement submitButton = driver.findElement(By.xpath("(//button[contains(text(),'Search')])[2]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", searchKey);
			Thread.sleep(3000);
//			js.executeScript("document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').setAttribute('Value', Irene Rahman);");
			js.executeScript("arguments[0].value='Andrea Perez'", searchField);
//			js.executeScript("document.getElementByXpath('(//input[@class='form-control dropdown-menu__input--search'])[2]').setRangeText('Irene Rahman');");
			
			Thread.sleep(3000);
			js.executeScript("arguments[0].click()", submitButton);
		}
		
		// "Submit" by clicking "Enter" button from keyboard
		@Test
		public void findADoctorByNameTest2() throws Exception {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement findADoctor = driver.findElement(By.xpath("(//a[@class='hidden-xs dropdown'])[2]"));
			Thread.sleep(5000);// Generally smart tester don't use it, they use webdriverWait.
			WebElement findADoctorByName = driver.findElement(By.xpath("(//span[contains(text(),'By Name')])[4]"));
			WebElement lastName = driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
			WebElement firstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
			WebElement goButton = driver.findElement(By.xpath("(//button[contains(text(),'Go')])[6]"));
			js.executeScript("arguments[0].click()", findADoctor);
			js.executeScript("arguments[0].click()", findADoctorByName);
			js.executeScript("arguments[0].value='Perez'", lastName);
			js.executeScript("arguments[0].value='Andrea'", firstName);
			js.executeScript("arguments[0].click()", goButton);
			
		}
		@Test
		public void sendKeysToAmazonSearch() {
			WebDriverManager.chromedriver().setup();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			WebElement submitButton = driver.findElement(By.xpath("//input[@tabindex='20']"));
			js.executeScript("arguments[0].value='macbook air'", searchField);
			js.executeScript("arguments[0].click()", submitButton);
		}
//		//Find element by link text and store in variable "Element"        		
//        WebElement Element = driver.findElement(By.linkText("Linux"));
//
//        //This will scroll the page till the element is found		
//        js.executeScript("arguments[0].scrollIntoView();", Element);
////This will scroll the web page till end.		
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//WebElement Element = driver.findElement(By.linkText("VBScript"));

        //This will scroll the page Horizontally till the element is found		
        //js.executeScript("arguments[0].scrollIntoView();", Element);
		
		// This  will scroll down the page by  600 pixel vertical
	//js.executeScript("window.scrollBy(0,600)","");
		// This  will scroll up the page by  600 pixel vertical
		//js.executeScript("window.scrollBy(0,-600)","");
		
//		String script = "window.location = \'"+url+"\'";
//		JavascriptExecutor js =(JavascriptExecutor)driver;
//		js.executeScript(script)
//       
		//To do refresh
//		js.executeScript("history.go(0)");
		
		//fetching page title
//		String sText =js.executeScript("return document.title;").toString();
		
		//fetching elements using js
//		WebElement search =(WebElement) js.executeScript("return document.getElementById('searchBtn');");
		
		//fetching total frames
//		String frames = js.executeScript("document.frames.length;").toString();
		
		//scrolling down to the element
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//scrolling down to coordinate
//		js.executeScript("window.scrollBy(300,2000)");
		
		//highlighting the element
//		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", ele, "background:"
//		    + "yellow; color: Red; border: 4px dotted solid yellow;");
//		
		//clicking an element
		//js.executeScript("arguments[0].click();",element);
		
		//if you wanna open in a same tab as above
//		js.executeScript("arguments[0].setAttribute('target','_self');",element); // to open in same tab
		//element.click();  //is it necessary need to check
		
		//popup
//		js.executeScript("alert('Enter your Facebook crednetials');");
//		js.executeScript("confirm('Enter your Facebook crednetials');");
//		js.executeScript("prompt('Enter your crednetials',’Enter domain’);")
//

		
		//https://www.guru99.com/using-robot-api-selenium.html

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

	
}
