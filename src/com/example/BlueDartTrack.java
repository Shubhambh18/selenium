package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BlueDartTrack {
	public static void main(String args[]) throws InterruptedException {
		String browserName="ff";
		
		if(browserName=="ff") {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver myDriver=new FirefoxDriver();
			myDriver.get("https://www.bluedart.com/tracking");
			myDriver.findElement(By.xpath("//*[@id=\"radioBtn1\"]")).click();
			Thread.sleep(2000);
			myDriver.findElement(By.xpath("//*[@id=\"trackingNo\"]")).sendKeys("36629517643");
			Thread.sleep(2000);
			myDriver.findElement(By.xpath("//*[@id=\"goBtn\"]")).click();
			Thread.sleep(200000);
			
	}
	}
}
