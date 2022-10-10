package annotationsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforTestAfterTestPractice1 {
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
		System.out.println("login");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	@Test
	public void notification() {
		System.out.println("check notifications");
	}
	@Test
	public void homepage() {
		System.out.println("check homepage");

}
}