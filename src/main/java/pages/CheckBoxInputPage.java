package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckBoxInputPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final String url = "http://the-internet.herokuapp.com/checkboxes";

    private final By checkBox = By.cssSelector("input[type='checkbox']");

    public CheckBoxInputPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
    }

    public boolean isFirstCheckBoxChecked () {
        return driver.findElements(checkBox).get(0).isSelected();
    }

    public void clickFirstBox() {
        wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
    }

    public boolean isSecondCheckBoxChecked () {
        return driver.findElements(checkBox).get(1).isSelected();
    }

    public void clickSecondBox() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(checkBox));
        driver.findElements(checkBox).get(1).click();
    }


}
