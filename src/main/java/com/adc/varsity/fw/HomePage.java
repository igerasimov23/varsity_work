package com.adc.varsity.fw;


import org.openqa.selenium.By;

public class HomePage  extends HelperBase{
    public HomePage(ApplicationManager manager) {
        super(manager);
    }

    public void get(){
        String text = driver.findElement(By.cssSelector(".menu-button")).getText();
        System.out.println(text);
    }




}
