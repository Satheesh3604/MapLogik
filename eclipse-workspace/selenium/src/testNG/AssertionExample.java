package testNG;




import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	String name = "satheesh";
	@Test
	public void equals() {
/*		if(name.equals("Satheesh")) {
			System.out.println("name is equals");
		}else {
			System.out.println("name is not equals");
		}*/
//		Assert.assertNotEquals(name, "Satheesh");
//		Assert.assertEquals(name,"sasi");
//		Assert.assertSame(name, "satheesh");
		Assert.assertNotEquals(name,"sasi");
		
	}
}
