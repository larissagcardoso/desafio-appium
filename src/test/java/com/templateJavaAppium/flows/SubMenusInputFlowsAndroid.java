package com.templateJavaAppium.flows;

import com.templateJavaAppium.pages.InputControlsPage;
import com.templateJavaAppium.pages.MenuPage;

public class SubMenusInputFlowsAndroid {

    private MenuPage menuPage;
    private InputControlsPage inputControlsPage;

    public SubMenusInputFlowsAndroid() {
        menuPage = new MenuPage();
        inputControlsPage = new InputControlsPage();
        menuPage = new MenuPage();
    }

    public  void subMenuTextField() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
    }

    public  void subMenuCheckBox() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();

    }

    public  void subMenuRadioButtons() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();
        inputControlsPage.clickSubMenuRadioButtons();
    }


    public  void subMenuToggleButton() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();
        inputControlsPage.clickSubMenuRadioButtons();
        inputControlsPage.clickSubMenuToggleButton();

    }

    public  void subMenuSpinner() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();
        inputControlsPage.clickSubMenuRadioButtons();
        inputControlsPage.clickSubMenuToggleButton();
        inputControlsPage.clickSubMenuSpinner();

    }

    public  void subMenuPullToRefresh() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();
        inputControlsPage.clickSubMenuRadioButtons();
        inputControlsPage.clickSubMenuToggleButton();
        inputControlsPage.clickSubMenuSpinner();
        inputControlsPage.clickSubMenuPullToRefresh();
    }

    public  void subMenuTimePicker() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();
        inputControlsPage.clickSubMenuRadioButtons();
        inputControlsPage.clickSubMenuToggleButton();
        inputControlsPage.clickSubMenuSpinner();
        inputControlsPage.clickSubMenuPullToRefresh();
        inputControlsPage.clickSubMenuTimePicker();
    }

    public  void subMenuDatePicker() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();
        inputControlsPage.clickSubMenuRadioButtons();
        inputControlsPage.clickSubMenuToggleButton();
        inputControlsPage.clickSubMenuSpinner();
        inputControlsPage.clickSubMenuPullToRefresh();
        inputControlsPage.clickSubMenuTimePicker();
        inputControlsPage.clickSubMenuTimePicker();

    }

    public  void subMenuGestures() {
        menuPage.clickInputControls();
        inputControlsPage.clickSubMenuTextField();
        inputControlsPage.clickSubMenuCheckBox();
        inputControlsPage.clickSubMenuRadioButtons();
        inputControlsPage.clickSubMenuToggleButton();
        inputControlsPage.clickSubMenuSpinner();
        inputControlsPage.clickSubMenuPullToRefresh();
        inputControlsPage.clickSubMenuTimePicker();
        inputControlsPage.clickSubMenuDatePicker();
        inputControlsPage.clickSubMenuSubmitButton();
        inputControlsPage.clickSubMenuGestures();

    }


}
