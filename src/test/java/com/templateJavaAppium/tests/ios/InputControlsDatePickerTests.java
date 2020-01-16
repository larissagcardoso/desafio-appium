package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.PageBase;
import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.flows.SubMenusInputFlowsIos;
import com.templateJavaAppium.pages.InputDataPickerPage;
import com.templateJavaAppium.pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputControlsDatePickerTests extends TestBaseIOS {


    PageBase pageBase;
    SubMenusInputFlowsIos subMenusInputFlowsIos;
    MenuPage menuPage;
    InputDataPickerPage inputDataPickerPage;


    @Test(priority = 1, description =  "Manipular Date Picker e verificar valor")
    public void manipulardData(){

        pageBase = new PageBase();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();
        inputDataPickerPage = new InputDataPickerPage();

        String mes = "April";
        String dia = "13";
        String ano = "1995";

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuDatePicker();
        inputDataPickerPage.manipularDatePicker(mes,dia,ano);

        Assert.assertEquals("Apr 13, 1995",inputDataPickerPage.getDataSelecionadaIos());

    }

    @Test(priority = 1, description =  "Entrar Date Picker sem manipular data")
    public void EntrarDatePicker(){

        pageBase = new PageBase();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();
        inputDataPickerPage = new InputDataPickerPage();


        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuDatePicker();

        Assert.assertEquals("Please select a date from the date picker",inputDataPickerPage.getDataSelecionadaIos());

    }



}
