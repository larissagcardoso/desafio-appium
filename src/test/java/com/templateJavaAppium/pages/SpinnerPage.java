package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpinnerPage extends PageBase {

    @AndroidFindBy (id = "com.amazonaws.devicefarm.android.referenceapp:id/input_spinner")
    private MobileElement spinner;

    @AndroidFindBy(accessibility = "Spinner Display")
    private MobileElement displayMensagem;

    @AndroidFindBy(xpath = "//*[@text='option 1']")
    @iOSFindBy (xpath = "//XCUIElementTypeStaticText[@name='Selection 1']")
    private MobileElement option1;

    @AndroidFindBy(xpath = "//*[@text='option 2']")
    @iOSFindBy (xpath = "//XCUIElementTypeStaticText[@name='Selection 2']")
    private MobileElement option2;

    @AndroidFindBy(xpath = "//*[@text='option 3']")
    @iOSFindBy (xpath = "//XCUIElementTypeStaticText[@name='Selection 3']")
    private MobileElement option3;

    @AndroidFindBy(xpath = "//*[@text='option 4']")
    @iOSFindBy (xpath = "//XCUIElementTypeStaticText[@name='Selection 4']")
    private MobileElement option4;

    @AndroidFindBy(xpath = "//*[@text='option 5']")
    @iOSFindBy (xpath = "//XCUIElementTypeStaticText[@name='Selection 5']")
    private MobileElement option5;

    @AndroidFindBy(xpath = "//*[@text='option 6']")
    @iOSFindBy (xpath = "//XCUIElementTypeStaticText[@name='Selection 6']")
    private MobileElement option6;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name='Submit']")
    private MobileElement submitLabel;



    public void clickSpinner(){
        spinner.click();
    }

    public String getDisplayText() {
        return getText(displayMensagem);
    }

    public void clickOption1() {
        click(option1);
    }

    public void clickOption2() {
        click(option2);
    }

    public void clickOption3() {
        click(option3);
    }

    public void clickOption4() {
       click(option4);
    }

    public void clickOption5() {
        click(option5);
    }

    public void clickOption6() {
        click(option6);
    }

    public  boolean verificaSpinner1(){
        return  returnIfElementIsDisplayed (option1);
    }

    public  boolean verificaSpinner2(){
        return  returnIfElementIsDisplayed (option2);
    }

    public  boolean verificaSpinner3(){
        return  returnIfElementIsDisplayed (option3);
    }

    public  boolean verificaSpinner4(){
        return  returnIfElementIsDisplayed (option4);
    }

    public  boolean verificaSpinner5(){
        return  returnIfElementIsDisplayed (option5);
    }



    public  boolean verificaSubmit(){
        return  returnIfElementIsDisplayed (submitLabel);
    }

    public void manipularSpinnericker(String selecao) {
        setSppinerIos(selecao,"next",0.15);
    }

}
