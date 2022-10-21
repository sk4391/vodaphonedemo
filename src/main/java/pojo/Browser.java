package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser
{
  public static WebDriver chromeBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.navigate().to("https://www.myvi.in/");
	  
	  driver.manage().window().maximize();
	  
	//  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);//implicit wait is applicable for every instance of webdriver
	  
	  return driver;
	  
	  
  }
}
