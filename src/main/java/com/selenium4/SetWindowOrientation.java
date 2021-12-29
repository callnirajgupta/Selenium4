package com.selenium4;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.deviceorientation.DeviceOrientation;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetWindowOrientation {

	public static void main(String[] args){
        WebDriverManager.firefoxdriver().setup();
        
        FirefoxDriver driver = new FirefoxDriver();
  
        Path path = Paths.get(System.getProperty("user.dir")+"/src/main/resources/dark_reader-4.9.43-an+fx.xpi");
        String addon_id= driver.installExtension(path);
        driver.uninstallExtension(addon_id);
    }

}
