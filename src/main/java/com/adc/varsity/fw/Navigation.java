package com.adc.varsity.fw;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Navigation  extends HelperBase{
    public Navigation(ApplicationManager manager) {
        super(manager);
    }



    public void keyEnterBY(By locator){
        waitForElement(10,locator);
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public void keyEnter(){
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.ENTER).perform();
    }

    public void click(By locator) {
        waitForElement(10, locator);
        driver.findElement(locator).click();
    }

    public void navigateTo(By locator) {
        waitForElement(10, locator);
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.clickAndHold();
        actions.perform();
    }

    public void keyDOWN(){
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.ARROW_DOWN).perform();
    }

    public void keyUP(){
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.ARROW_UP).perform();
    }
    public void keyRIGHT() throws InterruptedException {
//        Thread.sleep(500);
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.ARROW_RIGHT).perform();
    }
    public void keyLEFT(){
        Actions actionObject = new Actions(driver);
        actionObject.sendKeys(Keys.ARROW_LEFT).perform();
    }


    // VIDEO PLAYER
    public void keyPAUSE_PLAY() throws InterruptedException {
        Actions action = new Actions(driver);
        action.sendKeys(String.valueOf('\u0050')).perform();
//        Thread.sleep(1000);
    }
    public void keyFORWARD() throws InterruptedException {
        Actions action = new Actions(driver);
        action.sendKeys(String.valueOf('\u0066')).perform();
        Thread.sleep(2000);
    }
    public void keyREWIND() throws InterruptedException {
        Actions action = new Actions(driver);
        action.sendKeys(String.valueOf('\u0072')).perform();
        Thread.sleep(2000);
    }



}
