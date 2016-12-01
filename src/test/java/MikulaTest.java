import Pages.ContactsGridPO;
import org.junit.After;
import org.junit.Test;

import static Utils.DriverUtil.getDriver;

public class MikulaTest {

    @Test
    public void siteTest(){
        ContactsGridPO grid = new ContactsGridPO();
        grid.open();
        grid.addNewContact();
    }

    @After
    public void postCondition(){
        getDriver().close();
    }
}
