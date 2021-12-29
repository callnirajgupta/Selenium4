package com.selenium4;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.network.model.ConnectionType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetNetwork {

	public static void main(String[] args){
        WebDriverManager.chromedriver().setup();


        ChromeDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        Map networkConditions = new HashMap()
        {{
            put("offline", false);
            put("latency", 20);
            put("downloadThroughput", 100);
            put("uploadThroughput", 100);
            put("connectionType",ConnectionType.CELLULAR4G);
        }};
        driver.executeCdpCommand("Network.emulateNetworkConditions", networkConditions);
        driver.get("https://www.google.com");
    }
}
