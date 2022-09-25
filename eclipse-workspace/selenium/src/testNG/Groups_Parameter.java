package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups_Parameter {
	@Test (groups = {"batter"})
	public void palyer1() {
		System.out.println("no:1");
	}
	@Test(groups = {"bowler"})
	public void palyer2() {
		System.out.println("no:2");
	}
	@Test (groups = {"batter"})
	public void palyer3() {
		System.out.println("no:3");
	}
	@Test(groups = {"bowler"})
	
	@Parameters("captain")
	public void palyer4(String name) {
		System.out.println("palyer_4 :"+name);
	}
	@Test(groups = {"bowler"})
	public void palyer5() {
		System.out.println("no:5");
	}
	@Test(groups = {"sub"})
	public void palyer12() {
		System.out.println("no:12");
	}
	@Test(groups = {"bowler"})
	public void palyer6() {
		System.out.println("no:1");
	}
	@Test
	public void palyer7() {
		System.out.println("no:7");
	}
	@Test(groups = {"bowler"})
	public void palyer8() {
		System.out.println("no:8");
	}
	@Test(groups = {"batter"})
	@Parameters("batsman")
	public void palyer9(String name) {
		System.out.println("player_9:"+name);
	}
	@Test(groups = {"bowler"})
	
	public void palyer10() {
		System.out.println("no:10");
	}
	@Test(groups = {"bowler"})
	public void palyer11() {
		System.out.println("no:11");
	}


}
