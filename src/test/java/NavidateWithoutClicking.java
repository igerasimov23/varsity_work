import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.adc.varsity.fw.LocatorsHomePage.*;
import static com.adc.varsity.fw.LocatorsHomePage.SCHOOL_LIST_0;
import static com.adc.varsity.fw.LocatorsHomePage.SCHOOL_REGION_0;

public class NavidateWithoutClicking extends Base {

    @Test
    public void addSchool() throws InterruptedException {

        app.navigation.keyEnterBY(By.xpath(MY_SCHOOLS_MAIN_MENU));
        app.navigation.getTextFromElements(By.xpath(MESSAGE_NO_SCHOOLS));
        app.navigation.keyEnterBY(By.xpath(BTN_OK));

        //add school
        app.navigation.keyEnterBY(By.cssSelector(ADD_SCHOOL_0));
        app.navigation.keyEnterBY(By.cssSelector(SCHOOL_REGION_0));
        app.navigation.keyEnterBY(By.cssSelector(SCHOOL_LIST_0));

    }

    @Test(priority = 1)
    public void navigateToScores() throws InterruptedException {
        app.navigation.click(By.xpath(MY_FAVORITES));
        app.navigation.keyRIGHT();
        app.navigation.navigateTo(By.xpath(MY_SCHOOLS));
        Thread.sleep(3000);
        app.navigation.keyUP();
        Thread.sleep(3000);
        app.navigation.keyLEFT();
        Thread.sleep(3000);
        app.navigation.navigateTo(By.xpath(MY_SCHOOLS));
        app.navigation.navigateTo(By.xpath(VIDEOS));

    }
}
