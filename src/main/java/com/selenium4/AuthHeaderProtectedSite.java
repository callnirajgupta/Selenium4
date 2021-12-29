package com.selenium4;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthHeaderProtectedSite {

	
    private static Map<String, Object> params = new HashMap<>();
    private static final String USERNAME = "guest";
    private static final String PASSWORD = "guest";

    final static String PROJECT_PATH = System.getProperty("user.dir");

    public static void main(String[] args){
       WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        DevTools chromeDevTools = driver.getDevTools();
        chromeDevTools.createSession();
                   //Authentication example
        //String URL = "https://" +username +":" +password +"@"+ "the-internet.herokuapp.com/basic_auth";
		//driver.get(URL);
        
                driver.get("https://jigsaw.w3.org/HTTP/");
                driver.executeCdpCommand("Network.enable", params);
                //Authorization
                Map<String, String> headers = new HashMap<>();
                Base64 base64 = new Base64();
                headers.put("Authorization",
                        "Basic " + new String(base64.encode(String.format("%s:%s", USERNAME, PASSWORD).getBytes())));
                 params = new HashMap<>();
                 params.put("headers", headers);
                driver.executeCdpCommand("Network.setExtraHTTPHeaders", params);

            WebElement element = driver.findElement(By.cssSelector("table td> a[href=\"Basic/\"]"));
                element.click();

                String loginSuccessMsg = driver.findElement(By.tagName("html")).getText();
                if(loginSuccessMsg.contains("Your browser made it!")){
                    System.out.println("Login successful");
                }else{
                    System.out.println("Login failed");
                }
    }
}
