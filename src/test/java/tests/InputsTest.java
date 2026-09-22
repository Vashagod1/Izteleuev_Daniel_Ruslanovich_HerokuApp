package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTest extends TestBase {

    @Test
    public void inputsTest() {

        InputsPage page = new InputsPage(driver);

        page.open();

        page.enterValue("123");
        Assert.assertEquals(page.getValue(), "123");

        page.clearInput();

        // Проверяем, что буквы не вводятся
        page.enterValue("abc");
        Assert.assertEquals(page.getValue(), "");
    }

    @Test
    public void arrowKeysTest() {

        InputsPage page = new InputsPage(driver);

        page.open();

        page.enterValue("5");

        page.pressArrowUp();

        Assert.assertEquals(page.getValue(), "6");

        page.pressArrowDown();

        Assert.assertEquals(page.getValue(), "5");
    }
}