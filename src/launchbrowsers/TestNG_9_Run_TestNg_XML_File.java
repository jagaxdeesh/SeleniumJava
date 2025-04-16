package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_9_Run_TestNg_XML_File {
	WebDriver driver;
	
	
	@Test
	public void f() {
		driver.get("https://www.zomato.com");
	}
	
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void twitter() {
		driver.get("https://www.x.com");
	}
  
	
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
