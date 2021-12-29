package com.selenium4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v96.performance.Performance;
import org.openqa.selenium.devtools.v96.performance.model.Metric;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetProformanceMetrics {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();

        ChromeDriver  driver = new ChromeDriver();
        DevTools chromeDevTools = driver.getDevTools();
        chromeDevTools.createSession();

        
        chromeDevTools.send(Performance.enable(Optional.empty()));

            driver.get("https://www.google.org");
            List<Metric> metrics = chromeDevTools.send(Performance.getMetrics());
            //List<Metric> metrics = chromeDevTools.send(getMetrics());
        chromeDevTools.send(Performance.disable());
        List<String> metricNames = metrics.stream().map(o -> o.getName())
                .collect(Collectors.toList());
        List<String> toCaptureMetricNames = Arrays
                .asList(new String[] { "Timestamp", "Documents", "Frames",
                        "JSEventListeners", "LayoutObjects", "MediaKeySessions", "Nodes",
                        "Resources", "DomContentLoaded", "NavigationStart" });
       
        toCaptureMetricNames.forEach( metric  -> System.out.println(metric +
                                            " is : " +
                                            metrics.get(metricNames.indexOf(metric)).getValue()));




    }

}
