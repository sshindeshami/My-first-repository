package BasicsOfTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforTestAfterTestClass2 {
	@BeforeClass
	public void login() {
		System.out.println("login to application");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout of application");
	}

	@Test(priority=2)
	public static  void notificationpage() {
	System.out.println("checking the notifications");
}
}