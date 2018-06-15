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

public class annotation { 
	
   WebDriver driver = null;
   
   @Given("^Open the Firefox and launch the Facebook$") 
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
	   Thread.sleep(3000);
	   System.out.println("Entering the email .."+driver);
      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1); 
 
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) 
   {
      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg1);
      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() 
   {  
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test1 Pass"); 
      } else { 
         System.out.println("Test1 Failed"); 
      } 
     driver.close(); 
   }
	   
}
