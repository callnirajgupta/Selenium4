package com.selenium4;

import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.emulation.Emulation;
import org.openqa.selenium.devtools.v96.log.Log;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureConsoleLogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		//Before selenium 4
		//driver.manage().logs();
		
		devTools.createSession();
	    devTools.send(Log.enable());

     devTools.addListener(Log.entryAdded(), logEntry -> {
		System.out.println("-------------------------------------------");
		System.out.println("Request ID = " + logEntry.getNetworkRequestId());
		System.out.println("URL = " + logEntry.getUrl());
		System.out.println("Source = " + logEntry.getSource());
		System.out.println("Level = " + logEntry.getLevel());
		System.out.println("Text = " + logEntry.getText());
		System.out.println("Timestamp = " + logEntry.getTimestamp());
     });
     driver.get("https://www.qed42.com/404");
     
     //driver.get("https://automationbookstore.dev/");
		//driver.quit();

	}

}
