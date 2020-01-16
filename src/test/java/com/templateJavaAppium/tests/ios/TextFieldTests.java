package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.flows.SubMenusInputFlowsIos;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.TextFieldPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TextFieldTests extends TestBaseIOS {

    TextFieldPage textFieldpage;
    SubMenusInputFlowsIos subMenusInputFlowsIos;
    MenuPage menuPage;


    @Test(priority = 1, description =  "Informar texto input e verificar texto digitado")
    public void informarTextoInput(){
        String texto = "teste larissa";

        textFieldpage = new TextFieldPage();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuTextField();
        textFieldpage.infoTexto(texto);

        Assert.assertEquals("teste larissa",textFieldpage.verificarTexto());
    }

    @Test(priority = 1, description =  "Informar texto input e verificar texto digitado")
    public void verificarCampoVazio(){

        textFieldpage = new TextFieldPage();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuTextField();


        Assert.assertEquals("text field",textFieldpage.verificarTexto());
    }


}
