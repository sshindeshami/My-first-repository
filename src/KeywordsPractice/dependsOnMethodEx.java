package KeywordsPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dependsOnMethodEx {
	@BeforeClass
	public void openBrowser() {
		System.out.println("browser has opened");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("browser has closed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("logged in app");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logged out of app");
	}
	
	@Test(priority=1, invocationCount=5)
	public void m1() {
		System.out.println("method1");
		Assert.fail();
	}
	@Test(priority=2, dependsOnMethods="m1")
	public void m2() {
		System.out.println("method2");
	}
	@Test(priority=3, dependsOnMethods= {"m2","m4"})
	public void m3() {
		System.out.println("method3");
	}
	@Test(priority=4)
	public void m4() {
		System.out.println("method4");
	}

}
