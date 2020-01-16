package com.templateJavaAppium.pages;
import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage extends PageBase
{
    @iOSFindBy(xpath= "//XCUIElementTypeTextField[@value='Username']")
    @AndroidFindBy(accessibility= "Username Input Field")
    private MobileElement usernameField;


    @iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Password']")
    @AndroidFindBy(accessibility = "Password Input Field")
    private MobileElement passwordField;

    @iOSFindBy(accessibility = "Login")
    @AndroidFindBy(accessibility = "Login Button")
    private MobileElement loginBtn;

    @iOSFindBy(xpath = "(//XCUIElementTypeStaticText)[1]")
    @AndroidFindBy(accessibility = "Alt Message")
    private MobileElement message;

    public void usernameFill(String username)
    {
        sendKeys(usernameField,username);
    }
    public void passwordFill(String password)
    {
        sendKeys(passwordField,password);
    }
    public void clickLoginBtn()
    {
        click(loginBtn);
    }
    public String getMessageText()
    {
        return message.getText();
    }
}
