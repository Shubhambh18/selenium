package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffComponents {
	public static void main(String args[]) throws InterruptedException {
		String browserName="ff";
		
		if(browserName=="ff") {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver myDriver=new FirefoxDriver();
			myDriver.get("http://register.rediff.com/register/register.php?FormName=user_details");
//			Select s=new Select(myDriver.findElement(By.id("country")));
//			s.selectByIndex(3);
//			Thread.sleep(3000);
//			s.selectByValue("101");	
//			Thread.sleep(3000);
//			s.selectByVisibleText("United States");
//			System.out.println(s.isMultiple());
//			myDriver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
//			Thread.sleep(3000);
////			myDriver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")).click();
////			myDriver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[16]/td/div/table/tbody/tr[2]/td[3]/select")).click();
////			Thread.sleep(3000);
//			myDriver.findElement(By.xpath()).click();
//			Select s= new Select(myDriver.findElement(By.xpath("\"/html/body/center/form/div/table[2]/tbody/tr[16]/td/div/table/tbody/tr[2]/td[3]/select\""))).click();
//			Thread.sleep(30000);
			myDriver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
			Thread.sleep(3000);
			Select select = new Select(myDriver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")));
			
		    select.selectByIndex(2);
		    Thread.sleep(2000);

		    
		    myDriver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("Rubik's cube");
		    Thread.sleep(3000);
		    //System.out.println(select.isMultiple());
		    myDriver.quit();
			

	}
	}
}