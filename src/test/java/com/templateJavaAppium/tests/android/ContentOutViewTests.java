package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusNativeComponentsFlows;
import com.templateJavaAppium.pages.ContentOutViewPage;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContentOutViewTests extends TestBaseAndroid {

    ContentOutViewPage contentOutViewPage;
    StartPage startPage;
    SubMenusNativeComponentsFlows subMenusNativeComponentsFlows;

    @Test(priority = 1, description = "Verifica Frame presente na tela")
    public void visualizarFrame() {

        contentOutViewPage = new ContentOutViewPage();
        startPage = new StartPage();
        subMenusNativeComponentsFlows = new SubMenusNativeComponentsFlows();

        startPage.clickMenu();
        subMenusNativeComponentsFlows.subMenuContentOutView();
        contentOutViewPage.waitFrameCarregar();

        Assert.assertTrue(contentOutViewPage.hiddenTextIsDisplayed());

    }

    @Test(priority = 1, description = "Visualiza texto escondido na tela")
    public void visualizarHiddenText() {

        contentOutViewPage = new ContentOutViewPage();
        startPage = new StartPage();
        subMenusNativeComponentsFlows = new SubMenusNativeComponentsFlows();

        startPage.clickMenu();
        subMenusNativeComponentsFlows.subMenuContentOutView();

        Assert.assertTrue(contentOutViewPage.hiddenTextIsDisplayed());

    }

}
