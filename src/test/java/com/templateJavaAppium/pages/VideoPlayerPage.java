package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VideoPlayerPage extends PageBase {

    @AndroidFindBy(accessibility = "Content Playing")
    private MobileElement videoView;


    public boolean videoIsDisplayed() {
        return returnIfElementIsDisplayed(videoView);
    }

}
