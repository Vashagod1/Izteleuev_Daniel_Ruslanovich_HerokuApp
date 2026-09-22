package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTest extends TestBase {

    @Test
    public void hoverOverProfiles() {

        HoversPage page = new HoversPage(driver);

        page.open();

        // Первый профиль
        page.hoverOverProfile(0);

        Assert.assertEquals(page.getProfileName(0),"name: user1");

        page.clickProfileLink(0);

        Assert.assertFalse(page.getCurrentUrl().contains("404"));

        // Возвращаемся на страницу Hovers
        page.open();

        // Второй профиль
        page.hoverOverProfile(1);

        Assert.assertEquals(page.getProfileName(1),"name: user2");

        page.clickProfileLink(1);

        Assert.assertFalse(page.getCurrentUrl().contains("404"));

        page.open();

        // Третий профиль
        page.hoverOverProfile(2);

        Assert.assertEquals(page.getProfileName(2),"name: user3");

        page.clickProfileLink(2);

        Assert.assertFalse(page.getCurrentUrl().contains("404"));
    }
}