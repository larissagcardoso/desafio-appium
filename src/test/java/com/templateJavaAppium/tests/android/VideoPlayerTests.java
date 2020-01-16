package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusNativeComponentsFlows;
import com.templateJavaAppium.pages.StartPage;
import com.templateJavaAppium.pages.VideoPlayerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VideoPlayerTests extends TestBaseAndroid {


    VideoPlayerPage videoPlayerPage;
    StartPage startPage;
    SubMenusNativeComponentsFlows subMenusNativeComponentsFlows;

    @Test(priority = 1, description = "Verificar video presente na tela")
    public void visualizarVideo() {

        videoPlayerPage = new VideoPlayerPage();
        startPage = new StartPage();
        subMenusNativeComponentsFlows = new SubMenusNativeComponentsFlows();

        startPage.clickMenu();
        subMenusNativeComponentsFlows.subMenuVideoPlayer();

        Assert.assertTrue(videoPlayerPage.videoIsDisplayed());

    }


}
