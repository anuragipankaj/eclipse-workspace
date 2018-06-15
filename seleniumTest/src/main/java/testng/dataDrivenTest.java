package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenTest
{
	public WebDriver driver;
	public String driverUrl="C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe";
	public String WebUrl="https://google.com";
	
@BeforeTest
public void initialData()
{
System.setProperty("webdriver.gecko.driver", driverUrl);
driver = new FirefoxDriver();

}
		
@Test(dataProvider="getData")
  public void f(final String str) throws InterruptedException 
  {
	driver.get(WebUrl);
	driver.findElement(By.name("q")).sendKeys(str);
	System.out.println("Searching for the keyword :"+str);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	String content =driver.getPageSource();
	System.out.println("DATA for "+str+" :"+content);
	Thread.sleep(3000);
  }

@DataProvider
public String[] getData()
{
String[] data= {"pankaj anuragi","xemoix"};
return data;
}


@AfterTest
public void closeBrowser()
{
	driver.quit();
	}

}
