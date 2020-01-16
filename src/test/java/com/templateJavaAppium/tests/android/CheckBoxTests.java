package com.templateJavaAppium.tests.android;

import com.templateJavaAppium.bases.TestBaseAndroid;
import com.templateJavaAppium.flows.SubMenusInputFlowsAndroid;
import com.templateJavaAppium.pages.CheckBoxPage;
import com.templateJavaAppium.pages.StartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends TestBaseAndroid {

    CheckBoxPage checkBoxPage;
    StartPage startPage;
    SubMenusInputFlowsAndroid subMenusInputFlowsAndroid;

    @Test(priority = 1, description = "Verifica Ckeckbox habilitado")
    public void ckeckHabilitado(){
        String texto = "teste input";

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuCheckBox();
        checkBoxPage.clickCheckBox();

        Assert.assertEquals("Checked",checkBoxPage.getCheckBoxDisplay());
    }

    @Test(priority = 2, description = "Verifica Ckeckbox desabilitado")
    public void checkDesabilitado(){
        String texto = "teste input";

        checkBoxPage = new CheckBoxPage();
        startPage = new StartPage();
        subMenusInputFlowsAndroid = new SubMenusInputFlowsAndroid();

        startPage.clickMenu();
        subMenusInputFlowsAndroid.subMenuCheckBox();

        Assert.assertEquals("Unchecked",checkBoxPage.getCheckBoxDisplay());
    }

}

