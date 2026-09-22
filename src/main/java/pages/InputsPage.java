package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputsPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final String url =
            "http://the-internet.herokuapp.com/inputs";

    private final By input = By.tagName("input");

    public InputsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
    }

    public void enterValue(String value) {
        driver.findElement(input).sendKeys(value);
    }

    public String getValue() {
        return driver.findElement(input).getAttribute("value");
    }

    public void pressArrowUp() {
        driver.findElement(input).sendKeys(Keys.ARROW_UP);
    }

    public void pressArrowDown() {
        driver.findElement(input).sendKeys(Keys.ARROW_DOWN);
    }

    public void clearInput() {
        driver.findElement(input).clear();
    }
}