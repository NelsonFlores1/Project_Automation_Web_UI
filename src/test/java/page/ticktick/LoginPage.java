package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    /*username textbox → attribute
    password textbox → attribute
    sig in button*/

    public TextBox usernameTxtBox = new TextBox(By.id("emailOrPhone"));
    public TextBox passwordTxtBox = new TextBox(By.id("password"));
    public Button loginButton = new Button(By.className("button__3eXSs"));

}
