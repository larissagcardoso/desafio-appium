package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.pages.CheckBoxPage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.NestedViewsPage;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedViewsTests extends TestBaseIOS {
    CheckBoxPage checkBoxPage;
    NestedViewsPage nestedViewsPage;
    MenuPage menuPage;
    StartPage startPage;

    @Test(priority = 1, description = "clicando botao Next uma vez")
    public void upNavigationFirst(){

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();

        Assert.assertEquals("This is the first view",nestedViewsPage.verificarCountLevel());
    }

    @Test(priority = 1, description =  "clicando botao Next duas vezes")
    public void upNavigationSecond(){

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();


        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();
        nestedViewsPage.clickNextButton(1);

        Assert.assertEquals("This is the second view",nestedViewsPage.verificarTxtSecond());

    }

    @Test(priority = 1, description =  "clicando botao next tres vezes")
    public void upNavigationThird(){

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();


        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();
        nestedViewsPage.clickNextButton(2);

        Assert.assertEquals("This is the third view",nestedViewsPage.verificarTxtThird());

    }

    @Test(priority = 1, description =  "clicando botao next quatro vezes")
    public void upNavigationFourth(){

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();


        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();
        nestedViewsPage.clickNextButton(3);

        Assert.assertEquals("This is the fourth view",nestedViewsPage.verificarTxtFourth());

    }

    }
