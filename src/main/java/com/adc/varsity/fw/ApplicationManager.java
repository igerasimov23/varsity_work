package com.adc.varsity.fw;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public HelperBase helperBase;
    public HomePage homePage;
    public Navigation navigation;
    public WebDriver driver;



    public ApplicationManager() throws MalformedURLException, InterruptedException {

        String baseUrl = "http://emvm06.emedia.cv.net:8080/gamereplays";

//        System.setProperty("webdriver.chrome.driver","c:/IdeaProjects/MSGVarsity/chromedriver.exe");
        driver =  new ChromeDriver();

//        System.setProperty("webdriver.chrome.driver","c:/IdeaProjects/MSGVarsity/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=C:/Users/Dell/AppData/Local/Google/Chrome/User Data/");
//        options.addArguments("--start-maximized");
//        driver = new ChromeDriver(options);

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--user-data-dir=C:/Users/Dell/AppData/Local/Google/Chrome/User Data/Default");
//        driver = new ChromeDriver(options);





        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.wait(2000);
//        Thread.sleep(3000);
//        driver.get(baseUrl);
        driver.manage().window().maximize();
//        driver.get(baseUrl);


        //helpers initialization
        helperBase = new HelperBase(this);
        homePage = new HomePage(this);
        navigation = new Navigation(this);




    }





}
