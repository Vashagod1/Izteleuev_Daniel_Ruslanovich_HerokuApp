package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TablesPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final String url =
            "http://the-internet.herokuapp.com/tables";

    public TablesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
    }

    public String getCell(int row, int column) {

        By cell = By.xpath(
                "//table[1]//tr[" + row + "]//td[" + column + "]"
        );

        return driver.findElement(cell).getText();
    }
}