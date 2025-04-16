package praticesall;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BasicNavigationMethods {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(5000);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.manage().window().minimize();
	  Thread.sleep(5000);
	  driver.manage().window().fullscreen();
	  Thread.sleep(5000);
	  driver.navigate().to("https://www.facebook.com/");
	  Thread.sleep(5000);
	  driver.close();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  
	  
  }

}
