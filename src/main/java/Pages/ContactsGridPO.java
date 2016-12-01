package Pages;

import org.openqa.selenium.By;

import static Utils.DriverUtil.getDriver;


public class ContactsGridPO {
    private By addContactButton = By.xpath(".//button[@aria-label=\"Add contact\"]");
    private By settings = By.xpath(".//button[@aria-label=\"Settings\"]");

    public void open(){
        getDriver().get("http://ft-alexander-golovko.cl.dreamfactory.com/files/AddressBookForAngularJS/add_angular/index.html#/contacts");
    }

    public void addNewContact(){
        getDriver().findElement(addContactButton).click();
    }

    public void openSettings(){
        getDriver().findElement(settings).click();
    }
}
