package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusInputFlowsAndroid;
import com.templateJavaAppium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonsTests extends TestBaseAndroid {

    RadioButtonsPage radioButtonsPage;
    StartPage startPage;
    SubMenusInputFlowsAndroid subMenusInputFlowsAndroid;


    @Test(priority =1, description = "Clicando primeiro Radio Button e verificando o valor")
    public void primeiroRadio() {

        radioButtonsPage = new RadioButtonsPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuRadioButtons();
        radioButtonsPage.clickRadioButton1();

        Assert.assertEquals(radioButtonsPage.getRadioText(), "Amazon");

    }

    @Test(priority =1, description = "Clicando segundo Radio Button e verificando o valor")
    public void secundoRadio() {
        radioButtonsPage = new RadioButtonsPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuRadioButtons();
        radioButtonsPage.clickRadioButton2();

        Assert.assertEquals(radioButtonsPage.getRadioText(), "Web");
    }

    @Test(priority =1, description = "Clicando terceiro Radio Button e verificando o valor")
    public void terceiroRadio() {

        radioButtonsPage = new RadioButtonsPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuRadioButtons();
        radioButtonsPage.clickRadioButton3();
        Assert.assertEquals(radioButtonsPage.getRadioText(), "Services");
    }
}
