package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.pages.HttpPage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HttpTests extends TestBaseIOS {

    MenuPage menuPage;
    HttpPage httpPage;

    @Test(priority = 1, description = "Acessar site url valida")
    public void acessarUrlValida() {

        menuPage = new MenuPage();
        httpPage = new HttpPage();

        String urlValida = "https://www.globo.com";

        menuPage.clickHttp();
        httpPage.preencherCampoTexto(urlValida);
        httpPage.clickBtnGo();

        Assert.assertTrue(httpPage.verificaInputVoltar());
    }

    @Test(priority = 1, description = "Acessar site url vazia")
    public void acessarSiteVazio() {

        menuPage = new MenuPage();
        httpPage = new HttpPage();

        menuPage.clickHttp();
        httpPage.clickBtnGo();

        Assert.assertEquals("Faulty URL Entered", httpPage.getTextAlerta());
    }


    @Test(priority = 1, description = "Acessar site com url invalida")
    public void acessarUrlInvalida() {

        menuPage = new MenuPage();
        httpPage= new HttpPage();

        String url = "www.urlinvalida.com.br";

        menuPage.clickHttp();
        httpPage.preencherCampoTexto(url);
        httpPage.clickBtnGo();

        Assert.assertEquals("Faulty URL Entered", httpPage.getTextAlerta());
    }

}
