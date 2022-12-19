package session;

import browser.FactoryBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.GetProperties;

public class Session {
    /**
     * It guarantees that the session is unique
     */
    private static Session instance = null;
    private WebDriver browser;

    public WebElement link;
    //browser = FactoryBrowser.make("headless").create();

    private Session() {
        //browser = FactoryBrowser.make("headless").create();
        browser = FactoryBrowser.make(GetProperties.getInstance().getBrowser()).create();
    }

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public void closeSession() {
        browser.quit();
        instance = null;
    }
    public WebDriver getBrowser() {
        return browser;
    }

    public void leftClick(String listName) {
        link = browser.findElement(By.xpath("//p[text()='"+listName+"']"));
    }

    // iframes
    // types
    // alerts which are not from the web page
}
