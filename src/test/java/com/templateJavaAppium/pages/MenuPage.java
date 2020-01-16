package com.templateJavaAppium.pages;

import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MenuPage extends PageBase {

    @iOSFindBy (accessibility = "Native")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[3]")
    private MobileElement nativeComponetsBtn;

    @iOSFindBy(accessibility = "Inputs")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[4]")
    private MobileElement inputControlsBtn;

    @iOSFindBy(accessibility = "Nested")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[5]")
    private MobileElement nestedViewsBtn;

    @iOSFindBy(accessibility = "Crash")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[6]")
    private MobileElement crashBugBtn;

    @iOSFindBy(accessibility = "Alerts")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[7]")
    private MobileElement alertsBtn;

    @iOSFindBy(accessibility = "Login")
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[8]")
    private MobileElement loginPageBtn;

    @iOSFindBy(accessibility = "Web")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceId(\"com.amazonaws.devicefarm.android.referenceapp:id/drawerList\")).scrollIntoView(new UiSelector().text(\"Local Web View\"))")
   // @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[9]")
    private MobileElement localWebViewBtn;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceId(\"com.amazonaws.devicefarm.android.referenceapp:id/drawerList\")).scrollIntoView(new UiSelector().text(\"Fixtures\"))")
    //AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[10]")
    private MobileElement fixturesBtn;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().resourceId(\"com.amazonaws.devicefarm.android.referenceapp:id/drawerList\")).scrollIntoView(new UiSelector().text(\"Supplemental Uploads\"))")
    //AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[10]")
    private MobileElement supplementalUploadsBtn;

    @iOSFindBy(accessibility = "HTTP")
     private MobileElement httpBtn;


    public void clickNativeComponets()
    {
        click(nativeComponetsBtn);
    }
    public void clickInputControls()
    {
        click(inputControlsBtn);
    }
    public void clickAterts(){
        click(alertsBtn);
    }
    public  void clickNestedViewsBtn() {click(nestedViewsBtn);}
    public void clickCrashBugBtn(){
        click(crashBugBtn);
    }
    public void clickLoginPage()
    {
        click(loginPageBtn);
    }
    public void clicklocalWebViewBtn()
    {
        click(localWebViewBtn);
    }
    public void clickFixtures()
    {
        click(fixturesBtn);
    }
    public void clickSupplementalUploads()
    {
        click(supplementalUploadsBtn);
    }
    public void clickHttp () {click(httpBtn);}


}
