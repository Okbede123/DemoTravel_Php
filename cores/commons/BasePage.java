package src2.cores.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends BaseTest {
    WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    @Override
    public String getnameBrowser() {
        return super.getnameBrowser();
    }

    public By getByLocator(String locator){
        By by = null;
        if(locator.startsWith("xpath") || locator.startsWith("Xpath") || locator.startsWith("XPATH")){
            by = By.xpath(locator.substring(6));
        }
        else if(locator.startsWith("css") || locator.startsWith("CSS") || locator.startsWith("Css")){
            by = By.cssSelector(locator.substring(4));
        }
        else if(locator.startsWith("id") || locator.startsWith("ID") || locator.startsWith("Id")){
            by = By.id(locator.substring(3));
        }
        else if(locator.startsWith("name") || locator.startsWith("NAME") || locator.startsWith("Name")){
            by = By.name(locator.substring(5));
        }
        else if(locator.startsWith("class") || locator.startsWith("Class") || locator.startsWith("CLASS")){
            by = By.className(locator.substring(6));
        }
        return by;
    }

    public void clickToElement(String locator){
        waitElementClick(locator);
        searchElement(locator).click();
    }

    public boolean isPageLoadSuccess(){
        return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete");
    }

    public void waitInvisiblity(String locator){
        new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.invisibilityOfElementLocated(getByLocator(locator)));
    }

    public void sendKeysToLocator(String locator,String value){
        waitElementClick(locator);
        searchElement(locator).sendKeys(value);
    }

    public boolean checkSelected(String locator){
        //waitElementClick(locator);
        return searchElement(locator).isSelected();
    }

    public boolean checkSelectedJs(String id){
        System.out.println("document.getElementById("+ id +").checked[0];");
        return (boolean) ((JavascriptExecutor)driver).executeScript("return document.getElementById("+ id +").checked;");
    }


    public void waitElementVisiblity(String locator){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(getByLocator(locator)));
    }

    public void waitElementClick(String locator){
        new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(getByLocator(locator)));
    }

    public String getTextElement(String locator){
        waitElementVisiblity(locator);
        return searchElement(locator).getText();
    }



    public String getAtribute(String locator,String value){
        waitElementVisiblity(locator);
        return searchElement(locator).getAttribute(value);
    }

    public boolean isDisplayElement(String locator){
        waitElementVisiblity(locator);
        return searchElement(locator).isDisplayed();
    }

    public void getToUrl(String url){
        driver.get(url);
    }

    public WebElement searchElement(String locator){
       return driver.findElement(getByLocator(locator));
    }
}
