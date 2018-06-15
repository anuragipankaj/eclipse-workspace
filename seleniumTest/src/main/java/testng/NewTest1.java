package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest1 {
    public WebDriver driver ;
    public String  driverUrl="C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe";
    public String webUrl="https://google.com";
     
 @BeforeTest
 public void openBrowser()
 {
	 System.out.println("launching firefox browser"); 
	 System.setProperty("webdriver.gecko.driver",driverUrl );
	 driver = new FirefoxDriver();
	  driver.get(webUrl);
 }
    
  @Test(priority=0)
  public void verifyHomepageTitle() {
       
      String actualTitle = driver.getTitle();
      String expectedTitle="Google";
      System.out.println("Tittle NAME :"+actualTitle);
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test(priority=1)
public void gotoImage()
  	  {
	  String expectedTitle="Google";
	  String actualTitle=driver.getTitle();
	  System.out.println("Image Tittle NAME :"+actualTitle);
	  Assert.assertEquals(actualTitle, expectedTitle);
	  }
  
  @AfterTest
  public void closeBrowser()
  {
      driver.close();

  }
}