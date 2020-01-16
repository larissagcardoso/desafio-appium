package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.iOSFindBy;

public class WebPage extends PageBase {

    @iOSFindBy (xpath = "//XCUIElementTypeTextField[@name='Type search keywords']")
            //(xpath= "//XCUIElementTypeStaticText[@name='Welcome']")
    private MobileElement textDisplay;


    public boolean verificaTexto() {
      return returnIfElementIsDisplayed(textDisplay);
    }
}
