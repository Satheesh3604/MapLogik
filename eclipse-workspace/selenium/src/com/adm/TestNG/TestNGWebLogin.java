package com.adm.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestNGWebLogin {
	public static WebElement userName(WebDriver driver){
		return driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
		
	}
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']"));
	}
	public static WebElement login(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[text()='Login'])[3]"));
	}
	public static WebElement mobile(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[contains(text(),'Mobiles')])[2]"));
	}
	public static WebElement home(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[contains(text(),'Home')])[2]"));
	}
	public static WebElement search(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@class='_3704LK']"));
	}
	

}
