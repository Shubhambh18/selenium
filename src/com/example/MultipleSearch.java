package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleSearch {

	public static void main(String args[]) throws InterruptedException {
		String browserName="ff";
	
		if(browserName=="ff") {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver myDriver=new FirefoxDriver();
		
//			System.out.println("Title is "+ myDriver.getTitle());
			
			String arr[]= {"Apple Xs","Samsung Note 10","Redmi Note 7 Pro","Redmi K20","Pixel 3"};
			for(int i=0;i<arr.length;i++) {
				myDriver.get("http://www.google.co.in");
				Thread.sleep(2000);
				myDriver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys(arr[i]);
				Thread.sleep(2000);
				//myDriver.findElement(By.name("btnK")).click();
				myDriver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[3]/center/input[1]")).click();
				Thread.sleep(2000);
				String test = myDriver.findElement(By.name("q")).getAttribute("value");
				if(test.equals(arr[i])) {
					System.out.println("Pass");
				}
				else {
					System.out.println("Fail");
				}
				
				System.out.println(myDriver.findElement(By.id("resultStats")).getText());
				Thread.sleep(2000);
				
			}
			
	}
}
}
