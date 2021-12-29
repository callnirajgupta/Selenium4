package com.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotFullScrenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
        driver.get("https://www.selenium.dev/");
        File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File destFile =new File(System.getProperty("user.dir")+"//src//main///resorces//fullscreen.png");
		try {
			FileUtils.copyFile(file,destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
driver.close();
//driver.quit();
		

	}

}
