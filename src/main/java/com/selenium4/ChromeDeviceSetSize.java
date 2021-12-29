package com.selenium4;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDeviceSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		  driver.get("https://automationbookstore.dev/");
		  
		 
		/*
		 * Map deviceMetrics = new HashMap() {{ put("width", 600); put("height", 1000);
		 * put("mobile", true); put("deviceScaleFactor", 50); }};
		 * driver.executeCdpCommand("Emulation.setDeviceMetricsOverride",
		 * deviceMetrics);
		 */
        driver.get("https://www.youtube.com");

        //driver.close();
	}

}
