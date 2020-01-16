package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CheckBoxPage extends PageBase {

    @iOSFindBy(xpath = "//android.widget.TextView[@text='Login Page']")
    @AndroidFindBy (id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox")
    private MobileElement checkBox;


    @iOSFindBy(xpath = "//android.widget.TextView[@text='Login Page']")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_checkbox_status")
    private MobileElement display;

    public void clickCheckBox() {
        click(checkBox);
    }

    public String getCheckBoxDisplay(){
        return getText(display);
    }
}
