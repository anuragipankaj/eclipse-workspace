package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class testAlert
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;		
		System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("file:///D:/code files/test.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert a= driver.switchTo().alert();
		String st=a.getText();
		a.accept();
		
		System.out.println(st);
	}
	
}
