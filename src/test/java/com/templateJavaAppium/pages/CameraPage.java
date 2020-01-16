package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CameraPage extends PageBase {

   //@AndroidFindBy(accessibility = "Camera Preview Streaming")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/camera_surface_view")
    private MobileElement cameraView;

    public boolean cameraIsDisplayed() {
        return returnIfElementIsDisplayed(cameraView);
    }

    public void waitCamera(){
        waitForElement(cameraView);
    }

}
