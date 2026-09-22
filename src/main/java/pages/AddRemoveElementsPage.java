package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddRemoveElementsPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final String url = "http://the-internet.herokuapp.com/add_remove_elements/";

    private final By addButton = By.xpath("//button[text()='Add Element']");
    private final By deleteButton = By.xpath("//button[text()='Delete']");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
    }

    public void addElement() {
        wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(deleteButton).size();
    }
}