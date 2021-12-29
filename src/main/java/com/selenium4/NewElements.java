package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//@FindsById("");
		//The FindsBy* interfaces example FindsByID, FindsByCss ..many more have been deleted
		//use findbyElement(By.id..ect)
		driver.get("https://www.google.com/");
		driver.findElement(By.id(null));
	

	}

}
