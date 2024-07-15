package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the GeckoDriver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Webdriver\\geckodriver-v0.33.0-win64\\geckodriver.exe");

        // Initialize Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Navigate to Gmail
        driver.get("https://www.gmail.com");
        Thread.sleep(5000);
        // Close the browser
        driver.quit();
    }
}
