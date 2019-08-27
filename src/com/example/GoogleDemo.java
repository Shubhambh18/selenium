package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemo {
	
	public static void main(String [] args) throws InterruptedException {
		
		String browserName="property";
		
		if(browserName=="GC") {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver myDriver=new ChromeDriver();
			myDriver.get("http://www.google.co.in");
			System.out.println("Title is "+ myDriver.getTitle());
			myDriver.manage().window().maximize();
			myDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Samsung S10+");
			Thread.sleep(5000);
			myDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div[2]/center/input[1]")).click();
			myDriver.close();
		} 
	
		else if(browserName=="FF") {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver myDriver=new FirefoxDriver();
			myDriver.get("http://www.google.co.in");
			System.out.println("Title is "+ myDriver.getTitle());
			myDriver.close();
		}
			else if(browserName=="property") {
				System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				WebDriver myDriver=new FirefoxDriver();
				myDriver.get("http://www.google.co.in");
				System.out.println("Title is "+ myDriver.getTitle());
				
//				myDriver.findElement(By.linkText("Learn more")).click();
//				Thread.sleep(6000);
//				myDriver.findElement(By.id("identifierId")).sendKeys("manojmay11994@gmail.com");
//				Thread.sleep(1000);
//				myDriver.findElement(By.id("identifierNext")).click();
//				Thread.sleep(1000);
//				myDriver.findElement(By.name("password")).sendKeys("manoj1994");
//				Thread.sleep(1000);
//				myDriver.findElement(By.id("passwordNext")).click();
//				Thread.sleep(50000);
////				Thread.sleep(50000);
//				myDriver.findElement(By.xpath("//button[@className='RveJvd snByac']"));
//				Thread.sleep(50000);
//				myDriver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mozshubh");
//				Thread.sleep(50000);
//				myDriver.findElement(By.xpath("//*[@class='whsOnd zHQkBf']")).sendKeys("mozshubh");
//				Thread.sleep(50000);
//				myDriver.findElement(By.cssSelector("#identifierId")).sendKeys("sam");
//				Thread.sleep(5000);
//				myDriver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Sam");
//				Thread.sleep(5000);
//				Thread.sleep(1000);
//				myDriver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("testing");
//				Thread.sleep(3000);
//				myDriver.findElement(By.name("btnK")).click();
//				Thread.sleep(5000);
//				System.out.println(myDriver.findElement(By.id("resultStats")).getText());
//				myDriver.findElement(By.name("q")).click();
//				Thread.sleep(2000);
//			System.out.println(myDriver.findElement(By.className("erkvQe")).getText());
//			Thread.sleep(20000000);
//				myDriver.close();
				
				
			}
		
		
	}
	

}
