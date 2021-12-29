package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
//“Relative locators”/friendly locator: 
	//a friendly way of locating elements using terms that users use, 
	//like “near”, “left of”, “right of”, “above” and “below”
 
        String id1 =  driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid6"))
                .below(By.id("pid1")))
                .getAttribute("id");
        System.out.println("Print the ID1: "+id1);
        
        String id2 = driver.findElement(RelativeLocator.with(By.tagName("li"))
                .above(By.id("pid6"))
                .toRightOf(By.id("pid1")))
        .getAttribute("id");
        
        System.out.println("Print the ID2: "+id2);
        //near() : Target web element which is away(approx. 50 pixels) from the specified element.
        String id3 = driver.findElement(RelativeLocator.with(By.tagName("li")).near(By.id("pid2"))).getAttribute("id");
       
        
        System.out.println("Print the ID3: "+id3);

  driver.close();
  driver.quit();
  
  
	}

}
