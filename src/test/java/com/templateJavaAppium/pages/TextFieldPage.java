package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TextFieldPage extends PageBase {


    @iOSFindBy(xpath = "//XCUIElementTypeTextField")
    @AndroidFindBy(accessibility = "Text Input Control")
    private MobileElement inputEditText;

    public void infoTexto(String texto){
        sendKeys(inputEditText,texto);
    }

    public String verificarTexto(){
        return getText(inputEditText);
    }

}
