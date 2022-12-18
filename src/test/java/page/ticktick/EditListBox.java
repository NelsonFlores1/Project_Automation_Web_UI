package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EditListBox {
    /*edit list box
    list name textbox
    save button*/

    public TextBox listName = new TextBox(By.id("edit-project-name"));
    public Button saveButton = new Button(By.xpath("//button[text()='Save']"));
    public TextBox editListName = new TextBox(By.id("edit-project-name"));
}
