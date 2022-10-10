package annotationsPractice;

import org.testng.annotations.Test;

public class Basics {
	
	@Test(priority=1)
	public void login() {
		System.out.println("application is logged in");
	}
	@Test(priority=2)
	public void homepage() {
		System.out.println("check homepage");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("logged out of app");
	}

}
