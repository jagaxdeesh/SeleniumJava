package newtabfunction;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTabs {
	WebDriver driver;
	
  @Test(enabled = false)
  public void frame() throws InterruptedException {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  driver.switchTo().frame("iframeResult");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
	  Thread.sleep(2000);
	  
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
	  
	  driver.switchTo().window(tabs.get(0));
	  driver.close();
	  
  
  }
  
  @Test
  public void techlearn() throws InterruptedException {
      driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  driver.switchTo().newWindow(WindowType.TAB);
	  Thread.sleep(2000);
	  driver.get("https://www.seleniumlearn.com/admin");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();	  
  }

}
