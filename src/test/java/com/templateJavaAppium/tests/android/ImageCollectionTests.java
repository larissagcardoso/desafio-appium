package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusNativeComponentsFlows;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageCollectionTests extends TestBaseAndroid {

    SubMenusNativeComponentsFlows subMenusNativeComponentsFlows;
    ImageCollectionPage imageCollectionPage;
    StartPage startPage;


    @Test(priority = 1, description = "Verificar imagem presente no Display")
    public void checkIImageGalleryDisplayed() {

        startPage = new StartPage();
        imageCollectionPage = new ImageCollectionPage();
        subMenusNativeComponentsFlows = new SubMenusNativeComponentsFlows();

        startPage.clickMenu();
        subMenusNativeComponentsFlows.subMenuImgCollection();
        imageCollectionPage.imageGalleryIsDisplayed();
        Assert.assertTrue(imageCollectionPage.imageGalleryIsDisplayed());
    }
}
