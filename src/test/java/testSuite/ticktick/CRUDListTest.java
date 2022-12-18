package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CRUDListTest extends TestBase{
    @Test
    public void verifyCRUDList() {
        String listName = "automation";
        String addcharacterToUpdate = "updated";
        String nameUpdated =listName+addcharacterToUpdate;


        // LOG IN
        mainPage.loginLabel.click();
        loginPage.usernameTxtBox.setText(userName);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();

        menuSection.getList().explicitWaitControlIsClickable(); // explicit wait
            // verification
        Assertions.assertTrue(menuSection.userLoggedButton.isControlDisplayed(),"ERROR: The log in failed");


        // CREATE LIST
        listSection.addNewListButton.click();
        editListBox.listName.setText(listName);
        editListBox.saveButton.click();
            // verification
        Assertions.assertTrue(listSection.isListDisplayedInList(listName), "ERROR: the list was not created");


        // EDIT LIST
        Session.getInstance().leftClick(listName);
        action.contextClick(Session.getInstance().link).perform();
        menuListSection.editButton.click();
        editListBox.listName.setText(addcharacterToUpdate);
        editListBox.saveButton.click();
            // verification
        Assertions.assertTrue(listSection.isListDisplayedInList(nameUpdated), "ERROR: the list was not updated");


        // DELETE LIST
        Session.getInstance().leftClick(nameUpdated);
        action.contextClick(Session.getInstance().link).perform();
        menuSection.DeleteButton().explicitWaitControlIsClickable(); // explicit wait
        menuListSection.deleteButton.click();
        confirmationAlert.confirmationAlert.click();
            // verification
        Assertions.assertFalse(listSection.isListDisplayedInList(nameUpdated), "ERROR: the list was not deleted");

    }


}
