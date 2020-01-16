package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class NestedViewsPage extends PageBase {

    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_up_button")
    private MobileElement upButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/nested_back_button")
    private MobileElement backButton;


    @AndroidFindBy (id = "com.amazonaws.devicefarm.android.referenceapp:id/up_navigation_content_text")
    private  MobileElement LevelText;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name='Next']")
    @AndroidFindBy (id = "com.amazonaws.devicefarm.android.referenceapp:id/back_navigation_next_button")
    private  MobileElement nextButton;

    @iOSFindBy(accessibility = "This is the first view")
    @AndroidFindBy (accessibility = "Level Display")
    private  MobileElement LevelDisplay;

    @iOSFindBy(accessibility = "This is the second view")
    @AndroidFindBy(id = "com.amazonaws.devicefarm.android.referenceapp:id/back_navigation_counter")
    private MobileElement txtSecond;


    @iOSFindBy(accessibility = "This is the third view")
    private MobileElement  txtThird;

    @iOSFindBy(accessibility = "This is the fourth view")
    private MobileElement txtFourth;


    public void clickBackNavigation() {
        click(backButton);
    }

    public void clickUpNavigation() {
        click(upButton);
    }

    public void clickNextButton(int n) {
        clickVariasVezes(nextButton, n );
    }

    public String verificarTextoLevel () {
        return  getText(LevelText);
    }

    public String verificarCountLevel() {
        return getText(LevelDisplay);
    }

    public String verificarTxtSecond() {
        return getText(txtSecond) ;
    }

    public String verificarTxtThird() {
        return getText(txtThird) ;
    }

    public String verificarTxtFourth() {
        return getText(txtFourth) ;
    }
}
