package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TyposPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final String url = "http://the-internet.herokuapp.com/typos";

    // Селектор для абзаца с опечаткой (второй <p> внутри div.example)
    private final By typoParagraph = By.cssSelector(".example p:nth-of-type(2)");

    public TyposPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
    }

    public String getTypoParagraphText() {
        return driver.findElement(typoParagraph).getText();
    }
}