package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusNativeComponentsFlows;
import com.templateJavaAppium.pages.ContentScrollingPage;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentScrollingTests extends TestBaseAndroid {

    ContentScrollingPage contentScrollingPage;
    StartPage startPage;
    SubMenusNativeComponentsFlows subMenusNativeComponentsFlows;

    @Test(priority = 1, description = "realizar sroll e verificar se está presente na tela")
    public void testScroll() {

        contentScrollingPage = new ContentScrollingPage();
        startPage = new StartPage();
        subMenusNativeComponentsFlows = new SubMenusNativeComponentsFlows();

        startPage.clickMenu ();
        subMenusNativeComponentsFlows.subMenuContentScrolling();
        contentScrollingPage.scrollDownAndroid();

        Assert.assertTrue(contentScrollingPage.scrollViewDisplayed());
    }
}
