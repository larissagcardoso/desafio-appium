package com.templateJavaAppium.tests.ios;


import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.pages.ImageCollectionPage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.NativeComponentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImageCollectionTests extends TestBaseIOS {

    MenuPage menuPage;
    ImageCollectionPage imageCollectionPage;
    NativeComponentsPage nativeComponentsPage;


    @Test(priority = 1, description = "Verificar imagem presente no Display")
    public void checkIImageGalleryDisplayed() {

        menuPage = new MenuPage();
        imageCollectionPage = new ImageCollectionPage();
        nativeComponentsPage = new NativeComponentsPage();

        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuImgCollection();

        imageCollectionPage.imageGalleryIsDisplayed();
        Assert.assertTrue(imageCollectionPage.imageGalleryIsDisplayed());
    }
}
