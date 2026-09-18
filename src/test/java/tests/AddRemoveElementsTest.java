package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;


public class AddRemoveElementsTest extends TestBase {

    @Test
    public void addTwoElements() throws InterruptedException {

        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);

        page.addElement();
        page.addElement();

        Assert.assertEquals(page.getDeleteButtonsCount(), 2);

    }
}