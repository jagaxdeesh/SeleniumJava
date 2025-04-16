package dropdownvaluse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumDropDown {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.navigate().to("https://www.browserstack.com/guide/select-class-in-selenium");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"developers-dd-toggle\"]")).click();  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
