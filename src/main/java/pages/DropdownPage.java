package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropdownPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final String url =
            "http://the-internet.herokuapp.com/dropdown";

    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get(url);
    }

    public List<String> getAllOptions() {
        Select select = new Select(driver.findElement(dropdown));

        return select.getOptions()
                .stream()
                .map(option -> option.getText())
                .toList();
    }

    public void selectOption1() {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByValue("1");
    }

    public void selectOption2() {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByValue("2");
    }

    public boolean isOption1Selected() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption()
                .getAttribute("value")
                .equals("1");
    }

    public boolean isOption2Selected() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption()
                .getAttribute("value")
                .equals("2");
    }
}