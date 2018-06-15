package parallel;

import java.sql.Time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class multipleRunTest
{
	public long start,end;
	public int count=0;
	@BeforeSuite
	public void start()
	{
		start=System.currentTimeMillis();
		System.out.println("START :"+start);	
	}
	
    @Test(threadPoolSize =2, invocationCount = 4, timeOut = 50000)
    public void function() throws InterruptedException
  {
    	count++;
    	System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
    	WebDriver driver= new FirefoxDriver();
    	driver.get("https://google.com");
    	Thread.sleep(4000);
    	long id =Thread.currentThread().getId();
    	System.out.println("Thread :"+id+ ", for :"+count);
    	driver.quit();
  }
    @AfterSuite
    public void end()
    {
    	end=System.currentTimeMillis();
    	System.out.println("END :"+end);
    	System.out.println("Time :"+(end-start));
    }
}
