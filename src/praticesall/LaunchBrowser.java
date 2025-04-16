package praticesall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://www.google.com/");
  }
}
