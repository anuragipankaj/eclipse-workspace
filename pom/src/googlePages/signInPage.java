package googlePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage 
{
	
protected WebDriver driver;

private By headerPageText = By.cssSelector(".hidden-small");
private By createAccountLink = By.id("link-signup");
private By emailTextBox = By.id("Email");
private By passwordTextBox = By.id("Passwd");
private By loginBtn = By.id("signIn");
private By errorMsgTxt = By.id("errormsg_0_Passwd");



signInPage(WebDriver d )
{
	driver =d;	
}

public String getTitle()
{
	return driver.getTitle();
}

public boolean verifyPageTitle()
	{
	String expectedTitle = "Sign in - Google Accounts";
	return getTitle().equals(expectedTitle);
	}

public void enterUsernameName(String username)
{
WebElement element= driver.findElement(emailTextBox);
if(element.isDisplayed() && element.isEnabled() )
	element.sendKeys(username);
	
}
public void enterPassword(String password)
{
WebElement element= driver.findElement(passwordTextBox)	;
if(element.isDisplayed() && element.isEnabled() )
	element.sendKeys(password);
}

public void clickOnSignIn()
{
	WebElement element=driver.findElement(loginBtn);		
	if(element.isDisplayed() && element.isEnabled() )
		element.click();
}

public String getErrorMessage() 
{
String error=null;
WebElement element=driver.findElement(errorMsgTxt);
if(element.isDisplayed() && element.isEnabled() )
	error=element.getText();

return error;
}

public boolean verifySignIn()
{
enterUsernameName("test");
enterPassword("pass");

clickOnSignIn();
return getErrorMessage().contains("incorrect");

}

public createAccountPage createAccount()
{
WebElement element= driver.findElement(createAccountLink);
if(element.isDisplayed() && element.isEnabled() )
	element.click();
return new createAccountPage(driver);
}
}
