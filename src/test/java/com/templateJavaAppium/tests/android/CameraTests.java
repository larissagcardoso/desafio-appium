package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusNativeComponentsFlows;
import com.templateJavaAppium.pages.CameraPage;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CameraTests extends TestBaseAndroid {

    CameraPage cameraPage;
    StartPage startPage;
    SubMenusNativeComponentsFlows subMenusNativeComponentsFlows;

    @Test(priority = 1, description = "Verificar camera presente na tela")
    public void visualizarCamera() {

        cameraPage = new CameraPage();
        startPage = new StartPage();
        subMenusNativeComponentsFlows = new SubMenusNativeComponentsFlows();

        startPage.clickMenu();
        subMenusNativeComponentsFlows.subMenuCamera();

        Assert.assertTrue(cameraPage.cameraIsDisplayed());

    }

}
