package com.learn.automation;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/sushmagulapalli/selenium-automation");

    }
}
