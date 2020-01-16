package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NativeComponentsPage extends PageBase {

    @AndroidFindBy(xpath = "//*[@text='Image Collection']")
    @iOSFindBy(accessibility = "Image Gallery")
    private MobileElement imgCollection;

    @AndroidFindBy(xpath = "//*[@text='Content Scrolling']")
    @iOSFindBy (accessibility = "Scrolling View" )
    private MobileElement contentScrolling;

    @AndroidFindBy(xpath = "//*[@text='Video Player']")
    @iOSFindBy (accessibility = "Video Player")
    private MobileElement videoPlayer;

    @AndroidFindBy(xpath = "//*[@text='Camera']")
    @iOSFindBy (accessibility =  "Camera")
    private MobileElement camera;

    @AndroidFindBy(xpath = "//*[@text='Content Out of View']")
    @iOSFindBy (accessibility = "Out of View Component")
    private MobileElement contentOutView;

    public  void clickSubMenuImgCollection() {
        click(imgCollection);
    }

    public  void clickSubMenuContentScrolling() {
        click(contentScrolling);
    }

    public void clickSubMenuVideoPlayer() {
        click(videoPlayer);
    }

    public  void clickSubMenuCamera() {
        click(camera);
    }

    public  void clickSubMenuContentOutView() {
        click(contentOutView);
    }


}
