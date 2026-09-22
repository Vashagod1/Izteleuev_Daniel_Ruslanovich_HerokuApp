package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTest extends TestBase {

    @Test
    public void dropdownTest() {

        DropdownPage page = new DropdownPage(driver);

        page.open();

        List<String> options = page.getAllOptions();

        Assert.assertEquals(options.size(), 3);
        Assert.assertTrue(options.contains("Please select an option"));
        Assert.assertTrue(options.contains("Option 1"));
        Assert.assertTrue(options.contains("Option 2"));

        page.selectOption1();

        Assert.assertTrue(page.isOption1Selected());

        page.selectOption2();

        Assert.assertTrue(page.isOption2Selected());
    }
}