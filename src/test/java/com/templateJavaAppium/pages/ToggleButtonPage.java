package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ToggleButtonPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_switch")
    private MobileElement inputSwitch;

    @AndroidFindBy(accessibility = "OFF")
    private MobileElement displayOff;

    @AndroidFindBy(accessibility = "ON")
    private MobileElement displayOn;

    public  void clickInputSwitch () {
        click(inputSwitch);
    }

    public String getTextSwitch () {
        return getText(inputSwitch);
    }

    public boolean onDisplayIsDisplayed() {
        return returnIfElementIsDisplayed(displayOn);
    }

    public boolean offDisplayIsDisplayed() {
        return returnIfElementIsDisplayed(displayOff);
    }

}
