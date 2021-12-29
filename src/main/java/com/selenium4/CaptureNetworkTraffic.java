package com.selenium4;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.network.Network;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureNetworkTraffic {

    private static ChromeDriver driver;
    private static DevTools chromeDevTools;

   

    public static void main(String[] args){
    	WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        chromeDevTools = driver.getDevTools();
        chromeDevTools.createSession();

        chromeDevTools.send(
                Network.enable(Optional.empty(), Optional.empty(), Optional.empty())
        );

        chromeDevTools.addListener(Network.requestWillBeSent(),
                entry -> {
                    System.out.println("Request URI : " + entry.getRequest().getUrl()+"\n"
                    + " With method : "+entry.getRequest().getMethod() + "\n");
                    entry.getRequest().getMethod();
                });
        driver.get("https://www.google.com");
        chromeDevTools.send(Network.disable());
        
        driver.close();
    }
}
