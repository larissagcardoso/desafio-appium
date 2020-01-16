package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FixturesTests extends TestBaseAndroid {

    FixturesPage fixturesPage;
    StartPage startPage;
    MenuPage menuPage;

    @Test(priority = 1, description = "Verificar status NFC")
    public void verificarStatusNFC() {

        String status = "true|false";

        fixturesPage = new FixturesPage();
        startPage = new StartPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturesPage.getStatusNFC().matches(status));

    }

    @Test(priority = 1, description = "Verificar status Bluetooth")
    public void verificarStatusBlutooth() {

        String status = "true|false";

        fixturesPage = new FixturesPage();
        startPage = new StartPage();
        menuPage = new MenuPage();


        startPage.clickMenu();
        menuPage.clickFixtures();

        Assert.assertTrue(fixturesPage.getBluetooth().matches(status));

    }

    @Test(priority = 1, description = "Verificar status WiFi")
    public void verificarStatusWiFi() {

        String status = "true|false";
        fixturesPage = new FixturesPage();
        startPage = new StartPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickFixtures();

        Assert.assertTrue(fixturesPage.getWiFi().matches(status));

    }

    @Test(priority = 1, description = "Verificar status Gps")
    public void verificarStatusGps() {

        String status = "true|false";

        fixturesPage = new FixturesPage();
        startPage = new StartPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickFixtures();
        Assert.assertTrue(fixturesPage.getStatusGps().matches(status));

    }
}
