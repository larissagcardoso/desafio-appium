package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusInputFlowsAndroid;
import com.templateJavaAppium.pages.StartPage;
import com.templateJavaAppium.pages.ToggleButtonPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToggleButtonTests extends TestBaseAndroid {

    ToggleButtonPage toggleButtonPage;
    StartPage startPage;
    SubMenusInputFlowsAndroid subMenusInputFlowsAndroid;

    @Test(priority = 1, description =  "Verificar switchOn")
    public void switchOn() {

        toggleButtonPage = new ToggleButtonPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuToggleButton();
        toggleButtonPage.clickInputSwitch();

        Assert.assertEquals( "ON",toggleButtonPage.getTextSwitch());

    }

    @Test(priority = 2, description =  "Verificar switchOff")
    public void switchOnDisplayOn() {

        toggleButtonPage = new ToggleButtonPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuToggleButton();
        toggleButtonPage.clickInputSwitch();

        Assert.assertTrue(toggleButtonPage.onDisplayIsDisplayed());

    }

    @Test(priority = 3, description =  "Verificar switchOn e a imagem correspondente ao switchOn")
    public void switchOff() {

        toggleButtonPage = new ToggleButtonPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuToggleButton();

        Assert.assertEquals("OFF",toggleButtonPage.getTextSwitch());

    }

    @Test(priority = 4, description =  "Verificar switchOfff e a imagem correspondente ao switchOff")
    public void switchOnDisplayOff() {

        toggleButtonPage = new ToggleButtonPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuToggleButton();

        Assert.assertTrue(toggleButtonPage.offDisplayIsDisplayed());

    }
}
