package src2.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src2.actions.PageObject.DashBoardPageObject;
import src2.actions.PageObject.LoginPageObject;
import src2.actions.PageObject.PageGeneralManager;
import src2.cores.commons.BaseTest;

public class LoginLogOutPhpTravel extends BaseTest {
    WebDriver driver;
    LoginPageObject loginPageObject;
    DashBoardPageObject dashBoardPageObject;

    @BeforeClass
    public void BeforeClass(){
       driver = chooseBrowser("edge");
        loginPageObject = PageGeneralManager.getLoginPageObject(driver);
        loginPageObject.getToUrlLoginPhpTravels();
        driver.manage().window().maximize();

    }
    @Test
    public void TC_01_getDashBoard(){
        loginPageObject.getEmailAndPass("user@phptravels.com","demouser");
        dashBoardPageObject = loginPageObject.clickLogInDashBoard();
        Assert.assertTrue(dashBoardPageObject.checkWelcomeUser());
    }
    @Test
    public void TC_02_logOut(){
       loginPageObject = dashBoardPageObject.clickToLogOut();
       Assert.assertEquals(loginPageObject.getHolderEmail("placeholder"),"Email");
       Assert.assertEquals(loginPageObject.getHolderPass("placeholder"),"Password");
    }

    @Test
    public void TC_03_ClickRememberMe(){
        if(getnameBrowser() == "firefox"){
            waitTime(1);
        }
        loginPageObject.clickRemeberMe();
        Assert.assertTrue(loginPageObject.checkRemeberMeSelected());
    }

    @AfterClass
    public void AfterClass(){
        driver.quit();
    }
}
