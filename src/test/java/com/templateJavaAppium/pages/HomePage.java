package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends PageBase {

    @AndroidFindBy(accessibility = "Homepage Headline")
    private MobileElement textHome;

    public String getTextHome(){
       return getText(textHome);
    }
}
