package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.pages.CrashPage;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrashTests extends TestBaseAndroid {
    CrashPage crashPage;
    StartPage startPage;
    MenuPage menuPage;
    HomePage homePage;

    @Test(priority = 1, description = "Verificar alerta após clicar no botão Crash")
    public void verificarAlertCrash() {

        crashPage = new CrashPage();
        startPage = new StartPage();
        menuPage = new MenuPage();


        startPage.clickMenu();
        menuPage.clickCrashBugBtn();
        crashPage.clickButtonCrash();
        Assert.assertEquals("ReferenceApp keeps stopping",crashPage.getTextAlertCrash());

    }

    @Test(priority = 1, description = "Reabrir app pelo Alert Crash")
    public void reabrirAppAlertCrash() {

        crashPage = new CrashPage();
        startPage = new StartPage();
        menuPage = new MenuPage();
        homePage = new HomePage();

        startPage.clickMenu();
        menuPage.clickCrashBugBtn();
        crashPage.clickButtonCrash();
        crashPage.clickButtonCrashAlert();
        Assert.assertEquals("AWS Device Farm Sample App for Android",homePage.getTextHome());

    }

}
