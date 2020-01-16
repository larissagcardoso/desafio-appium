package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FixturesPage extends PageBase {


    @AndroidFindBy(id= "com.amazonaws.devicefarm.android.referenceapp:id/nfc")
    private MobileElement textNfc;

    @AndroidFindBy(id= "com.amazonaws.devicefarm.android.referenceapp:id/gps")
    private MobileElement textGps;

    @AndroidFindBy(id= "com.amazonaws.devicefarm.android.referenceapp:id/bluetooth")
    private MobileElement textBluetooth;

    @AndroidFindBy(id= "com.amazonaws.devicefarm.android.referenceapp:id/wifi")
    private MobileElement textWiFi;

    public String getStatusNFC() {
        return getText(textNfc);

    }

    public String getStatusGps() {
        return getText(textGps);

    }

    public String getBluetooth() {
        return getText(textBluetooth);

    }

    public String getWiFi() {
        return getText(textWiFi);

    }

}
