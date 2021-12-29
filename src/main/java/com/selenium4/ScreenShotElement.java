package com.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        WebElement logo=driver.findElement(By.id("pid6"));
             
        		File file=logo.getScreenshotAs(OutputType.FILE);
        		File destFile =new File(System.getProperty("user.dir")+"//src//main///resorces//book.png");
        		try {
					FileUtils.copyFile(file,destFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
driver.close();
driver.quit();
	}

}
