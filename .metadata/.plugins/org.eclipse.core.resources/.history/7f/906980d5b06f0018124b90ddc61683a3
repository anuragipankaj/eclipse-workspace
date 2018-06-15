package testng;

import org.testng.annotations.Test;

public class methodDepend {
	

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}
	@Test
	public void method1() {
		System.out.println("This is method 1");
	}
}
