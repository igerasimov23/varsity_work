import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.adc.varsity.fw.LocatorsHomePage.*;

public class CheckVideoPlayer extends Base {


    @Test
    public void videoPlayerButtonsCheck() throws InterruptedException {
        app.navigation.keyEnterBY(By.xpath(OUR_SHOWS));
        app.navigation.keyEnterBY(By.cssSelector(LIST_OF_SHOWS));
        app.navigation.keyEnterBY(By.cssSelector(LIST_OF_DATES));
        Thread.sleep(3000);
        app.navigation.keyPAUSE_PLAY();

//        app.navigation.keyEnterBY(By.xpath(FULL_SCREEN));
//        System.out.println(app.helperBase.getTextFromElement(By.xpath(BACK_TXT)));
        app.navigation.keyFORWARD();
        Thread.sleep(1000);


        app.navigation.keyPAUSE_PLAY();

        app.navigation.keyEnterBY(By.xpath(FAVORITE_BTN));
        Thread.sleep(2000);

        app.navigation.keyEnterBY(By.xpath(FAVORITE_BTN));


        app.navigation.keyFORWARD();
        app.navigation.keyFORWARD();
        System.out.println(app.helperBase.getTextFromElement(By.xpath(CURRENT_TIME)));
//        app.navigation.keyFORWARD();/r
//        app.navigation.keyFORWARD();
//        app.navigation.keyFORWARD();
        Thread.sleep(5000);
//        app.navigation.keyFORWARD();
        app.navigation.keyPAUSE_PLAY();
        Thread.sleep(5000);
//        app.navigation.keyPAUSE_PLAY();
//        app.navigation.keyREWIND();
//        app.navigation.keyREWIND();
//        app.navigation.keyREWIND();
//        app.navigation.keyREWIND();
//        app.navigation.keyREWIND();


    }

    @Test
    public void testIfMainMenuVisibleAfterHidingIt() throws InterruptedException {
        app.navigation.keyRIGHT();
        System.out.println(app.helperBase.getTextFromElement(By.xpath(MY_FAVORITES)));
//        System.out.println(app.helperBase.getTextFromElement(By.xpath(MY_FAVORITES_TXT)));

//        app.navigation.keyEnterBY(By.xpath(MY_FAVORITES_TXT));


    }


    @Test
    public void clickingOnelements() throws InterruptedException {
        Thread.sleep(4000);
        app.navigation.click(By.xpath(GAME_REPLAYS));
        app.navigation.click(By.xpath(MY_SCHOOLS_MAIN_MENU));
        app.navigation.click(By.xpath(MY_FAVORITES));
        app.navigation.keyRIGHT();
//        app.homePage.isFocused();

    }


    @Test
    public void isOneElementSelectedOnly() {
        app.navigation.keyDOWN();
        app.navigation.keyDOWN();
        System.out.println(app.homePage.isOneElementFocused(By.xpath(MENU_ITEMS_LIST)));
    }

    @Test
    public void navigateToScores() throws InterruptedException {
        app.navigation.click(By.xpath(MY_SCHOOLS_MAIN_MENU));
        app.navigation.keyRIGHT();
        app.navigation.navigateTo(By.xpath(SCORES));
//        app.navigation.keyUP();
//        app.navigation.keyUP();
    }

}
