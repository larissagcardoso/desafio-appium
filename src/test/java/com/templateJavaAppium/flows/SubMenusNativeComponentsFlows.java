package com.templateJavaAppium.flows;

import com.templateJavaAppium.pages.*;

public class SubMenusNativeComponentsFlows {

    private MenuPage menuPage;
    private NativeComponentsPage nativeComponentsPage;
    private CameraPage cameraPage;
    private ContentOutViewPage contentOutViewPage;
    private ContentScrollingPage contentScrollingPage;
    private  ImageCollectionPage imageCollectionPage;

    public SubMenusNativeComponentsFlows (){

        menuPage = new MenuPage();
        nativeComponentsPage = new NativeComponentsPage();
        cameraPage = new CameraPage();
        contentOutViewPage = new ContentOutViewPage();
        contentScrollingPage = new ContentScrollingPage();
        imageCollectionPage = new ImageCollectionPage();
    }

    public  void subMenuImgCollection() {
        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuImgCollection();
        imageCollectionPage.waitImagemCarregar();

    }

    public  void subMenuContentScrolling() {
        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuImgCollection();
        nativeComponentsPage.clickSubMenuContentScrolling();
        contentScrollingPage.waitScrollDisplayed();
    }

    public  void subMenuVideoPlayer() {
        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuImgCollection();
        nativeComponentsPage.clickSubMenuContentScrolling();
        nativeComponentsPage.clickSubMenuVideoPlayer();

    }

    public  void subMenuCamera() {
        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuImgCollection();
        nativeComponentsPage.clickSubMenuContentScrolling();
        nativeComponentsPage.clickSubMenuVideoPlayer();
        nativeComponentsPage.clickSubMenuCamera();
        cameraPage.waitCamera();

    }

    public  void subMenuContentOutView() {
        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuImgCollection();
        nativeComponentsPage.clickSubMenuContentScrolling();
        nativeComponentsPage.clickSubMenuVideoPlayer();
        nativeComponentsPage.clickSubMenuCamera();
        nativeComponentsPage.clickSubMenuContentOutView();
        contentOutViewPage.waitFrameCarregar();



    }
}
