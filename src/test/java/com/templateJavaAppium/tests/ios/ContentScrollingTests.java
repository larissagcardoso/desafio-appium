package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.pages.ContentScrollingPage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.NativeComponentsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentScrollingTests extends TestBaseIOS {

    ContentScrollingPage contentScrollingPage;
    MenuPage menuPage;
    NativeComponentsPage nativeComponentsPage;


    @Test(priority = 1, description = "realizar sroll e verificar se está presente na tela")
    public void realizarScroll() {

        menuPage = new MenuPage();
        contentScrollingPage = new ContentScrollingPage();
        nativeComponentsPage = new NativeComponentsPage();


        menuPage.clickNativeComponets();
        nativeComponentsPage.clickSubMenuContentScrolling();
        contentScrollingPage.scrollDownIos();

        Assert.assertTrue(contentScrollingPage.scrollViewDisplayed());
    }
}
