package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelBrowserTestNg {
	
	
	 
	  
	   @Test    
	    public void a(){
			System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
	            WebDriver driver = new FirefoxDriver();
	            driver.get("http://demo.guru99.com/V4/");
	            System.out.println("FUNCTION1");
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	        }
	        
		    @Test    
		        public void b(){
				System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
		        WebDriver driver = new FirefoxDriver();
		        driver.get("http://demo.guru99.com/V4/");
	            System.out.println("FUNCTION2");
		        driver.findElement(By.name("uid")).sendKeys("Driver 2");
		        
		        }
		    @Test    
		      public void c(){
				System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
		      WebDriver driver = new FirefoxDriver();
		      driver.get("http://demo.guru99.com/V4/");
		      System.out.println("FUNCTION3");
		      driver.findElement(By.name("uid")).sendKeys("Driver 3");
		      
		      }
}
