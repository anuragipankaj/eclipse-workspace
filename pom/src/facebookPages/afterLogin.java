package facebookPages;

import org.openqa.selenium.WebDriver;

public class afterLogin 
{
	protected WebDriver driver;
	
	 afterLogin(WebDriver d)
	{
		driver =d;
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}

	public boolean verifyTitle()
	{
	return getTitle().equals("Facebook");
	}
	
}
