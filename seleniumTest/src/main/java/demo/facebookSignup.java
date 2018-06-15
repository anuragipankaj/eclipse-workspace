package demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignup {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/gecko/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://Facebook.com");
		/*Scanner s= new Scanner(System.in);
		System.out.println("CREATTING YOUR FACEBOOK ACCOUNT..");
		System.out.println("Enter the Fist name");
		String firstname=s.next();
		System.out.println("Enter the surname");
		String surname= s.next();
		System.out.println("Enter the email addresss");
		String email= s.next();
		System.out.println("We will creatting password for you so chill");
		System.out.println("We need your Dob");
		int a,c;
		String b;
		System.out.println("Enter the day/month/year ..?");
		a=s.nextInt();
		b=s.next();
		c=s.nextInt();
		int gender=0;
		*/

		 driver.findElement(By.name("firstname")).sendKeys("xemoix");;
		 driver.findElement(By.name("lastname")).sendKeys("xemoix");
		 driver.findElement(By.name("reg_email__")).sendKeys("staging107_purch@yahoo.com");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("staging107_purch@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("badboysthings");
		 new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText(String.valueOf(8));
		 new Select( driver.findElement(By.name("birthday_month"))).selectByVisibleText("Aug");
		 new Select( driver.findElement(By.name("birthday_year"))).selectByVisibleText(String.valueOf(1996));
		 driver.findElement(By.cssSelector("input[id='u_0_7']")).click();
		 driver.findElement(By.name("websubmit")).click();

		 
		 
		 
			
		
	}

}
