package demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class faceboolLoginChrome {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/chrome driver/chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
		
		driver = new ChromeDriver(options);
		
		driver.get("https://Facebook.com");
		Thread.sleep(3000); 

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9968285308");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pankaj");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[@dir='ltr'][contains(text(),'Dharamveer Singh')]")).click();
		Thread.sleep(2000); 
		new Actions(driver).sendKeys(Keys.ESCAPE).build().perform();
		driver.findElement(By.xpath("//div[@id='fbTimelineHeadline']/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		List<WebElement> friends1;
		
		while(true)
		{	
		 friends1=driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));
		int y=friends1.get(friends1.size()-1).getLocation().y;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+y+")" );
		Thread.sleep(3000);
		System.out.println("FIENDS COUNT :"+ friends1.size());
		List<WebElement> friends2=driver.findElements(By.xpath("//div[@class='fsl fwb fcb']/a"));
		if(friends1.size()==friends2.size())
				break;
		//Thread.sleep(5000);
	//	driver.quit();
		}
		System.out.println("TOTAL :"+friends1.size());
		for(WebElement e: friends1)
		{
			System.out.println(e.getText());
		}
		
		
	}
}
