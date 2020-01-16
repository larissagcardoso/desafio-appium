package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ContentOutViewPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/out_of_content_frame")
    private MobileElement frame;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceId(\"com.amazonaws.devicefarm.android.referenceapp:id/out_of_content_scrollView\")).scrollIntoView(new UiSelector().text(\"This is hidden text\"))")
    @iOSFindBy(accessibility = "This is hidden text")
    private MobileElement hiddenText;

    public boolean frameIsDisplayed() {
        return returnIfElementIsDisplayed(frame);
    }

    public boolean hiddenTextIsDisplayed() {
        return returnIfElementIsDisplayed(hiddenText);
    }

    public void waitFrameCarregar(){
        waitForElement(frame);
    }

    public void scrollDownIos(){
        scrolling("down");
    }

}
