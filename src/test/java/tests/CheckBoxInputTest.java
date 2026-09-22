package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxInputPage;

public class CheckBoxInputTest extends TestBase {

    @Test
    public void checkBoxCheck ()  {
        CheckBoxInputPage page = new CheckBoxInputPage(driver);
        page.open();

        Assert.assertFalse(page.isFirstCheckBoxChecked());
        page.clickFirstBox();
        Assert.assertTrue(page.isFirstCheckBoxChecked());


        Assert.assertTrue(page.isSecondCheckBoxChecked());
        page.clickSecondBox();
        Assert.assertFalse(page.isSecondCheckBoxChecked());
    }

}
