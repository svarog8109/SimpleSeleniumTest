package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GfiTest {


    @Test
    public void test1() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrei\\Documents\\Drv\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        PageObject Pobject = new PageObject(driver);
        driver.get("https://www.ihk-gfi.de/");

        String phone = "0231 9746-0";
        String e = Pobject.getPhone();
        Assert.assertEquals(e, phone);
        String e2 = Pobject.getPhone2();
        Assert.assertEquals(e2, phone);
        Pobject.getImpressumLink();
        String titleI = Pobject.getTitle();
        Assert.assertEquals(titleI, "Impressum - IHK-GfI");
        driver.navigate().back();
        String titleM = Pobject.getTitle();
        Assert.assertEquals(titleM, "Willkommen - IHK-GfI");
        Pobject.getDatenshutzLink();
        String titleD = Pobject.getTitle();
        Assert.assertEquals(titleD, "Datenschutzerklärung - IHK-GfI");
        driver.navigate().back();
        Assert.assertEquals(titleM, "Willkommen - IHK-GfI");
        String pGf3= Pobject.getPanelGf3();
        Assert.assertEquals(pGf3,"Über uns – lerne uns kennen");
        Pobject.getSearch();

        driver.quit();



    }
    @Test
    public void test2()throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrei\\Documents\\Drv\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        PageObject Pobject = new PageObject(driver);
        driver.get("https://www.ihk-gfi.de/");
        Pobject.setSearch("Duales Studium");
        Thread.sleep(1000);
        Pobject.getSearchHits();
        Pobject.getLinkText();


        driver.quit();

                    }
        @Test
        public void test3(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrei\\Documents\\Drv\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            PageObject Pobject = new PageObject(driver);
            driver.get("https://www.ihk-gfi.de/");

            Pobject.getKarriereLink();
            Pobject.getFestanstellung();
            Pobject.getDualesLi();
            Pobject.getStudentMa();
            Pobject.getInitialBewerbung();



        }

}