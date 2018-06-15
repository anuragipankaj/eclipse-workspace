package parallel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class parallelTest {
	
	
  @Test
  public void Test1() 
  {
	 System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://google.com");
	 long id=Thread.currentThread().getId();
	 System.out.println("Test1 Thread :"+id);
  }
  
  
  @Test
  public void Test2() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			driver.get("https://facebook.com");
	  long id=Thread.currentThread().getId();
	  System.out.println("Test2 Thread :"+id);
  }

  @BeforeMethod
  public void beforeMethod()
  {
	  long id=Thread.currentThread().getId();
	  System.out.println("Bf Thread :"+id);
  }

  @AfterMethod
  public void afterMethod()
  {
	  long id=Thread.currentThread().getId();
	  System.out.println("Af Thread :"+id);
  }

}
