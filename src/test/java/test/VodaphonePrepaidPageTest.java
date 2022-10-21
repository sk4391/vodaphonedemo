package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.VodaphonePrepaidPage;
import utility.Parameterization;

public class VodaphonePrepaidPageTest 
{
   WebDriver driver;
   
   @BeforeMethod
   public void openBrowser()
   {
	   driver=Browser.chromeBrowser();
   }
   @Test
   public void validateVodaphonePrepaidMobileRecharge() throws EncryptedDocumentException, IOException, InterruptedException
   {
	   VodaphonePrepaidPage vodaphonePrepaidPage = new VodaphonePrepaidPage(driver);
	   
	   vodaphonePrepaidPage.clickOnPrepaid();
	   vodaphonePrepaidPage.clickOnMobileRecharge();
	   vodaphonePrepaidPage.enterMobileNumber(Parameterization.getExcelData(0, 1, "credentials"), driver);
	   
	   vodaphonePrepaidPage.enterRechargeAmount(Parameterization.getExcelData(1, 1, "credentials"), driver);
	   
	   
   }
   @Test(priority = 1)
   public void validateVodaphonePrepaidPlan()
   {
	   VodaphonePrepaidPage vodaphonePrepaidPage = new VodaphonePrepaidPage(driver);
	   
	   vodaphonePrepaidPage.clickOnPrepaid();
	   vodaphonePrepaidPage.clickPrepaidPlan();
	   vodaphonePrepaidPage.clickRechargePlan();
   }
}
