package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.interactions.Actions;
import page.ticktick.*;
import session.Session;
import util.GetProperties;

public class TestBase {
    protected EditListBox editListBox = new EditListBox();
    protected ListSection listSection = new ListSection();
    protected LoginPage loginPage = new LoginPage();
    protected MainPage mainPage = new MainPage();
    protected MenuListSection menuListSection = new MenuListSection();
    protected MenuSection menuSection = new MenuSection();
    protected ConfirmationAlert confirmationAlert = new ConfirmationAlert();

    //right click
    protected Actions action = new Actions(Session.getInstance().getBrowser());

    // todo property
    protected String userName = GetProperties.getInstance().getUser();
    protected String password = GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        // todo create property file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }
    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }
}
