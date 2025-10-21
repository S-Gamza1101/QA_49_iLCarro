package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    static WebDriver driver;


    public boolean elementIsDisplayed(WebElement element){
        return element.isDisplayed();
    }
}
