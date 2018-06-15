package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseSetup 
{	
public WebDriver driver;
static String baseDriver="C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/";

public WebDriver getDriver()
	{
	return driver;
	}

private void setDriver(String browser,String url)
{
	switch(browser)
	{
	case "chrome":	
		System.setProperty("webdriver.chrome.driver",baseDriver+"chrome driver/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get(url);
		break;
		
	case "firefox":	
		System.setProperty("webdriver.gecko.driver",baseDriver+"gecko/geckodriver.exe");	
		driver = new FirefoxDriver();
		driver.get(url);
		break;	
	}	
	
}

@Parameters({"browser","url"})
@BeforeClass
public void setup(String browser,String url)
 	{
	try{ 
		setDriver(browser,url);
	
	}catch(Exception e)
		{
		System.out.println("Error in driver setup!!");
		}
 	}


@AfterClass
public void closeSetup()
{
	driver.quit();
}

}