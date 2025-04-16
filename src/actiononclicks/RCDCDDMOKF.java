package actiononclicks;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class RCDCDDMOKF {
	WebDriver driver;
	
  	
  @Test(enabled = true)
  public void rightClick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code");
	  Thread.sleep(2000);
	  Actions a = new Actions(driver);
	  a.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-2798\"]/a"))).build().perform();
  }
  
  @Ignore
  @Test
  public void doubleClick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick=\"handleDoubleTap()\"]"))).build().perform();
      Thread.sleep(2000);
	  driver.switchTo().alert().accept();
  }
  
  @Test(enabled = false)
  public void mouseover() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tutorials']"))).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[normalize-space()='sikuli']")).click();
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='sikuli']"))).click().build().perform();
  }
  
  @Test(enabled = false)
  public void dragdrop() {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/"); 
	  Actions a = new Actions(driver);
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
	  WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));

	  a.dragAndDrop(source, target).build().perform();
  }
  
  @Test
  public void keywoard() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  Actions a = new Actions(driver);
	  //a.sendKeys(Keys.ENTER).build().perform();
	  a.sendKeys(Keys.TAB).build().perform();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
