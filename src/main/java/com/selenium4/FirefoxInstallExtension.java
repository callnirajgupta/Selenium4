package com.selenium4;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxInstallExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		Path path = Paths.get(System.getProperty("user.dir")+"/src/main/resources/Firefox Installer.exe");
        String addon_id= driver.installExtension(path);
        //driver.uninstallExtension(addon_id);
		
	}

}
