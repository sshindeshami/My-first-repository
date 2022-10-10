package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EnabledFalseEx {
	@BeforeClass 
	public void openBrowser() {
		System.out.println("browser opened");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	@Test(priority=1)
	public void m1() {
		System.out.println("method1");
	}
	@Test(priority=2,invocationCount=3,enabled=false)
	public void m2() {
		System.out.println("method2");
	}
	@Test(enabled=false)
	public void m3() {
		System.out.println("method3");
	}
	

}
