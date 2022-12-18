package com.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;
import testSuite.ticktick.TestBase;

public class CRUDSeleniumTestCucumber extends TestBase {
    String listName = "automation";
    String addcharacterToUpdate = "updated";
    String nameUpdated =listName+addcharacterToUpdate;
    @When("Log in")
    @Test
    public void logIn() {
        mainPage.loginLabel.click();
        loginPage.usernameTxtBox.setText(userName);
        loginPage.passwordTxtBox.setText(password);
        loginPage.loginButton.click();

        menuSection.getList().explicitWaitControlIsClickable(); // explicit wait
    }

    @When("Verify if you are logged")
    @Test
    public void logOut() {
        Assertions.assertTrue(menuSection.userLoggedButton.isControlDisplayed(),"ERROR: The log in failed");
    }

    @When("Create a list")
    @Test
    public void createList() {
        listSection.addNewListButton.click();
        editListBox.listName.setText(listName);
        editListBox.saveButton.click();
    }

    @When("Verify if the list was created successfully")
    @Test
    public void verifyList(){
        Assertions.assertTrue(listSection.isListDisplayedInList(listName), "ERROR: the list was not created");
    }

    @When("Update the list")
    @Test
    public void updateList(){
        Session.getInstance().leftClick(nameUpdated);
        action.contextClick(Session.getInstance().link).perform();
        menuSection.DeleteButton().explicitWaitControlIsClickable(); // explicit wait
        menuListSection.deleteButton.click();
        confirmationAlert.confirmationAlert.click();
    }
    @When("Verify if the list was updated successfully")
    @Test
    public void verifyListUpdated(){
        Assertions.assertTrue(listSection.isListDisplayedInList(nameUpdated), "ERROR: the list was not updated");
    }

    @When("Delete the list")
    @Test
    public void deleteList(){
        Session.getInstance().leftClick(nameUpdated);
        action.contextClick(Session.getInstance().link).perform();
        menuSection.DeleteButton().explicitWaitControlIsClickable(); // explicit wait
        menuListSection.deleteButton.click();
        confirmationAlert.confirmationAlert.click();
    }

    @When("Verify if the list was deleted successfully")
    @Test
    public void verifyListDeleted(){
        Assertions.assertFalse(listSection.isListDisplayedInList(nameUpdated), "ERROR: the list was not deleted");
    }

}
