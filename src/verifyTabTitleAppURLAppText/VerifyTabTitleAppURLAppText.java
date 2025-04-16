package verifyTabTitleAppURLAppText;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class VerifyTabTitleAppURLAppText {
	WebDriver driver;
	
  @Test(enabled = false)
  public void tabTittle() {
	  
	  driver.get("https://www.google.com/");
	  
	  String exptabtext = "Google";
	  System.out.println("Expcted Tab Text is:"+exptabtext);
	  
	  String acttabtext = driver.getTitle();
	  System.out.println("Actual Tab Text is:"+acttabtext);
	  
	  }
  
  @Ignore
  @Test 
  public void applicationurl() {
	  driver.get("https://www.google.com/");
	  
	  String expurl = "https://www.google.com/";
	  
	  String acturl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(acturl, acturl);
	  
  }
  
  @Test
  public void applicationimage() {
	  
	  driver.get("https://www.google.com");
	  
	  String expimage = "Gmail";
	  String actimage = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();
      Assert.assertEquals(actimage, expimage);
      
      String expimagetext = "Images";
      String actimagetext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();
      Assert.assertEquals(actimagetext, expimagetext);
      
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
