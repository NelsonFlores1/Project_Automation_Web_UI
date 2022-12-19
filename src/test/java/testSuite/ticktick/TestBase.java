package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.interactions.Actions;
import page.ticktick.*;
import session.Session;
import util.GetProperties;

public class TestBase {
    EditListBox editListBox = new EditListBox();
    ListSection listSection = new ListSection();
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    MenuListSection menuListSection = new MenuListSection();
    MenuSection menuSection = new MenuSection();
    ConfirmationAlert confirmationAlert = new ConfirmationAlert();

    //right click
    Actions action = new Actions(Session.getInstance().getBrowser());

    // todo property
    String userName = GetProperties.getInstance().getUser();
    String password = GetProperties.getInstance().getPwd();

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
