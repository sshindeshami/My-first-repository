package BasicsOfTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforTestAfterTestClass1 {
	@BeforeTest
	public void openBrowser() {
		System.out.println("browser opened");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("browser closed");
	}
	@BeforeClass
	public void login() {
		System.out.println("login to application");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout of application");
	}
	@Test(priority=2)
	public void homePage() {
		System.out.println("checking the homepage");
	}
      @Test(priority=2)
	public void ForGitHub() {
		System.out.println("this is modification for github");
	}
	

	

}
