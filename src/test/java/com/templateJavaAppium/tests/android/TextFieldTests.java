package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusInputFlowsAndroid;
import com.templateJavaAppium.pages.StartPage;
import com.templateJavaAppium.pages.TextFieldPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextFieldTests extends TestBaseAndroid{

    TextFieldPage textFieldpage;
    StartPage startPage;
    SubMenusInputFlowsAndroid subMenusInputFlowsAndroid;

    @Test(priority = 1, description =  "Informar texto input e verificar texto digitado")
    public void informarTextoInput(){
        String texto = "teste input";

        textFieldpage = new TextFieldPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuTextField();
        textFieldpage.infoTexto(texto);

        Assert.assertEquals("teste input",textFieldpage.verificarTexto());
    }

    @Test(priority = 2, description =  "Verificar input vazio")
    public void verificarCampoVazio (){

        textFieldpage = new TextFieldPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuTextField();

        Assert.assertEquals("Enter Text",textFieldpage.verificarTexto());
    }

}
