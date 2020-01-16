package com.templateJavaAppium.flows;

import com.templateJavaAppium.pages.InputControlsPage;
import com.templateJavaAppium.pages.MenuPage;
import com.templateJavaAppium.pages.TextFieldPage;

public class SubMenusInputFlowsIos {


    private InputControlsPage inputControlsPage;

    public SubMenusInputFlowsIos() {
         inputControlsPage = new InputControlsPage();
    }

    public  void subMenuTextField() {
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();

    }

    public  void subMenuRefreshPull() {
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
    }

    public  void subMenuDatePicker() {
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();

    }

    public  void subMenuSpinnerPicker() {
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();
        inputControlsPage.swipeSubMenusInput();

    }




}
