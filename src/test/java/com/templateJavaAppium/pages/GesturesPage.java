package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class GesturesPage extends PageBase {

    @iOSFindBy(id= "com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_action_pad")
    @AndroidFindBy(id ="com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_action_pad")
    private MobileElement gestureBox;

    @iOSFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_content")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_gesture_content")
    private MobileElement display;

    public void singlePress() {
        tap(gestureBox);
    }

    public void longPress() {
        longPress(gestureBox);
    }

    public void flingGesture() {
        scroll(0.9,0.1);
    }

    public String getUltimaAcao(){
        String[] lista = display.getText().split("\n");
        return lista[lista.length - 1];
    }
}
