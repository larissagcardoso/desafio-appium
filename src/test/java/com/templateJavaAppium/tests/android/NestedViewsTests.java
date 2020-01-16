package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.pages.*;
import com.templateJavaAppium.utils.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class NestedViewsTests extends TestBaseAndroid {
    CheckBoxPage checkBoxPage;
    NestedViewsPage nestedViewsPage;
    MenuPage menuPage;
    StartPage startPage;

    ExcelUtils excelUtils;

    @DataProvider(name = "Cliques")
    public Object[][] loginValidoXlsx() throws Exception {

        excelUtils = new ExcelUtils(System.getProperty("user.dir")+"\\src\\test\\java\\com\\templateJavaAppium\\resources\\nestedViews.xlsx","Cliques");
        ArrayList<Object[]> dataList = new ArrayList<Object[]>();

        int i = 1;// excluding header row
        int totalRows = 5;// the row number of data in the sheet
        while (i < totalRows) {
            System.out.println("Users : line : " + i);

            Object[] dataLine = new Object[2];

            dataLine[0] = excelUtils.getCell2(i, 0);// nome
            dataLine[1] = excelUtils.getCell2(i, 1);// senha

            dataList.add(dataLine);

            i++;
        }

        Object[][] data = new Object[dataList.size()][];
        for (i = 0; i < dataList.size(); i++)
            data[i] = dataList.get(i);

        return data;

    }

    @Test(priority = 1, description = "clicando botao upNavigationFirstLevel")
    public void upNavigationFirstLevel(){

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();
        nestedViewsPage.clickUpNavigation();

        Assert.assertEquals("Press to go to the next level",nestedViewsPage.verificarTextoLevel());
    }

    @Test(priority = 1, description = "clicando botao upNavigation")
    public void upNavigationFinalLevel(){

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();
        nestedViewsPage.clickUpNavigation();
        nestedViewsPage.clickUpNavigation();

        Assert.assertEquals("Final Level",nestedViewsPage.verificarTextoLevel());

    }

    @Test(priority = 1, description = "Clicando botao back navigation")
    public void backNavigationFirstLevel(){

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();
        nestedViewsPage.clickBackNavigation();

        Assert.assertEquals("1",nestedViewsPage.verificarCountLevel());

    }

    @Test(dataProvider = "Cliques", priority = 1, description = "Clicando botão BackButton pegando quantidade de cliques e resultado esperado do Excel")
    public void testBackButton(int qtdCliques, int resultadoEsperado) {

       String ResultadoEsperadoContador= Integer.toString (resultadoEsperado);

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        nestedViewsPage = new NestedViewsPage();
        menuPage = new MenuPage();

        startPage.clickMenu();
        menuPage.clickNestedViewsBtn();
        nestedViewsPage.clickBackNavigation();
        nestedViewsPage.clickNextButton(qtdCliques);

        Assert.assertEquals(nestedViewsPage.verificarCountLevel(), ResultadoEsperadoContador);
    }

    }
