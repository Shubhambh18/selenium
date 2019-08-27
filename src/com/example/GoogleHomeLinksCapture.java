package com.example;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHomeLinksCapture {
	public static void main(String args[]) throws InterruptedException {
	String browserName="ff";
	
	if(browserName=="ff") {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver myDriver=new FirefoxDriver();
		myDriver.get("http://www.google.co.in");
		List<WebElement> links=myDriver.findElements(By.tagName("a"));
	for(int i=0;i<links.size();i++) {
		if(links.get(i).getText().matches("[a-zA-Z]+"))	
		{
			System.out.println(links.get(i).getText() + " - " + links.get(i).getAttribute("href"));
		}else {
		
			
			}
	}
			
		}
	}

}