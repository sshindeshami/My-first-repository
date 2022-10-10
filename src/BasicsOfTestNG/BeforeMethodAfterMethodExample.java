package BasicsOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethodExample {
	@BeforeMethod
	public void login() {
		System.out.println("login to application");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logged out of application");
	}
	@Test(priority=1)
	public void homePage() {
		System.out.println("Checking the homepage");
		Reporter.log("checking the homepage");
	}
	@Test(priority=3)
	public void notificationPage() {
		System.out.println("checking the notifications");
		Reporter.log("checking the notifications");
	}
	@Test(priority=2)
	public void profilepage() {
		System.out.println("Checking the profile page");
		Reporter.log("checking the profile page");
	}
	

}
