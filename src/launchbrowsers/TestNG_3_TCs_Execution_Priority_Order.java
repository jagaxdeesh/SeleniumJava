package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_3_TCs_Execution_Priority_Order {
	
	WebDriver driver;
	
  @Test(priority = 0)
  public void google() {
	 driver.get("https://www.google.com"); 
  }
  
  @Test(priority = 1)
  public void flipkart() {
	  driver.get("https://www.filpkart.com");
  }
  
  @Test(priority = 2)
   public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://www.google.com");  
  }

}
