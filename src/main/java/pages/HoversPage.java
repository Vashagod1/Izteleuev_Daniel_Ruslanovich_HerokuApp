package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HoversPage {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;

    private final String url = "http://the-internet.herokuapp.com/hovers";

    private final By profiles =
            By.cssSelector(".figure");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
    }

    public void open() {
        driver.get(url);
    }

    public void hoverOverProfile(int number) {
        actions.moveToElement(driver.findElements(profiles)
                .get(number))
                .perform();
    }

    public String getProfileName(int number) {
        By name = By.cssSelector(".figure:nth-of-type("
                + (number + 1)
                + ") .figcaption h5");

        return wait.until(ExpectedConditions.visibilityOfElementLocated(name)).getText();
    }

    public void clickProfileLink(int number) {
        By link = By.cssSelector(".figure:nth-of-type("
                + (number + 1)
                + ") .figcaption a");

        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}