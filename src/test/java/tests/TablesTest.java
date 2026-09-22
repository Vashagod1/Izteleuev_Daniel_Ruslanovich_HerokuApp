package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;

public class TablesTest extends TestBase {

    @Test
    public void checkTableCells() {

        TablesPage page = new TablesPage(driver);

        page.open();

        Assert.assertEquals(page.getCell(1, 1), "Smith");
        Assert.assertEquals(page.getCell(1, 2), "John");
        Assert.assertEquals(page.getCell(1, 3), "jsmith@gmail.com");

        Assert.assertEquals(page.getCell(2, 1), "Bach");
    }
}