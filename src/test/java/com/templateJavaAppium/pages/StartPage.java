package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class StartPage extends PageBase {


    @iOSFindBy(xpath= "//XCUIElementTypeButton[@name='More']")
    @AndroidFindBy(accessibility = "ReferenceApp")
    private MobileElement menu;

    public void clickMenu()
    {
        click(menu);
    }
}
