package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new FirefoxDriver();
	  driver.get("https:/www.flipkart.com");
  }
  @BeforeClass
  public void beforeClass() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
