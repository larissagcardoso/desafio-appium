package com.templateJavaAppium.flows;
import com.templateJavaAppium.pages.LoginPage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.StartPage;

public class LoginFlows {
    private LoginPage loginPage;
    private StartPage startPage;
    private MenuPage menuPage;

    public LoginFlows(){
        startPage = new StartPage();
        menuPage = new MenuPage();
        loginPage = new LoginPage();
    }
    public void goToLoginPage()
    {
        startPage.clickMenu();
        menuPage.clickLoginPage();
    }
    public String login(String username, String password)
    {
        loginPage.usernameFill(username);
        loginPage.passwordFill(password);
        loginPage.clickLoginBtn();
        return loginPage.getMessageText();
    }
}
