package com.templateJavaAppium.flows;

import com.templateJavaAppium.pages.SpinnerPage;

public class SpinnerFlows {

    private SpinnerPage spinnerPage;

    public SpinnerFlows () {

        spinnerPage = new SpinnerPage();
    }

    public String Op1(){
        spinnerPage.clickSpinner();
        spinnerPage.clickOption1();
        return spinnerPage.getDisplayText();

    }

    public String Op2(){
        spinnerPage.clickSpinner();
        spinnerPage.clickOption2();
        return spinnerPage.getDisplayText();
    }

    public String Op3(){
        spinnerPage.clickSpinner();
        spinnerPage.clickOption3();
        return spinnerPage.getDisplayText();
    }

    public String Op4(){
        spinnerPage.clickSpinner();
        spinnerPage.clickOption4();
        return spinnerPage.getDisplayText();
    }

    public String Op5(){
        spinnerPage.clickSpinner();
        spinnerPage.clickOption5();
        return spinnerPage.getDisplayText();
    }

    public String Op6(){
        spinnerPage.clickSpinner();
        spinnerPage.clickOption6();
        return spinnerPage.getDisplayText();
    }


}
