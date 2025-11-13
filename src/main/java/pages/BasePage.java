package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public abstract class BasePage {
    static WebDriver driver;

    public static void setDriver(WebDriver wd) {
        driver = wd;
    }

    @FindBy(css = "div[class='error']")
    List<WebElement> listErrorElement;

    public boolean isTextInErrorPresent(String text){
        if (listErrorElement == null || listErrorElement.isEmpty())
            return false;
        for (WebElement element: listErrorElement){
            if (element.getText().contains(text))
                return true;
        }
        return false;

    }

    public boolean elementIsDisplayed(WebElement element){
        return element.isDisplayed();
    }
}