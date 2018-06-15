package StepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert; 

public class annotation { 
	
   WebDriver driver = null;
   
   @Given("^User on Facebook login page$") 
   public void goToFacebook()
   { 
	System.out.println("Opening the Facebook Page");
	System.setProperty("webdriver.chrome.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/chrome driver/chromedriver.exe");
	Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("profile.default_content_setting_values.notifications", 2);
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", prefs);
	
	driver = new ChromeDriver(options);
      driver.get("https://www.facebook.com/"); 
   }
	
   @When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) throws InterruptedException 
   {   
	   System.out.println("Entering the email .."+driver);
      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1); 
 
   }
	
   @When ("^I enter password$") 
   public void enterPassword(String arg1) 
   {
      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg1);
      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() 
   {  
	   if("https://www.facebook.com/login.php?login_attempt=1&lwv=110".equalsIgnoreCase(driver.getCurrentUrl()))
			   {
		   		System.out.println("FAILED !!");
		        driver.get("https://www.facebook.com/"); 
			   }
	   else
	   {
		   System.out.println("PASS :)");
	   }
	   
     driver.close(); 
   }
	   
}

