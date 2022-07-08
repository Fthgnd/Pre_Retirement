package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	
	
	   WebDriver driver;
		public CalculatorPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "current-age")
	    public WebElement CurrentAge;
		

		@FindBy(id = "retirement-age")
	    public WebElement RetirementAge;
		
		@FindBy(id = "current-income")
	    public WebElement CurrentIncome;
		
		@FindBy(id = "spouse-income")
	    public WebElement SpouseIncome;
		
		@FindBy(id = "current-total-savings")
	    public WebElement currentTotalSaving;
		
		@FindBy(id = "current-annual-savings")
	    public WebElement currentAnualSaving;
		
		@FindBy(id = "savings-increase-rate")
	    public WebElement SavingIncreaseRate;
		
		@FindBy(id = "yes-social-benefits")
	    public WebElement SocialSecurity;
		
		@FindBy(id = "married")
	    public WebElement MaritalStatus;
		
		@FindBy(id = "social-security-override")
	    public WebElement SocialSecutityOveride;
		
		@FindBy(xpath = "//a[text()='Adjust default values']")
	    public WebElement DefaultAdjustment;
		
		@FindBy(id = "additional-income")
	    public WebElement AdditionalIncome; 
		
		@FindBy(id = "retirement-duration")
	    public WebElement RetirementDuration;
		
		@FindBy(xpath = "//input[@id='include-inflation']")
	    public WebElement InflationStatus;
		
		@FindBy(id = "expected-inflation-rate")
	    public WebElement ExpectedInflationRate;
		
		@FindBy(id = "retirement-annual-income") 
	    public WebElement RetirementAnnualIncome;
		
		@FindBy(id = "pre-retirement-roi")  
	    public WebElement PreRetirementRoi;
		
		@FindBy(id = "post-retirement-roi")
	    public WebElement PostRetirementRoi;
		  
		@FindBy(xpath = "//button[text()='Save changes']")/////////
	    public WebElement SaveChangesButton;
		
		@FindBy(xpath = "//button[text()='Calculate']")
	    public WebElement CalculateButton;
//------------------------		

		public WebElement currentAge() {
			  return CurrentAge;
		  }
		public WebElement retirementAge() {
			  return RetirementAge;
		  }
		public WebElement currentIncome() {
			  return CurrentIncome;
		  }
		public WebElement spouseIncome() {
			  return SpouseIncome;
		  }
		public WebElement CurrentTotalSaving() {
			  return currentTotalSaving;
		  }
		public WebElement CurrentAnualSaving() {
			  return currentAnualSaving;
		  }
		public WebElement savingIncreaseRate() {
			  return SavingIncreaseRate;
		  }
		public WebElement socialSecurity() {
			  return SocialSecurity;
		  }
		public WebElement maritalStatus() {
			  return MaritalStatus;
		  }
		public WebElement socialSecutityOveride() {
			  return SocialSecutityOveride;
		  }
		public WebElement defaultAdjustment() {
			  return DefaultAdjustment;
		  }
		public WebElement additionalIncome() {
			  return AdditionalIncome;
		  }
		public WebElement retirementDuration() {
			  return RetirementDuration;
		  }
		public WebElement inflationStatus() {
			  return InflationStatus;
		  }
		public WebElement expectedInflationRate() {
			  return ExpectedInflationRate;
		  }
		public WebElement preRetirementRoi() {
			  return PreRetirementRoi;
		  }
		public WebElement postRetirementRoi() {
			  return PostRetirementRoi;
		  }
		public WebElement saveChangesButton() {
			  return SaveChangesButton;
		  }
		public WebElement calculateButton() {
			  return CalculateButton;
		  }
}
