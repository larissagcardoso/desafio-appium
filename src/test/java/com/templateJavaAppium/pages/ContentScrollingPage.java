package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ContentScrollingPage extends PageBase {

    @AndroidFindBy(className = "android.widget.ScrollView")
    @iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Scrolling View\"]")
    private MobileElement scrollView;

    public void scrollDownAndroid(){
        scroll(0.9,0.1);
    }

    public void scrollDownIos(){
        scrolling("down");
    }

    public boolean scrollViewDisplayed(){
        return returnIfElementIsDisplayed(scrollView);
    }

    public  void waitScrollDisplayed(){
        waitForElement(scrollView);
    }

}
