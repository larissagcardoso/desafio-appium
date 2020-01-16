package com.templateJavaAppium.bases;
import com.templateJavaAppium.GlobalParameters;
import com.templateJavaAppium.utils.DriveFactory;
import com.templateJavaAppium.utils.ExtentReportUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.time.StopWatch;


import java.time.Duration;
import java.util.HashMap;
import  java.util.List;


public class PageBase {
    //Variaveis globlais
    protected AppiumDriver driver = null;
    protected WebDriverWait wait = null;
    protected JavascriptExecutor javaScriptExecutor = null;

    //Construtor
    public PageBase(){
        PageFactory.initElements(new AppiumFieldDecorator(DriveFactory.getDriver()),this);
        driver = DriveFactory.getDriver();
        wait = new WebDriverWait (driver, GlobalParameters.TIMEOUT_DEFAULT);
    }
    protected void waitForElement(MobileElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void waitForElementToBeClickeable(MobileElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    protected void waitForElementByTime(MobileElement element, int time){
        WebDriverWait waitTime = new WebDriverWait(driver, time);
        waitTime.until(ExpectedConditions.visibilityOf(element));
    }
    protected void click(MobileElement element){
        WebDriverException possibleWebDriverException = null;
        StopWatch timeOut = new StopWatch();
        timeOut.start();
        while (timeOut.getTime() <= GlobalParameters.TIMEOUT_DEFAULT)
        {
            //WebElement element = null;
            try
            {
                waitForElement(element);
                element.click();
                ExtentReportUtils.addTestInfo(3, "");
                timeOut.stop();
                return;
            }
            catch (StaleElementReferenceException e) {
                continue;
            }
            catch (WebDriverException e)
            {
                possibleWebDriverException = e;
                if (e.getMessage().contains("Other element would receive the click")) {
                    continue;
                }
                throw e;
            }
        }
        try {
            throw new Exception(possibleWebDriverException);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void clickVariasVezes(MobileElement element, int n){
        WebDriverException possibleWebDriverException = null;
        StopWatch timeOut = new StopWatch();
        timeOut.start();
        while (timeOut.getTime() <= GlobalParameters.TIMEOUT_DEFAULT)
        {
            //WebElement element = null;
            try
            {
                for (int i = 0; i <  n; i++) {
                    waitForElement(element);
                    element.click();
                }


                timeOut.stop();
               ExtentReportUtils.addTestInfo(3, "");
                return;
            }
            catch (StaleElementReferenceException e) {
                continue;
            }
            catch (WebDriverException e)
            {
                possibleWebDriverException = e;
                if (e.getMessage().contains("Other element would receive the click")) {
                    continue;
                }
                throw e;
            }
        }
        try {
            throw new Exception(possibleWebDriverException);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    protected void sendKeys(MobileElement element, String text){
        waitForElement(element);
        element.sendKeys(text);
        ExtentReportUtils.addTestInfo(3, "PARAMETER: " + text);
    }
    protected void sendKeysWithoutWaitVisible(MobileElement element, String text){
        element.sendKeys(text);
        ExtentReportUtils.addTestInfo(3, "PARAMETER: " + text);
    }
    protected void clear(MobileElement element){
        waitForElement(element);
        element.clear();

    }

    protected String getText(MobileElement element){
        waitForElement(element);
        String text = element.getText();
        ExtentReportUtils.addTestInfo(3, "RETURN: " + text);
        return text;
    }

    protected boolean returnIfElementIsDisplayed(MobileElement element){
        waitForElement(element);
        boolean result = element.isDisplayed();
        ExtentReportUtils.addTestInfo(3, "RETURN: " + result);
        return result;
    }

    protected boolean returnIfElementIsSelected(MobileElement element){
        waitForElement(element);
        boolean result = element.isSelected();
        ExtentReportUtils.addTestInfo(3, "RETURN: " + result);
        return result;
    }

    protected void scrollUsingTouchActions_ByElements(MobileElement startElement, MobileElement endElement, int seconds) {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(startElement.getLocation().x,startElement.getLocation().y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(seconds)))
                .moveTo(PointOption.point(endElement.getLocation().x,endElement.getLocation().y)).release().perform();
    }

    public void scroll (double inicio, double fim ) {
        Dimension size = driver.manage().window().getSize();

        int x = size.width/2;
        int start_y = (int) (size.height * inicio);
        int end_y = (int) (size.height * fim);

        TouchAction actions = new TouchAction(driver);
                    actions.press(PointOption.point(x, start_y))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(x, end_y)).release().perform();

    }


    protected void longPress(MobileElement element) {
        waitForElement(element);
        TouchAction action = new TouchAction(driver);
        action.longPress(LongPressOptions.longPressOptions()
                .withElement (ElementOption.element (element)))
                .perform ();
    }

   protected void scrolling(String direction){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", direction);
        js.executeScript("mobile: scroll", scrollObject);
    }

    protected void setDatePickerIos(String mes, String dia, String ano, String direcao, double offset) {
        List<WebElement> Columns = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        HashMap<String, Object> hp = new HashMap<String, Object>();
        hp.put("order", direcao);
        hp.put("offset", offset);
        hp.put("element", Columns.get(0));
        js.executeScript("mobile: selectPickerWheelValue", hp);

        Columns.get(0).sendKeys(mes);
        Columns.get(1).sendKeys(dia);
        Columns.get(2).sendKeys(ano);
    }

    protected void setSppinerIos(String selecao, String direcao, double offset) {
        List<WebElement> Columns = driver.findElements(By.xpath("//XCUIElementTypePickerWheel"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Object> hp = new HashMap<String, Object>();
        hp.put("order", direcao);
        hp.put("offset", offset);
        hp.put("element", Columns.get(0));
        js.executeScript("mobile: selectPickerWheelValue", hp);

        Columns.get(0).sendKeys(selecao);
    }


    protected void tap(MobileElement element){
        waitForElement(element);
        TouchAction action  = new AndroidTouchAction (driver);
        action.tap (TapOptions.tapOptions()
                .withElement (ElementOption.element(element)))
                .perform ();
    }


}
