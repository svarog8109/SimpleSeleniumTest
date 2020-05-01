package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleSeleniumTest {
    @Test
    public void TestMethod(){
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Andrei\\IdeaProjects\\SeleniumTest\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");



        driver.quit();


    }
}
