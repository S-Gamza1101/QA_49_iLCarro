package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WDListener implements WebDriverListener {

    Logger logger = LoggerFactory.getLogger(WDListener.class);


    @Override
    public void afterGet(WebDriver driver, String url) {
        WebDriverListener.super.afterGet(driver, url);
        logger.info("open page {}", url);
    }

    @Override
    public void beforeFindElement(WebDriver driver, By locator) {
        WebDriverListener.super.beforeFindElement(driver, locator);
        logger.info("find element with locator  {}", locator);
    }

    @Override
    public void afterQuit(WebDriver driver) {
        WebDriverListener.super.afterQuit(driver);
        logger.info("browser quit");
    }

    @Override
    public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
        WebDriverListener.super.afterExecuteScript(driver, script, args, result);
        logger.info("execute JS script {}", script);
    }

    @Override
    public void afterClick(WebElement element) {
        WebDriverListener.super.afterClick(element);
        logger.info("after click to elment {}", element.getTagName());
    }

    @Override
    public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
        WebDriverListener.super.afterSendKeys(element, keysToSend);
        logger.info("use sendKeys to elment {} {}", element.getTagName(), keysToSend);
    }
}
