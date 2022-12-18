package page.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class MenuListSection {
    /*Menu project section
    edit button
    delete button*/
    public Button editButton = new Button(By.xpath("//div[13]/div/div/div[2]/ul/li[1]/a"));
    public Button deleteButton = new Button(By.xpath("//div[13]/div/div/div[2]/ul/li[6]/a"));
}
