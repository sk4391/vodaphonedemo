package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.VodaphoneInternationalRoamingPage;
import utility.Parameterization;

public class VodaphoneInternationalRoamingPageTest 
{
   WebDriver driver;
   
   @BeforeMethod
   public void openBrowser()
   {
	   driver = Browser.chromeBrowser();
   }
   @Test
   public void validateViInternationalRoaming() throws InterruptedException, EncryptedDocumentException, IOException
   {
	   VodaphoneInternationalRoamingPage viInternationalRoamingPage = new VodaphoneInternationalRoamingPage(driver);
	   
	   viInternationalRoamingPage.clickInternationalRoaming();
	   Thread.sleep(2000);
	   viInternationalRoamingPage.enterMobileNumber(Parameterization.getExcelData(0, 1, "credentials"));
	   //viInternationalRoamingPage.enterMobileNumber("8");
	   viInternationalRoamingPage.clickMobileNumberButton();
	   viInternationalRoamingPage.enterDestination(Parameterization.getExcelData(2, 1, "credentials"));
	   Thread.sleep(2000);
	   viInternationalRoamingPage.clickOnCountry();
	   viInternationalRoamingPage.clickOnDuration();
	   viInternationalRoamingPage.clickOnDays();
   }
}
