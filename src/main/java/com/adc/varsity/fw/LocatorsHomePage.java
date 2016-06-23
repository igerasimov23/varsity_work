package com.adc.varsity.fw;


public class LocatorsHomePage {


    // Main Menu
    public static String OUR_SHOWS = "//*[@id='navigation_btn0']";
    public static String GAME_REPLAYS = "//*[@id='navigation_btn1']";
    public static String MY_SCHOOLS_MAIN_MENU = "//*[@id='navigation_btn2']";
    public static String MY_FAVORITES = "//*[@id='navigation_btn3']";
    public static String MY_FAVORITES_TXT = "//*[contains(text(), 'MY FAVORITES')]";
    public static String MENU_ITEMS_LIST = "//*[contains(@id, 'navigation_btn')]";

    // our shows
    public static String LIST_OF_SHOWS = "#list-col-1_btn0";
    public static String LIST_OF_DATES = "#categories-videolist_btn0";



    //My favorites

    public static String MY_SCHOOLS = "//*[@id='btn-my-schools']";
    public static String VIDEOS = "//*[@id='btn-videos']";

    public static String NAME_OF_SCHOOLS = "//*[@class='fav-school-name ng-binding']";


    //My schools

    public static String SCORES = "//*[@id='btn-myschools-scores']";

    public static String BTN_OK = "//*[@id='btn-ok']";
    public static String MESSAGE_NO_SCHOOLS = "//*[@id='mySchoolsModal']//p";
    public static String ADD_SCHOOL_0 = "#btn-add-school0";
    public static String ADD_SCHOOL_1 = "#btn-add-school1";
    public static String SCHOOL_REGION_0 = "#addschoolselectregion-videolist_btn0";
    public static String SCHOOL_LIST_0 = "#list-col-1_btn0";
    public static String SCHOOL_LIST_1 = "#list-col-1_btn1";


    // Video Player

    public static String CURRENT_TIME = "//*[@class='ng-binding ng-scope']";
    public static String FULL_SCREEN = "//*[@class='iconButton enter']";
    public static String BACK_BTN = "//*[@class='btn btn-main-nav previous-menu']";
    public static String BACK_TXT = "//*[text()='BACK']";
    public static String REPLAY_TXT = "//*[text()='REPLAY']";
    public static String FAVORITE_TXT = "//*[text()='FAVORITE']";
    public static String FAVORITE_BTN = "//*[@id='add-favorite']";
    public static String FAVORITE_REMOVE_BTN = "//*[@id='remove-favorite']";
    public static String REPLAY = "//*[@class='btn btn-main-nav replay-video']";





    private LocatorsHomePage(){
    }

}
