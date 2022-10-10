package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class timeoutsEx {
	@BeforeClass
	public void openBrowser() {
		System.out.println("browser opened");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("logged in app");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logged out of app");
	}
	
	@Test(priority=1, timeOut=5000)
	public void m1() throws InterruptedException {
		Thread.sleep(6000);  //it will pass coz it will wait till 5 sec
		System.out.println("method1");
	}
	@Test(priority=2, timeOut=3000)
	public void m2() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("method2");
	}
	@Test(priority=3)
	public void m3() {
		System.out.println("method3");
	}
	

}
