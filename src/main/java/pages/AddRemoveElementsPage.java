package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage {
    private final WebDriver driver;

    private final By addButton = By.xpath("//button[text()='Add Element']");
    private final By deleteButton = By.xpath("//button[text()='Delete']");

    public AddRemoveElementsPage (WebDriver driver) {
        this.driver = driver;
    }

    public void addElement () throws InterruptedException {
        driver.findElement(addButton).click();
        Thread.sleep(1000);
    }

    public void deleteElement () {
        driver.findElement(deleteButton).click();
    }

    public int getDeleteButtonsCount () {
        return driver.findElements(deleteButton).size();
    }
}
