package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorNearBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//button[@jsname="Cuz2Ue"]
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        
       String text= driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.id("session_password"))).getAttribute("type");
       System.out.println("Text"+text);
       driver.close();
	}

}
