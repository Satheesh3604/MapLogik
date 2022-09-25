package com.adm.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgAnnotation {
	@BeforeSuite
	public void palyer1() {
		System.out.println("@BeforeSuite -palyer1 ");
	}
	@BeforeTest
	public void palyer2() {
		System.out.println("@BeforeTest -palyer2");
	}
	@BeforeClass
	public void palyer3() {
		System.out.println("@BeforeClass -palyer3");
	}
    @BeforeMethod
	public void palyer4() {
		System.out.println("@BeforeMethod -palyer4");
		
	}
	@Test
	public void testcase1() {
		System.out.println("@Test1 -testcase1");
	}
	
	@Test
	public void testcase2() {
		System.out.println("@Test2 -testcase2");
	}
	@AfterMethod
	public void palyer6() {
		System.out.println("@AfterMethod -palyer6");
		System.out.println("******************");
	}
	@AfterClass
	public void palyer7() {
		System.out.println("@AfterClass -palyer7");
	}
	@AfterTest
	public void palyer8() {
		System.out.println("@AfterTest -palyer8");
	}
	@AfterSuite
	public void palyer9() {
		System.out.println("@AfterSuite -palyer9");
	}
}
