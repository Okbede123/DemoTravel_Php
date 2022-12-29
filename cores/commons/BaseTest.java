package src2.cores.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public enum switchBrowser{
        CHROME,FIREFOX,EDGE;
    }


    static WebDriver driver;

    public static String nameBrowser;

    public static WebDriver chooseBrowser(String browser){
        if(browser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equals("edge")){
            driver = new EdgeDriver();
        }
        else {
            throw new RuntimeException("chua ho tro cac browser khac");
        }
        nameBrowser = browser;
        System.out.println("ten bay h " + nameBrowser);
        return driver;
    }

    public WebDriver chooseBrowserEnum(switchBrowser browser){
            switch (browser){
                case EDGE:{
                    driver = new EdgeDriver();
                    break;
                }
                case CHROME:{
                    driver = new ChromeDriver();
                    break;
                }
                case FIREFOX:{
                    driver = new FirefoxDriver();
                    break;
                }
            }
        return driver;
    }

    public String getnameBrowser(){
        System.out.println("name browser o getname base test " + nameBrowser);
        return nameBrowser;
    }


    public void waitTime(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
