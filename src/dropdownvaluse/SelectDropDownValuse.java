package dropdownvaluse;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropDownValuse {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://www.redmine.org/account/register");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("techlearn.india@gmail.com");
	  Thread.sleep(2000);
	  Select l = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
// l.selectByContainsVisibleText("German");
// l.selectByIndex(8);
	  l.selectByValue("it");
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
