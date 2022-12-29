package src2.actions.PageObject;

import interfacesUI.DashBoardUI;
import org.openqa.selenium.WebDriver;
import src2.cores.commons.BasePage;

public class DashBoardPageObject extends BasePage {
    WebDriver driver;
    public DashBoardPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public boolean checkWelcomeUser(){
       return isDisplayElement(DashBoardUI.WELCOMEUSER_LOCATOR);
    }

    public LoginPageObject clickToLogOut(){
        if(getnameBrowser() == "firefox"){
            waitTime(1);
        }
        clickToElement(DashBoardUI.LOGOUT_LOCATOR);
        return PageGeneralManager.getLoginPageObject(driver);
    }
}
