package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonDemo {
	public static void main(String args[]) throws InterruptedException {
		String browserName="ff";
		
		if(browserName=="ff") {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver myDriver=new FirefoxDriver();
			myDriver.get("https://www.amazon.com");
			Actions act = new Actions(myDriver);
			act.moveToElement(myDriver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"))).build().perform();
			myDriver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
			Thread.sleep(2000);
			myDriver.close();

	}
	}
}