package src2.actions.PageObject;

import org.openqa.selenium.WebDriver;
import src2.cores.commons.BasePage;
import src2.cores.commons.GlobalContants;
import src2.interfacesUI.LoginPageUI;

public class LoginPageObject extends BasePage {
        WebDriver driver;
    public LoginPageObject(WebDriver driver){
            super(driver);
            this.driver = driver;
    }

    public void getToUrlLoginPhpTravels(){
        getToUrl(GlobalContants.PHP_TRAVEL_URL_LOGIN);
    }

    public void getEmailAndPass(String email,String pass){
        sendKeysToLocator(LoginPageUI.EMAIL_LOCATOR,email);
        sendKeysToLocator(LoginPageUI.PASS_LOCATOR,pass);
    }

    public String getHolderEmail(String value){
        waitElementVisiblity(LoginPageUI.CHECK_EMAIL_LOCATOR);
        return getAtribute(LoginPageUI.CHECK_EMAIL_LOCATOR,value);
    }

    public String getHolderPass(String value){
        waitElementVisiblity(LoginPageUI.CHECK_PASS_LOCATOR);
        return getAtribute(LoginPageUI.CHECK_PASS_LOCATOR,value);
    }

    public void clickRemeberMe(){
        waitElementClick(LoginPageUI.CLICK_REMEMBER_ME_LOCATOR);
        clickToElement(LoginPageUI.CLICK_REMEMBER_ME_LOCATOR);
    }

    public boolean checkRemeberMeSelected(){
       return checkSelectedJs(LoginPageUI.ID_LOCATOR);
    }



    public DashBoardPageObject clickLogInDashBoard(){
        clickToElement(LoginPageUI.BUTTON_LOCATOR);
        return PageGeneralManager.getToDashBoardPage(driver);
    }

}
