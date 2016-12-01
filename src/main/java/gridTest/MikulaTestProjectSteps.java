package gridTest;

import gridTest.Pages.ContactEditPagePO;
import gridTest.Pages.ContactsGridPO;
import gridTest.Pages.CreateGroupPage;
import gridTest.Pages.LeftPanelPO;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;


public class MikulaTestProjectSteps extends Steps {
    ContactsGridPO grid = new ContactsGridPO();
    ContactEditPagePO editContact = new ContactEditPagePO();
    LeftPanelPO panel = new LeftPanelPO();
    CreateGroupPage editGroup = new CreateGroupPage();

    @Given("user is on the contact grid page")
    public void openGridPage(){
        grid.open();
    }

    @When("user click on \"+\" button")
    public void addContact(){
        grid.addNewContact();
    }

    @Then("contact edit page is open")
    public void isOpened(){
        Assert.assertTrue(editContact.isPresent());
    }
}
