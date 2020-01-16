package com.templateJavaAppium.tests.ios;

import com.templateJavaAppium.bases.PageBase;
import com.templateJavaAppium.bases.TestBaseIOS;
import com.templateJavaAppium.flows.SubMenusInputFlowsIos;
import com.templateJavaAppium.pages.InputDataPickerPage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.SpinnerPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpinnerTests extends TestBaseIOS {


    PageBase pageBase;
    SubMenusInputFlowsIos subMenusInputFlowsIos;
    MenuPage menuPage;
    SpinnerPage spinnerPage;


    @Test(priority = 1, description =  "Manipular Spinner e verificar valor")
    public void manipularSpinnerSelection1(){

        pageBase = new PageBase();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();
        spinnerPage = new SpinnerPage();


        String selecao = "Selection 1";

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuSpinnerPicker();
        spinnerPage.manipularSpinnericker(selecao);

        Assert.assertTrue(spinnerPage.verificaSpinner1());

    }

    @Test(priority = 1, description =  "Manipular Spinner e verificar valor")
    public void manipularSpinnerSelection2(){

        pageBase = new PageBase();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();
        spinnerPage = new SpinnerPage();


        String selecao = "Selection 2";

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuSpinnerPicker();
        spinnerPage.manipularSpinnericker(selecao);

        Assert.assertTrue(spinnerPage.verificaSpinner2());

    }

    @Test(priority = 1, description =  "Manipular Spinner e verificar valor")
    public void manipularSpinnerSelection3(){

        pageBase = new PageBase();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();
        spinnerPage = new SpinnerPage();


        String selecao = "Selection 3";

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuSpinnerPicker();
        spinnerPage.manipularSpinnericker(selecao);

        Assert.assertTrue(spinnerPage.verificaSpinner3());

    }

    @Test(priority = 1, description =  "Manipular Spinner e verificar valor")
    public void manipularSpinnerSelection4(){

        pageBase = new PageBase();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();
        spinnerPage = new SpinnerPage();


        String selecao = "Selection 4";

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuSpinnerPicker();
        spinnerPage.manipularSpinnericker(selecao);

        Assert.assertTrue(spinnerPage.verificaSpinner4());

    }

    @Test(priority = 1, description =  "Manipular Spinner e verificar valor")
    public void manipularSpinnerSelection5(){

        pageBase = new PageBase();
        menuPage = new MenuPage();
        subMenusInputFlowsIos = new SubMenusInputFlowsIos();
        spinnerPage = new SpinnerPage();


        String selecao = "Selection 5";

        menuPage.clickInputControls();
        subMenusInputFlowsIos.subMenuSpinnerPicker();
        spinnerPage.manipularSpinnericker(selecao);

        Assert.assertTrue(spinnerPage.verificaSpinner5());

    }



}
