package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;


public class ImageCollectionPage extends PageBase {

    @AndroidFindBy(className = "android.widget.GridView")
    @iOSFindBy (xpath = "//XCUIElementTypeOther[@name='Image Gallery']")
    private MobileElement imageGaleria;

    public boolean imageGalleryIsDisplayed() {
        return returnIfElementIsDisplayed(imageGaleria);
    }

    public void waitImagemCarregar(){
        waitForElement(imageGaleria);
    }
}
