package StepDefinition;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step 
{
	XSSFWorkbook workBook;
	XSSFSheet sheet;
	WebDriver driver ;
	
	
	@When("^I read the excel file \"(.*?)\"$")
	public void i_read_the_excel_file(String arg1) throws Throwable
	{
	System.setProperty("webdriver.chrome.driver", "C:/Users/anuragi.pankaj/Downloads/installed softwares/selenium/chrome driver/chromedriver.exe");
	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", prefs);
	 driver = new ChromeDriver(options);
	
		workBook =new XSSFWorkbook(new FileInputStream(System.getProperty("user.dir")+"/"+arg1));
		System.out.println("Got the File"+ workBook);
	}

	@Then("^I access a worksheet$")
	public void i_access_a_worksheet() throws Throwable
	{
		 sheet= workBook.getSheet("Sheet1");
		System.out.println("Got the sheet");
	}

	@Then("^I access the rows and cells$")
	public void i_access_the_rows_and_cells() throws Throwable 
	{
		int count =0;
		String username = null,pass = null;
		System.out.println("Reading the sheet!!");
		for(int i=1;i< sheet.getPhysicalNumberOfRows();i++)
		{
		 Row r= sheet.getRow(i);
		 for(int j=0;j< r.getPhysicalNumberOfCells();j++)
		 {
			 r.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
			 Cell  c= r.getCell(j);
			 System.out.print("  ROW :"+c.getStringCellValue());
		 if(j==0)
			 username=c.getStringCellValue();
		 if(j==1)
			 pass=c.getStringCellValue();
		 }
		 
		 if(username!=null && pass!=null)
		 {
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username); 
     	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass); 
     	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);

     	Thread.sleep(2000);
     	if("https://www.facebook.com/".equals(driver.getCurrentUrl()))
     	{
     		count ++;
     		System.out.print("\nSucess: "+username+","+pass);
     		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
     		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

     	    driver.findElement(By.partialLinkText("Log Out")).click();         
     	 }
     	else
			 System.out.println("\nFailed: "+username+": "+pass);
     	
		 }
		 
			 
		 System.out.println();
		}
		
		driver.quit();
	}


}
