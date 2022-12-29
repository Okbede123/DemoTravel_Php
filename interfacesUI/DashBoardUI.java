package interfacesUI;

public class DashBoardUI {
    public static final String WELCOMEUSER_LOCATOR = "xpath= //div[@class = 'section-heading']/h2[contains(text(),'Hi, ')]";
    public static final String LOGOUT_LOCATOR = "xpath=//a[contains(text(),'Logout') and @class = ' waves-effect']";

    public static final String WAIT_TO_LOGOUT_LOCATOR = "xpath=//div[@id = 'preloader' and @style = 'display: none;']";
}
