package screenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class TimeformateScreenshot {
	WebDriver driver;
	
	
public void getscreenshot() {
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
	Date date = new Date();
	String time = dateFormat.format(date);
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(f, new File("D:\\Lib\\screenshots\\Techlearn_" + time + ".png"));
	
	
}

  @Test
  public void googlesearch() throws InterruptedException {
	  
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  getscreenshot();
	  driver.findElement(By.name("log")).sendKeys("jagadeesh");
	  Thread.sleep(2000);
	  getscreenshot();
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("yt1tgfafi0");
	  Thread.sleep(2000);
	  getscreenshot();
	  driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	  Thread.sleep(2000);
	  getscreenshot();
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  Thread.sleep(2000);
	  getscreenshot();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
