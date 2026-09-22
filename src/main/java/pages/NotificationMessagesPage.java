package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NotificationMessagesPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final String url = "http://the-internet.herokuapp.com/notification_message";

    private final By clickHere = By.linkText("Click here");
    private final By notification = By.id("flash");

    public NotificationMessagesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
    }

    public void clickNotificationLink() {
        wait.until(ExpectedConditions.elementToBeClickable(clickHere)).click();
    }

    public String getNotificationText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(notification)).getText();
    }
}