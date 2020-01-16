package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class InputControlsPage extends PageBase {


    @AndroidFindBy(xpath = "//*[@text='Text Field']")
    private MobileElement textField;

    @AndroidFindBy(xpath = "//*[@text='Checkbox']")
    private MobileElement checkBox;

    @AndroidFindBy(xpath = "//*[@text='Radio Buttons']")
    private MobileElement radioButtons;

    @AndroidFindBy(xpath = "//*[@text='Toggle Button']")
    private MobileElement toggleButton;

    @AndroidFindBy(xpath = "//*[@text='Spinner']")
    private MobileElement spinner;

    @AndroidFindBy(xpath = "//*[@text='Pull To Refresh']")
    private MobileElement pullToRefresh;

    @AndroidFindBy(xpath = "//*[@text='Time Picker']")
    private MobileElement timePicker;

    @AndroidFindBy(xpath = "//*[@text='Date Picker']")
    private MobileElement datePicker;

    @AndroidFindBy(xpath = "//*[@text='Submit Button']")
    private MobileElement submitButton;

    @AndroidFindBy(xpath = "//*[@text='Gestures']")
    private MobileElement gestures;

    public  void clickSubMenuTextField() {
        click(textField);
    }

    public  void clickSubMenuCheckBox() {
        click(checkBox);
    }

    public  void clickSubMenuRadioButtons() {
        click(radioButtons);
    }

    public  void clickSubMenuToggleButton() { click(toggleButton);    }

    public  void clickSubMenuSpinner() {
        click(spinner);
    }

    public  void clickSubMenuPullToRefresh() {
        click(pullToRefresh);
    }

    public  void clickSubMenuTimePicker() {
        click(timePicker);
    }

    public  void clickSubMenuDatePicker() {
        click(datePicker);
    }

    public  void clickSubMenuSubmitButton() {
        click(submitButton);
    }

    public  void clickSubMenuGestures() {
        click(gestures);
    }

    public void swipeSubMenusInput(){
        scrolling("right");
    }
}
