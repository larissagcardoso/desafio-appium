package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PullRefreshTimePage extends PageBase {

    @AndroidFindBy(className = "android.widget.ScrollView")
    private MobileElement scrollView;

    @iOSFindBy(xpath= "//XCUIElementTypeStaticText")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/input_refresh_display")
    private MobileElement display;

    public void pullToRefresh() {
        scroll(0.2, 0.9);
    }

    public String getDisplayText(){
        return display.getText();
    }

    public void pullToRefreshIos(){
        scrolling("down");
    }

}
