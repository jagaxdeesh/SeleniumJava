package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_5_Description_Feature {
	
	WebDriver driver;
	
  @Ignore
  @Test(description = "to verify the facebook account",enabled = false)
  public void f() {
	  driver.get("https://www.facebook.com");
  }
 
  @Test(description = "to verify the google account",priority = 0)
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
