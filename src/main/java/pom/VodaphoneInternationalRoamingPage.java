package pom;


import org.openqa.selenium.WebDriver;
////input[@id='mask_0']
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VodaphoneInternationalRoamingPage 
{
	@FindBy(xpath = "//a[text()='International Roaming ']")private WebElement internationalRoaming;
	@FindBy(xpath = "//input[@id='mask_0']")private WebElement mobileNumber;
	@FindBy(xpath = "//button[@id='mobnumberbutton']")private WebElement numberButton;
	@FindBy(xpath = "//input[@id='tags']")private WebElement destination;
	@FindBy(xpath = "//b[text()='Russia']")private WebElement searchContent;
	@FindBy(xpath = "//b[text()='choose your travel duration']")private WebElement duration;
	@FindBy(xpath = "//div[@data-thumb-index='14']")private WebElement timeDuration;
	
	
	
	public VodaphoneInternationalRoamingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickInternationalRoaming()
	{
		internationalRoaming.click();
	}
	public void enterMobileNumber(String mNum)
	{
		mobileNumber.sendKeys(mNum);
	}
	public void clickMobileNumberButton()
	{
		numberButton.click();
	}
	 public void enterDestination(String travelling)
	 {
		 destination.sendKeys(travelling);
	 }
	 public void clickOnCountry() 
	 {
	    searchContent.click();	 
	 }
	 public void clickOnDuration()
	 {
		 duration.click();
	 }
	 public void clickOnDays()
	 {
		 timeDuration.click();
	 }
	 

}
