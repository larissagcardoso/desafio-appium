package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentOutViewTests extends TestBaseIOS {

    ContentOutViewPage contentOutViewPage;
    MenuPage menuPage;
    NativeComponentsPage nativeComponentsPage;

    @Test(priority = 1, description = "Verifica texto escondido na tela")
    public void visualizarTextoEscondido() {

        contentOutViewPage = new ContentOutViewPage();
        menuPage = new MenuPage();
        nativeComponentsPage = new NativeComponentsPage();

        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuContentOutView();
        contentOutViewPage.scrollDownIos();
        contentOutViewPage.scrollDownIos();

        Assert.assertTrue(contentOutViewPage.hiddenTextIsDisplayed());

    }

}
