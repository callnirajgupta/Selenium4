package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectLocationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        
        WebElement element=driver.findElement(By.id("pid6"));
        		System.out.println("Height:" +element.getRect().getDimension().getHeight());
        		System.out.println("Width:" +element.getRect().getDimension().getWidth());
        		System.out.println("X Location: " +element.getRect().getX());
        		System.out.println("Y Location: " +element.getRect().getY());
        		
        		driver.close();
        

	}

}
