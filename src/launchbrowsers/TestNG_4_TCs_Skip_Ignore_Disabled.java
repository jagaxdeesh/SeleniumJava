package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_4_TCs_Skip_Ignore_Disabled {
	WebDriver driver;
	
  @Test(priority = 1,enabled = false)
  public void facebook() {
	  driver.get("https://www.facebook.com");  
  }
  
  @Test(priority = 0)
  public void google() {
	  driver.get("https://www.google.com");  
  }
  
  @Ignore
  @Test(priority = 2,enabled = true)
  public void techlearn() {
	  driver.get("https://www.techlearn.in");  
  }
  
  @Test(priority = 3)
  public void flipkart() {
	  driver.get("https://www.flipkart.com");  
  }
  
  @Test(priority = 4,enabled = true)
  public void amazon() {
	  driver.get("https://www.amazon.com");  
  }
  
  @Test(priority = 5)
  public void instagram() {
	  driver.get("https://www.instagram.com");  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
