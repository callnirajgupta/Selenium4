package com.selenium4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptInsecureCertificate {

	public static void main(String[] args) {
	        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/main/resources/chromedriver");
             WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true);
            //old code
	        //DesiredCapabilities caps = new DesiredCapabilities();
	        //caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

	        ChromeDriver chromeDriver = new ChromeDriver(options);
	        chromeDriver.get("http://ftp://random.vib.slx/");
	        


	        WebDriverManager.edgedriver().setup();

	        EdgeOptions edgeOptions = new EdgeOptions();
	        edgeOptions.setAcceptInsecureCerts(true);

	        EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
	        edgeDriver.get("http://ftp://random.vib.slx/");
	        
             
	        WebDriverManager.firefoxdriver().setup();

	        FirefoxOptions op = new FirefoxOptions();
	        op.setAcceptInsecureCerts(true);
	        FirefoxDriver fireFoxDriver = new FirefoxDriver(op);
	        fireFoxDriver.get("http://ftp://random.vib.slx/");
	        
	        WebDriverManager.iedriver().setup();
	        
	        InternetExplorerOptions ops = new InternetExplorerOptions();
	        ops.setAcceptInsecureCerts(true);

	        InternetExplorerDriver ie = new InternetExplorerDriver(ops);
	        ie.get("http://ftp://random.vib.slx/");

	    }
	}


