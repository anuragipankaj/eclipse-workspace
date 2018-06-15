package googlePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basePage 
  {
protected WebDriver driver;
private By signInBtn=By.linkText("Sign in");
public basePage(WebDriver d)
	{
	driver=d;
	}

public String getTittle()
	{
	String t= driver.getTitle();
			return t;
	}

public boolean verifyPageTitle()
	{
	return (getTittle().equals("Google"));	
	}

public signInPage clickSigninBtn()
	{
		System.out.println("Clicking SignIn Button!!");
		WebElement element=driver.findElement(signInBtn);		
		if(element.isDisplayed() && element.isEnabled() )
			element.click();
		else
			System.out.println("Can't signIn!!");
		
		return new signInPage(driver);
	}


}
