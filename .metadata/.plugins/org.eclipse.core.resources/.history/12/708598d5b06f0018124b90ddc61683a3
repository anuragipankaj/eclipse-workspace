package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class firefoxDemo 
{
	
public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver;
	
	System.out.println("starting things...");
	
	System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
	driver = new FirefoxDriver();
	int i=0;
	
	for(i=0;i<20;i++)
	{
	driver.get("https://google.com");
	System.out.println("LOADING THE PAGE ...");

	System.out.println("locating the searchbox by name -'q'");
	
	WebElement searchBox = driver.findElement(By.name("q"));
	
	//Writing a text "ArtOfTesting" in the search box
	searchBox.sendKeys("man in black"+i);
	searchBox.submit();
	Thread.sleep(5000); 
	}
	//driver.quit();
	System.out.println("standing the browser..");
	}
}
