package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.GesturesFlows;
import com.templateJavaAppium.flows.SubMenusInputFlowsAndroid;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GesturesTests extends TestBaseAndroid {

    GesturesFlows gesturesFlows;
    StartPage startPage;
    SubMenusInputFlowsAndroid subMenusInputFlowsAndroid;


    @Test(priority = 1, description = "Verificar Ação Fling e conferir com Display")
    public void acaoFling() throws InterruptedException  {

        gesturesFlows = new GesturesFlows();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu ();
        subMenusInputFlowsAndroid.subMenuGestures();
        String ultimaMsgLista = gesturesFlows.realizarFling();

        Assert.assertEquals("Fling",ultimaMsgLista);

    }

    @Test(priority = 1, description = "Verificar Ação Long Press e conferir com Display")
    public void acaoLong()  {

        gesturesFlows = new GesturesFlows();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuGestures();
        String ultimaMsgLista = gesturesFlows.realizarLong();

        Assert.assertEquals("Long Press", ultimaMsgLista);

    }

    @Test(priority = 1, description = "Verificar Ação Tap e conferir com Display")
    public void acaoTap()  {

        gesturesFlows = new GesturesFlows();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuGestures();
        String ultimaMsgLista = gesturesFlows.realizarTap();

        Assert.assertEquals("Single tap confirmed", ultimaMsgLista);

    }
}
