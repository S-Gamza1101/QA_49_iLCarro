package ui_tests;

import dto.User;
import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends ApplicationManager {
    @Test
    public void loginPositiveTest(){
        User user = User.builder()
                .username("ivan18!q@gmail.com")
                .password("Password1234!")
                .build();
        new HomePage(getDriver()).clickBtnLoginHeader();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginForm(user);
        Assert.assertTrue(loginPage.isLoggedDisplayed());
    }

//username("ivan18!q@gmail.com")
//password("Password1234!")


    @Test
    public void loginNegativeTest_wrongPassword(){
        User user = User.builder()
                .username("ivan18!q@gmail.com")
                .password("wrong password")
                .build();
        new HomePage(getDriver()).clickBtnLoginHeader();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginForm(user);
        Assert.assertFalse(loginPage.isLoggedDisplayed());
    }


    @Test
    public void loginNegativeTest_wrongPasswordIncorrect(){
        User user = User.builder()
                .username("ivan18!q@gmail.com")
                .password("wrong password")
                .build();
        new HomePage(getDriver()).clickBtnLoginHeader();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeLoginForm(user);
        Assert.assertTrue(loginPage.isLoggedIncorrect());
    }

}
