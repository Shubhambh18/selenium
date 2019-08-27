package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OtherElements {
	public static void main(String args[]) throws InterruptedException {
	String browserName="ff";
	
	if(browserName=="ff") {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver myDriver=new FirefoxDriver();
		myDriver.get("http://echoecho.com/htmlforms10.htm");
//		System.out.println("Title is "+ myDriver.getTitle());
//		boolean vRadio=myDriver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]")).isSelected();
//		if(vRadio) {
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
		myDriver.findElement(By.xpath("//input[@value='Milk']")).click();
		
//		int size = myDriver.findElements(By.xpath("//input[@type='radio']")).size();
//		System.out.println(size);
		
		List<WebElement> vRadio =  myDriver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<vRadio.size();i++) {
			
			if(vRadio.get(i).getAttribute("value").equals("Milk")){
				
				vRadio.get(i).click();
			}
			
		}
		
		
		
		
}
}
}