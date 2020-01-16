package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CrashPage extends PageBase {

    @AndroidFindBy(accessibility = "Crash Display")
    private MobileElement crashDisplay;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/crash_button")
    private MobileElement crashBtn;

    @AndroidFindBy(id = "android:id/alertTitle")
    private MobileElement crashMessageAtert;

    @AndroidFindBy(id = "android:id/aerr_restart")
    private MobileElement crashBtnAtert;

    public void clickButtonCrash () {
        click(crashBtn);
    }

    public void clickButtonCrashAlert () {
        click(crashBtnAtert);
    }

    public String getTextAlertCrash() {
        return getText(crashMessageAtert);
    }

    public String getTextDisplayCrash() {
        return getText(crashDisplay);
    }

}
