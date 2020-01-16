package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.FindBy;

public class InputDataPickerPage  extends PageBase {

    @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText")
    private MobileElement displayDataInformada;

    @FindBy(xpath = "//XCUIElementTypePickerWheel")
    private  MobileElement datePicker;

    public String getDataSelecionadaIos() {
        return getText(displayDataInformada);
    }

    public void manipularDatePicker(String mes, String dia, String ano) {
        setDatePickerIos(mes,dia,ano,"next",0.15);
    }


}
