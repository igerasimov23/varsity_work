import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.adc.varsity.fw.LocatorsHomePage.*;
import static com.adc.varsity.fw.LocatorsHomePage.MY_SCHOOLS_MAIN_MENU;

public class Addingschools extends Base{



    @Test
    public void addSchool() throws InterruptedException {
//        Thread.sleep(2000);
//        app.navigation.keyEnterBY();
//        app.navigation.keyDOWN();


        app.navigation.keyEnterBY(By.xpath(MY_SCHOOLS_MAIN_MENU));
//        app.helperBase.waitForElement(5,By.xpath(MESSAGE_NO_SCHOOLS));
        app.navigation.getTextFromElements(By.xpath(MESSAGE_NO_SCHOOLS));
        app.navigation.keyEnterBY(By.xpath(BTN_OK));

        //add school
        app.navigation.keyEnterBY(By.cssSelector(ADD_SCHOOL_0));
        app.navigation.keyEnterBY(By.cssSelector(SCHOOL_REGION_0));
        app.navigation.keyEnterBY(By.cssSelector(SCHOOL_LIST_0));

        //add school
//        app.navigation.keyEnterBY(By.cssSelector(ADD_SCHOOL_1));
//        app.navigation.keyEnterBY(By.cssSelector(SCHOOL_REGION_0));
//        app.navigation.keyEnterBY(By.cssSelector(SCHOOL_LIST_1));

//        app.homePage.getTextFromElements(By.xpath(NAME_OF_SCHOOLS));
//
//        app.navigation.keyLEFT();
//
//
//        app.navigation.keyEnterBY(By.xpath(MY_FAVORITES));
//        app.navigation.keyEnterBY(By.xpath(MY_SCHOOLS));
//        app.homePage.getTextFromElements(By.xpath(NAME_OF_SCHOOLS));



    }



}
