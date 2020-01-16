package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HttpPage extends PageBase {


    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name='navigation bar']")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_edit_text")
    private MobileElement campoUrl;

    @iOSFindBy(accessibility = "Go")
    private MobileElement goBtn;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Faulty URL Entered']")
    private MobileElement alelrt;


    @iOSFindBy(accessibility = "Input a website")
    private MobileElement inputWebSiteLabel;
    //XCUIElementTypeButton[@name="Input a website"]


    public void preencherCampoTexto(String texto)
    {
        sendKeys(campoUrl,texto);
    }

    public void clickBtnGo()
    {
        click(goBtn);
    }

    public String getTextAlerta() {
        return getText(alelrt);

    }

    public boolean verificaInputVoltar() {
        return returnIfElementIsDisplayed(inputWebSiteLabel);

    }
}
