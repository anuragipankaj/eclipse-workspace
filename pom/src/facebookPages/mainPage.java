package facebookPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage
{
	protected WebDriver driver;
	private By loginBtn=By.xpath("//input[@value='Log In']");
	private By emailBox=By.xpath("//input[@id='email']");
	private By passwordBox=By.xpath("//input[@id='pass']");

 public mainPage(WebDriver d)
	{
		driver =d;
	}

public String getTitle()
	{
	return driver.getTitle();
	}
	
	
public boolean verifyTitle()
	{
		String t=getTitle();
		System.out.println("TITLE :"+t);
		return t.equals("Facebook � log in or sign up");
	}

public void enterEmail(String email)
{
	WebElement element=driver.findElement(emailBox);
	element.sendKeys(email);
	
}

public void enterPassword(String pass)
{
	WebElement element=driver.findElement(passwordBox);
	element.sendKeys(pass);
}

public afterLogin clickLoginBtn()
	{
		WebElement element=driver.findElement(loginBtn);
		element.click();
		return (new afterLogin(driver));
	}

	public boolean verifyLogin()
	{
		return driver.getTitle().equals("Facebook");
	}

}
