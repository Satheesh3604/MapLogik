package testNG;

import org.testng.annotations.Test;

public class dependsOnMethodExample {
	// false another method not run
	@Test(priority = 0,enabled = true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSchool" )
	public void highersecondarySchool() {
		System.out.println("highersecondary School");
	}
	@Test(dependsOnMethods = "highersecondarySchool" )
	public void college() {
		System.out.println("college");
	}
}
