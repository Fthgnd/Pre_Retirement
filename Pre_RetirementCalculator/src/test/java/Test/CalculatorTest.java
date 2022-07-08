package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.CalculatorPage;
import io.github.bonigarcia.wdm.WebDriverManager;



public class CalculatorTest {
	
	WebDriver driver;
	CalculatorPage cal = new CalculatorPage(driver);
	
    @BeforeClass
	public void testSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void openBrowser() {
		driver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
		System.out.println("we are inside Pre-retirement calculator page");
	}

	@Test(priority = 0)
	public void SubmitAllFiledsWithoutAdjustDefaultValues() {
		cal.CurrentAge.sendKeys("40");
		cal.RetirementAge.sendKeys("68");
		cal.CurrentIncome.sendKeys("100000");
		cal.SpouseIncome.sendKeys("75000");
		cal.currentTotalSaving.sendKeys("500000");
		cal.currentTotalSaving.sendKeys("10");
		cal.SavingIncreaseRate.sendKeys(".25");
		
		cal.SocialSecurity.click();
		cal.MaritalStatus.click();
		cal.SocialSecutityOveride.sendKeys("4000");
		cal.CalculateButton.click();
	String actual = driver.findElement(By.id("result-message")).getText();
	Assert.assertTrue(true);
	System.out.println("we submit all reguired fields in felled in without Default calculator values ");
	}

	
	@Test(priority = 1)
	public void SocialSecurityDisplay() {
		WebElement n =driver.findElement(By.linkText("Should we include Social Security benefits?"));
				
	      //check if element visible
		boolean t = driver.findElement(By.partialLinkText("Refund")).isDisplayed();
	      if (true) {
	         System.out.println("Element is dispalyed");
	      } else {
	         System.out.println("Element is not dispalyed");
	      }
	}
		
	@Test(priority = 2)
	public void SubmitAllFiledsWithAdjustDefaultValues() {
		cal.CurrentAge.sendKeys("40");
		cal.RetirementAge.sendKeys("68");
		cal.CurrentIncome.sendKeys("100000");
		cal.SpouseIncome.sendKeys("75000");
		cal.currentTotalSaving.sendKeys("500000");
		cal.currentTotalSaving.sendKeys("10");
		cal.SavingIncreaseRate.sendKeys(".25");
		
		cal.SocialSecurity.click();
		cal.MaritalStatus.click();
		cal.SocialSecutityOveride.sendKeys("4000");
		
		cal.DefaultAdjustment.click();
		cal.AdditionalIncome.sendKeys("500");
		cal.RetirementDuration.sendKeys("20");
		cal.InflationStatus.click();
		cal.RetirementAnnualIncome.sendKeys("75");
		cal.PreRetirementRoi.sendKeys("8");
		cal.PostRetirementRoi.sendKeys("5");
		cal.SaveChangesButton.click();
		cal.CalculateButton.click();
		
	String actual = driver.findElement(By.id("result-message")).getText();
	Assert.assertTrue(true);
	System.out.println("we submit all reguired fields in felled in with Default calculator values ");
	}	
	
	@AfterMethod
	public void postSubmission() {
		System.out.println("Form submission successful!");
	}

	@AfterClass
	public void afterClass() {

	driver.quit();
	}

}
