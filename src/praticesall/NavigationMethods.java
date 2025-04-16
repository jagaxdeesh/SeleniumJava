package praticesall;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationMethods {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.navigate().to("https://www.facebook.com/");
	  Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(3000);
      driver.navigate().forward();
      Thread.sleep(2000);
      driver.navigate().refresh();
	  
  }
}
