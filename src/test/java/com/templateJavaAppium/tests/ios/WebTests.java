package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.pages.HomePage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.StartPage;
import com.templateJavaAppium.pages.WebPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTests extends TestBaseIOS {

    StartPage startPage;
    MenuPage menuPage;
    WebPage webPage;

    @Test(priority = 1, description = "entrar webview ")
    public void acessarWebview() {
        startPage = new StartPage();
        menuPage = new MenuPage();
        webPage = new WebPage();


        startPage.clickMenu();
        menuPage.clicklocalWebViewBtn();

        Assert.assertTrue(webPage.verificaTexto());
    }
}
