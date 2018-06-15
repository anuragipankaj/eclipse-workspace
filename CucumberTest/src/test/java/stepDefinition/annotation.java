package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class annotation 
{
	WebDriver driver;
	
	@Given("^User navigates to Facebook$")
	public void user_navigates_to_Facebook() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/chrome driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://facebook.com");
	}

	@When("^I enters username \"(.*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable 
	{
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(arg1); 
	}

	@When("^I enters password \"(.*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable 
	{
	      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(arg1); 
	}

	@When("^click for login$")
	public void click_for_login() throws Throwable 
	{
	      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER); 
	}

	@Then("^should get result for \"([^\"]*)\" and \"([^\"]*)\"$")
	public void should_get_result_for_and(String username, String pass) throws Throwable 
	{
		System.out.println("Output : "+username+", "+pass+" at link :"+ driver.getCurrentUrl() );
		driver.quit();
	} 
	
	/*
	@Then("^Login should pass$")
	public void login_should_pass() throws Throwable 
	{
	Assert.assertEquals("https://www.facebook.com/",driver.getCurrentUrl());	
	driver.quit();
	}
	
	@Then("^Login should fail$")
	public void login_should_fail() throws Throwable 
	{
	Assert.assertEquals("https://www.facebook.com/login.php?login_attempt=1&lwv=110", driver.getCurrentUrl());
	driver.quit();
	}
	*/


}
