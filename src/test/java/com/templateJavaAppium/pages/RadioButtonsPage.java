package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RadioButtonsPage extends PageBase {


    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_1")
    private MobileElement radioButton1;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_2")
    private MobileElement radioButton2;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/radio_button_3")
    private MobileElement radioButton3;

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_radio_button_display")
    private MobileElement radioText;


    public String getRadioText() {
        return getText(radioText);
    }

    public void clickRadioButton1() {
        click(radioButton1);
    }

    public void clickRadioButton2() {
        click(radioButton2);
    }

    public void clickRadioButton3() {
        click(radioButton3);
    }
}
