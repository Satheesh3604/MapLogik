import org.testng.annotations.Test;

public class Example {
	@Test(priority = 6)
	public void Example1() {
		System.out.println("Maven");
	}
	@Test(priority = 0)
	public void Car() {
		System.out.println("start The car");
	}
	@Test(priority = 1)
	public void Carfirst() {
		System.out.println("first gear ");
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
