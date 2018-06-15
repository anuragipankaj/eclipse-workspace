package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestBase.TestBaseSetup;
import googlePages.basePage;


public class testBasePage extends TestBaseSetup
{
private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		basePage basePage = new basePage(driver);
		Assert.assertTrue(basePage.verifyPageTitle(), "Home page title doesn't match");
		System.out.println("SUCCESS");
	}

}