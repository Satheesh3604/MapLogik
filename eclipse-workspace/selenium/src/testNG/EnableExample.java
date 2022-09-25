package testNG;

import org.testng.annotations.Test;

public class EnableExample {
	@Test(priority = 0)
	public void Car() {
		System.out.println("start The car");
	}
	@Test(priority = 1)
	public void Carfirst() {
		System.out.println("first gear ");
	}
	// false disable method automatically ture enabled the program
	@Test(priority = 5,enabled = false )
	public void Cartopspeed() {
		System.out.println("music on ");
	}
	@Test(priority = 2)
	public void Carsecond() {
		System.out.println("second gear");
	}
	@Test(priority = 3)
	public void Carthird() {
		System.out.println("third gear");
	}
	@Test(priority = 4)
	public void Carfourth() {
		System.out.println("fourth gear");
	}
}
