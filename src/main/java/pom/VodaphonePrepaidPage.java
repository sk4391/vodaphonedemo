package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VodaphonePrepaidPage
{
    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]") private WebElement prepaid;
    @FindBy (xpath = "//a[text()='Mobile Recharge']")private WebElement mobileRecharge;
    @FindBy(xpath ="//input[@id='mobile']")private WebElement mobileNo;
    @FindBy(xpath="//input[@id='rechargeamount']")private WebElement rechargeAmount;
    @FindBy (xpath ="//a[text()='Prepaid Plans']")private WebElement prepaidPlan;
    @FindBy(xpath="//a[text()='Disney+ Hotstar']")private WebElement rechargeplan;
    @FindBy (xpath="//a[text()='Unlimited Plans']")private WebElement unlimitedPlan;
    @FindBy (xpath="//a[text()='Recommended packs']")private WebElement recommendedPacks;
    @FindBy (xpath="//a[text()='Talktime Plans']")private WebElement talktimePlans;
    @FindBy (xpath="//a[text()='Data Plans']")private WebElement dataPlans;
    
    public VodaphonePrepaidPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void clickOnPrepaid()
    {
    	prepaid.click();
    }
    public void clickOnMobileRecharge()
    {
    	mobileRecharge.click();
    }
    public void enterMobileNumber(String number,WebDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    	wait.until(ExpectedConditions.visibilityOf(mobileNo));
    	mobileNo.sendKeys(number);
    }
    public void enterRechargeAmount(String amount,WebDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    	wait.until(ExpectedConditions.visibilityOf(rechargeAmount));
    	rechargeAmount.sendKeys(amount);
    }
    public void clickPrepaidPlan()
    {
    	
    	prepaidPlan.click();
    }
    public void clickRechargePlan()
    {
    	rechargeplan.click();
    }
    
}
