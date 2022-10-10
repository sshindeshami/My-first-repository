package BasicsOfTestNG;

import org.testng.annotations.Test;

public class IntroductionToTestNG {
	
	@Test(priority=1)
	public void openUrl() {
		System.out.println("Url is opened");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("Logeed into the website");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("logged out");
	}

}
