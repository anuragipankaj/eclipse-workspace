package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import TestBase.TestBaseSetup;
import facebookPages.mainPage;


public class testFbMainPage extends TestBaseSetup {
private WebDriver driver;	

@BeforeClass
public void setUp() 
{
	driver=getDriver();
}

@Test(priority=1)
  public void verifyMainPage()
  {
	mainPage page= new mainPage(driver);
	Assert.assertTrue(page.verifyTitle(), "Home page title doesn't match");
	System.out.println("Facebook loaded!!");
  }
@Test(priority=2)
 public void verifyLogin()
 {
	System.out.println("Current page :"+driver.getCurrentUrl());
	mainPage page= new mainPage(driver);
	page.enterEmail("9968285308");
	page.enterPassword("pankaj");
	page.clickLoginBtn();
	Assert.assertTrue(page.verifyLogin(),"Login Failed!!!");
	System.out.println("Facebook Login Success!!");

 
 }
}
