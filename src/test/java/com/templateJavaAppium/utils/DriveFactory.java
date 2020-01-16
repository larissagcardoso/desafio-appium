package com.templateJavaAppium.utils;
import com.templateJavaAppium.GlobalParameters;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.net.URL;

public class DriveFactory {

    public static AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;
    private static String path = System.getProperty("user.dir");

    public static AppiumDriver<MobileElement> getDriver(){
        if (driver == null)
            throw new NullPointerException("The Driver instance was not initialized.");
        return driver;
    }
    public void setDriver(AppiumDriver<MobileElement> driver)
    {
        this.driver = driver;
    }
    public static void InitApp(String deviceType) throws IOException, InterruptedException {
        if (deviceType.equals("Android"))
        {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", GlobalParameters.AndroidPlatformName);
            caps.setCapability("platformVersion", GlobalParameters.AndroidPlatformVersion);
            caps.setCapability("deviceName", GlobalParameters.AndroidDeviceName);

            //caso vc nao tenha o arquivo apk e sim um app ja instalado no device, use o appPackage e appActivity
            caps.setCapability("app", GlobalParameters.AndroidAppPath);
            //caps.setCapability("appPackage", GlobalParameters.AndroidAppPackage);
            //caps.setCapability("appActivity", GlobalParameters.AndroidAppActivity);

            caps.setCapability("browserName",GlobalParameters.AndroidBrowserName);
            caps.setCapability("udid", GlobalParameters.AndroidUDID);
            caps.setCapability("noReset",GlobalParameters.AndroidNoReset);
            caps.setCapability("fullReset",GlobalParameters.AndroidFullReset);
            caps.setCapability("orientation",GlobalParameters.AndroidOrientation);

            driver = new AndroidDriver<MobileElement>(new URL(GlobalParameters.AppiumServer), caps);
            //driver.resetApp();
        }
        else if (deviceType.equals("IOS")){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", GlobalParameters.IOSPlatformName);
            caps.setCapability("platformVersion", GlobalParameters.IOSPlatformVersion);
            caps.setCapability("deviceName", GlobalParameters.IOSDeviceName);
            caps.setCapability("automationName", GlobalParameters.IOSAutomationName);
           //caps.setCapability("bundleId", GlobalParameters.IOSBundleId);
            caps.setCapability("app", GlobalParameters.IOSAppPath);
          // caps.setCapability("udid", GlobalParameters.IOSUDID);
            caps.setCapability("noReset", GlobalParameters.IOSNoReset);
            caps.setCapability("fullReset", GlobalParameters.IOSFullReset);

            driver = new IOSDriver(new URL(GlobalParameters.AppiumServer), caps);

        }

        else if (deviceType.equals("IOSDeviceFarm")){

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", GlobalParameters.IOSDeviceName);
            caps.setCapability("automationName", GlobalParameters.IOSAutomationName);
            caps.setCapability("app", GlobalParameters.BS_ChaveAppiOS);
            //caps.setCapability("browserstack.debug", true);
            driver = new IOSDriver(new URL("https://"+GlobalParameters.BS_USERNAME+":"+GlobalParameters.BS_ACCESSKEY+"@hub-cloud.browserstack.com/wd/hub"), caps);

        }

        else if (deviceType.equals("AndroidDeviceFarm")){

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", GlobalParameters.AndroidPlatformName);
            caps.setCapability("device", GlobalParameters.BS_Device);
            caps.setCapability("os_version", GlobalParameters.BS_OsVersion);
            caps.setCapability("app", GlobalParameters.BS_ChaveApp);

            driver = new AndroidDriver(new URL("https://"+GlobalParameters.BS_USERNAME+":"+GlobalParameters.BS_ACCESSKEY+"@hub-cloud.browserstack.com/wd/hub"), caps);

        }




    }
}
