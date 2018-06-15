package xmlDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class multiBrowser 
{
	public WebDriver driver;
	
  @Parameters({"browser","driverUrl"})	 
  @BeforeTest
  public void f(String browser,String driverUrl)
  {
	  System.out.println("Running Before test case for : "+browser );
	  if(browser.toLowerCase().equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver",driverUrl);
		  driver= new ChromeDriver();

	  }
	  else
	  {
		  System.setProperty("webdriver.gecko.driver",driverUrl);
		  driver= new FirefoxDriver();
	  }
	  
	  int width = 600;
	  int height = 400;
	  Dimension dimension = new Dimension(width, height);
	  driver.manage().window().setSize(dimension);
	  
  }
  
  @Test(dataProvider="getData")
   public void searchData(String str) throws InterruptedException
   {
	  driver.get("https://google.com");
	  Thread.sleep(3000);
	  driver.findElement(By.name("q")).sendKeys(str);
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(6000);
	  System.out.println("DATA :"+str); 
   }
  
  @DataProvider
  public String[] getData()
  {
	  String[] str= {"apple","xemoix"};
	  return str;
  }
 
  @AfterTest
  public void afterMethod() 
  {
	  driver.quit();
  }

}
