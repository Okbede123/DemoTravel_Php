package src2.actions.PageObject;

import src2.cores.commons.BasePage;
import org.openqa.selenium.WebDriver;

public class PageGeneralManager extends BasePage {
    //WebDriver driver;

    public PageGeneralManager(WebDriver driver) {
        super(driver);
    }

    public static LoginPageObject getLoginPageObject(WebDriver driver){
        return new LoginPageObject(driver);
    }

    public static DashBoardPageObject getToDashBoardPage(WebDriver driver){
        return new DashBoardPageObject(driver);
    }
}
