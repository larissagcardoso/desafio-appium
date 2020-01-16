package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SpinnerFlows;
import com.templateJavaAppium.flows.SubMenusInputFlowsAndroid;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpinnerTests extends TestBaseAndroid {


    StartPage startPage;
    SubMenusInputFlowsAndroid subMenusInputFlowsAndroid;
    SpinnerFlows spinnerFlows;

    @Test(priority =1, description = "Selecionando Op1 e verificando msg no Display")
    public void selecionarOp1() {

        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();
        spinnerFlows = new SpinnerFlows();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuSpinner();
        String mensagemDisplay = spinnerFlows.Op1();

        Assert.assertEquals("Selected: option 1",mensagemDisplay);
    }

    @Test (priority =1, description =  "Selecionando Op2 e verificando msg no Display")
    public void selecionarOp2() {


        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();
        spinnerFlows = new SpinnerFlows();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuSpinner();
        String mensagemDisplay = spinnerFlows.Op2();

        Assert.assertEquals("Selected: option 2",mensagemDisplay);
    }

    @Test(priority =1, description =  "Selecionando Op3 e verificando msg no Display")
    public void selecionarOp3() {


        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();
        spinnerFlows = new SpinnerFlows();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuSpinner();
        String mensagemDisplay = spinnerFlows.Op3();

        Assert.assertEquals("Selected: option 3",mensagemDisplay);
    }

    @Test(priority =1, description =  "Selecionando Op4 e verificando msg no Display")
    public void selecionarOp4() {


        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();
        spinnerFlows = new SpinnerFlows();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuSpinner();
        String mensagemDisplay = spinnerFlows.Op4();

        Assert.assertEquals("Selected: option 4",mensagemDisplay);
    }

    @Test(priority =1, description =  "Selecionando Op5 e verificando msg no Display")
    public void selecionarOp5() {


        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();
        spinnerFlows = new SpinnerFlows();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuSpinner();
        String mensagemDisplay = spinnerFlows.Op5();

        Assert.assertEquals("Selected: option 5",mensagemDisplay);
    }

    @Test(priority =1, description =  "Selecionando Op6 e verificando msg no Display")
    public void selecionarOp6() {


        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();
        spinnerFlows = new SpinnerFlows();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuSpinner();
        String mensagemDisplay = spinnerFlows.Op6();

        Assert.assertEquals("Selected: option 6",mensagemDisplay);
    }
}
