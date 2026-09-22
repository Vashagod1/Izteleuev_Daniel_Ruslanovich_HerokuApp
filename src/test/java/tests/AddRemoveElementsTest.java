package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementsPage;


public class AddRemoveElementsTest extends TestBase {

    @Test
    public void addTwoElements() {

        AddRemoveElementsPage page = new AddRemoveElementsPage(driver);
        page.open();

        page.addElement();
        page.addElement();

        Assert.assertEquals(page.getDeleteButtonsCount(), 2);
        int count = page.getDeleteButtonsCount();
        System.out.println("Количество удалённых: " + count);
    }
}