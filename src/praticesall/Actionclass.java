package praticesall;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Actionclass {
	WebDriver driver;
	
  @Test(enabled = false)
  public void rightclick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  Thread.sleep(2000);
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-17\"]/a"))).build().perform();
  
  }
  
  @Test(enabled = false)
  public void doubleclick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick=\"handleDoubleTap()\"]"))).build().perform();
      driver.switchTo().alert().accept(); 
  }
  
  @Test
  public void mousehover() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
	  Thread.sleep(2000);
	//  act.moveToElement(driver.findElement(By.xpath("")))
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
