package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageObject {
    WebDriver driver;

    PageObject(WebDriver d) {
        driver = d;
    }

    By phone = By.id("phone");
    By phone2 = By.xpath("//*[@id=\"footer_navigation_contact\"]/div");
    By impressumLink = By.id("footer_imprint_item0");
    By datenschutzLink = By.id("footer_imprint_item1");
    By panelGf3 = By.xpath("//*[@id=\"gf-panel\"]/li[3]");
    By searchField = By.id("search-field");
    By searchButton=By.id("search-panel-submit");
    By searchHits=By.xpath("//*[text()=\'2 Treffer\']");
    By trefferLink=By.xpath("//*[@id=\"dummy-wrapper\"]/div/div[2]/div//a[contains(@href,'4370252')]");
    By karriereLink=By.id("gf-panel-item0");
    By festanstellungLi=By.xpath("//*[contains(text(),'Festanstellung')]");
    By dualesLi= By.xpath(" //*[contains(text(),'Duales Studium / Ausbildung')]");
    By initialBewerbungLi = By.xpath("//*[contains(text(),'Initiativbewerbung')]");
    By studentischeMitLi = By.xpath("//*[contains(text(),'Studentische Mitarbeiter')]");


    public String getPhone() {
        String e = driver.findElement(phone).getText();
        return e;
    }

    public String getPhone2() {
        String e2 = driver.findElement(phone2).getText();
        return e2;
    }

    public void getImpressumLink() {driver.findElement(impressumLink).click();}

    public void getDatenshutzLink() {driver.findElement(datenschutzLink).click();}

    public void getKarriereLink() {driver.findElement(karriereLink).click();}


    public String getTitle() {
        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    public String getPanelGf3() {
        String pGf3 = driver.findElement(panelGf3).getText();
        return pGf3;
    }

    public void getSearch() {driver.findElement(searchField).isDisplayed(); }

    public void setSearch(String stxt) {
        driver.findElement(searchField).sendKeys(stxt);
        driver.findElement(searchButton).click();
    }
    public void getSearchHits(){driver.findElement(searchHits).isDisplayed();}
    public void getLinkText()
    { driver.findElement(trefferLink).isDisplayed();

    }

    public void getFestanstellung() {
        driver.findElement(festanstellungLi).isDisplayed();

    }
    public void  getDualesLi() {
         driver.findElement(dualesLi).isDisplayed();

    }
    public void getInitialBewerbung() {
        driver.findElement(initialBewerbungLi).isDisplayed();

    }
    public void  getStudentMa() {
        driver.findElement(studentischeMitLi).isDisplayed();

    }


}
