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
        
        ChromeDriver driver = new ChromeDriver();

        DevTools  devTools = driver.getDevTools();
        devTools.createSession();

        Command deviceOrientationCmd = DeviceOrientation.setDeviceOrientationOverride(20,20,5);

        devTools.send(deviceOrientationCmd);

        driver.get("https://www.facebook.com");

    }

}
