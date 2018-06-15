package parallel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parallelClass2 {
	
	  @Test
	  public void Test1() 
	  {
		  long id=Thread.currentThread().getId();
		  System.out.println("class2 Thread :"+id);
	  }
	  
	 
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  long id=Thread.currentThread().getId();
		  System.out.println("Bf2 Thread :"+id);
	  }

	  @AfterMethod
	  public void afterMethod()
	  {
		  long id=Thread.currentThread().getId();
		  System.out.println("Af2 Thread :"+id);
	  }

	}