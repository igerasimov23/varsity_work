package com.adc.varsity.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HelperBase {

    public WebDriver driver;

    public ApplicationManager manager;

    public HelperBase(ApplicationManager manager) {
        this.manager = manager;
        this.driver = manager.driver;
    }


    public void waitForElement(Integer time, By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    public void getTextFromElements(By locator) {
        waitForElement(10, locator);
        List<WebElement> list = driver.findElements(locator);
        for (WebElement el : list) {
            System.out.println(el.getText());
        }
    }

    public String getTextFromElement(By locator) {
        waitForElement(10, locator);
        String str = driver.findElement(locator).getText();
        return str;
    }

    public boolean isFocused(By locator){
        boolean el = driver.switchTo().activeElement().
                equals(driver.findElement(locator));
       return el;
    }


    public boolean isOneElementFocused(By locator){
        int number = 0;
        List<WebElement> elements = driver.findElements(locator);

        for (int i = 0; i < elements.size(); i ++) {
            if (driver.switchTo().activeElement().equals(elements.get(i))) {
               number += 1;
            }
        }
        return (number == 1) ? true : false;
    }

    public String returnURL(){
        return driver.getCurrentUrl();
    }





}
