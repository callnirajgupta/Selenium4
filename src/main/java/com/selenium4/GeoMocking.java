package com.selenium4;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoMocking {



    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        
        DevTools  devTools = driver.getDevTools();
        
        devTools.createSession();
        
        HashMap geoLocation = new HashMap()
        {{
            put("latitude", 12.93707);
            put("longitude", 77.71327);
            put("accuracy", 100);
        }};
        driver.executeCdpCommand("Emulation.setGeolocationOverride", geoLocation);
        driver.get("https://mycurrentlocation.net/");
    }
}
