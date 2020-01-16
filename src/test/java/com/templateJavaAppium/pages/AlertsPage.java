package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AlertsPage extends PageBase
{
    @iOSFindBy(accessibility = "Modal")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/notifications_toast_button")
    private MobileElement btnToast;

    @iOSFindBy(accessibility = "Alert")
    @AndroidFindBy (xpath ="(//android.widget.Button[@text='ALERT'])" )
    private MobileElement AlertBtn ;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='This is an alert']")
    @AndroidFindBy(id = "android:id/message")
    private MobileElement messageAlert;

    @iOSFindBy(accessibility = "This is a modal view")
    private MobileElement messageAlertaModal;

    public void clickAlerta (){
     click(AlertBtn);
    }

    public void clickToast()
    {
        click(btnToast);
    }

    public String getMessageText() {
        return getText(messageAlert);
    }

    public String getMessageModal() {
        return getText(messageAlertaModal);
    }


}
