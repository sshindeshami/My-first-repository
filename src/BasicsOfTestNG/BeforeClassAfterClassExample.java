package BasicsOfTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAfterClassExample {
	@BeforeClass
	public void login() {
		System.out.println("login to application");
		Reporter.log("login to application");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout of application");
		}
	@Test(priority=1)
	public void homepage() {
		System.out.println("checking the homepage");
		Reporter.log("checking the homepage");
	}
	@Test(priority=3)
	public void profilepage() {
		System.out.println("checking the profilrepage");
		Reporter.log("checking the profilepage");
	}
	@Test(priority=2)
		public void notificationPage() {
			//System.out.println("checking the notifications");
			Reporter.log("checking the notifications");
		}
	}


