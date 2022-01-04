package com.selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width_css");

        // switching to the result frame
        driver.switchTo().frame("iframeResult");

        String textInParentFrame= driver.findElement(By.xpath("//p[text()]")).getText();
        System.out.println(textInParentFrame);

        WebElement nestedFrame= driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));

        //switching the nested frame
        driver.switchTo().frame(nestedFrame);
        String textInNestedFrame= driver.findElement(By.xpath("//h1[text()]")).getText();
        System.out.println(textInNestedFrame);

        // switching back to the result frame
        driver.switchTo().parentFrame();
        textInParentFrame= driver.findElement(By.xpath("//p[text()]")).getText();
        System.out.println(textInParentFrame);

        driver.quit();

	}

}
