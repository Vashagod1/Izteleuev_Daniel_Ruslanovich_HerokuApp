package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagesPage;

public class NotificationMessagesTest extends TestBase {

    @Test
    public void checkNotificationMessage() {

        NotificationMessagesPage page = new NotificationMessagesPage(driver);

        page.open();

        page.clickNotificationLink();

        String message = page.getNotificationText();

        Assert.assertTrue(message.contains("Action successful")
                        || message.contains("Action unsuccesful"),
                "Неизвестное сообщение: " + message);
    }
}