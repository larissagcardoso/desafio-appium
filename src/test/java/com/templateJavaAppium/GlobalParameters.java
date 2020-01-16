package com.templateJavaAppium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalParameters {

    public static String BROWSER_DEFAULT;
    public static String EXECUTION;
    public static int TIMEOUT_DEFAULT;
    public static String SELENIUM_HUB;
    public static String URL_DEFAULT;
    public static String REPORT_NAME;
    public static boolean GET_SCREENSHOT_FOR_EACH_STEP;
    public static String DOWNLOAD_DEFAULT_PATH;
    public static String REPORT_PATH;
    public static String DB_URL;
    public static String DB_SID;
    public static String DB_USER;
    public static String DB_PASSWORD;

    public static String AppiumIPAddress;
    public static int AppiumPort;

    public static String AndroidDeviceName;
    public static String AndroidUDID;
    public static String AndroidPlatformName;
    public static String AndroidPlatformVersion;
    public static String AndroidAppPackage;
    public static String AndroidAppActivity;
    public static String AppiumServer;
    public static String AndroidAppPath;
    public static String AndroidBrowserName;
    public static String AndroidNoReset;
    public static String AndroidFullReset;
    public static String AndroidOrientation;
    public static String AndroidAutomationName ;

    public static String IOSUDID;
    public static String IOSPlatformName;
    public static String IOSPlatformVersion;
    //public static String IOSBundleId;
    public static String IOSReportFormat;
    public static String IOSTestName;
    public static String IOSNoReset;
    public static String IOSFullReset;
    public static String IOSSendKeyStrategy;
    public static String IOSAutomationName;
    public static String IOSDeviceName;
    public static String IOSAppPath;
    public static String IOSBundleId;
    public static String PathProject = System.getProperty("user.dir");

    public static  String BS_USERNAME;
    public  static  String BS_ACCESSKEY;
    public static  String BS_Device;
    public static  String BS_OsVersion;
    public static  String BS_ChaveApp;
    public  static  String BS_Url;

    public static  String BS_DeviceiOS;
    public static  String BS_OsVersioniOS;
    public static  String BS_ChaveAppiOS;

    private Properties properties;

    public GlobalParameters(){
        properties = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("globalParameters.properties");
            properties.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BROWSER_DEFAULT = properties.getProperty("browser.default");
        EXECUTION = properties.getProperty("execution");
        TIMEOUT_DEFAULT = Integer.parseInt(properties.getProperty("timeout.default"));
        SELENIUM_HUB = properties.getProperty("selenium.hub");
        URL_DEFAULT = properties.getProperty("url.default");
        REPORT_NAME = properties.getProperty("report.name");
        GET_SCREENSHOT_FOR_EACH_STEP = Boolean.parseBoolean(properties.getProperty("get.screenshot.for.each.step"));
        DOWNLOAD_DEFAULT_PATH = properties.getProperty("download.defaul.path");
        REPORT_PATH = properties.getProperty("report.path");
        DB_URL = properties.getProperty("db.url");
        DB_SID = properties.getProperty("db.sid");
        DB_USER = properties.getProperty("db.user");
        DB_PASSWORD = properties.getProperty("db.password");

        AppiumServer = properties.getProperty("AppiumServer");
        AppiumIPAddress = properties.getProperty("AppiumIPAddress");
        AppiumPort = Integer.parseInt(properties.getProperty("AppiumPort"));

        AndroidDeviceName  = properties.getProperty("AndroidDeviceName");
        AndroidUDID= properties.getProperty("AndroidUDID");
        AndroidPlatformName= properties.getProperty("AndroidPlatformName");
        AndroidPlatformVersion= properties.getProperty("AndroidPlatformVersion");
     //  AndroidAppPackage= properties.getProperty("AndroidAppPackage");
        // AndroidAppActivity= properties.getProperty("AndroidAppActivity");
        AndroidAppPath = System.getProperty("user.dir")+"\\src\\test\\java\\com\\templateJavaAppium\\resources\\app\\android\\"+properties.getProperty("AndroidApp");
        AndroidBrowserName=properties.getProperty("AndroidBrowserName");
        AndroidNoReset=properties.getProperty("AndroidNoReset");
        AndroidFullReset=properties.getProperty("AndroidFullReset");
        AndroidOrientation=properties.getProperty("AndroidOrientation");
        AndroidAutomationName=properties.getProperty("AutomationName");


        IOSUDID = properties.getProperty("IOSUDID");
        IOSPlatformName = properties.getProperty("IOSPlatformName");
        IOSPlatformVersion = properties.getProperty("IOSPlatformVersion");
        IOSBundleId= properties.getProperty("IOSBundleId");
        IOSReportFormat= properties.getProperty("IOSReportFormat");
        IOSTestName= properties.getProperty("IOSTestName");
        IOSNoReset= properties.getProperty("IOSNoReset");
        IOSFullReset= properties.getProperty("IOSFullReset");
        IOSSendKeyStrategy= properties.getProperty("IOSSendKeyStrategy");
        IOSAutomationName = properties.getProperty("IOSAutomationName");
        IOSDeviceName=properties.getProperty("IOSDeviceName");
        IOSAppPath = PathProject+"/src/test/java/com/templateJavaAppium/resources/app/ios/"+properties.getProperty("IOSApp");

        BS_USERNAME = properties.getProperty("BS_USERNAME");
        BS_ACCESSKEY = properties.getProperty("BS_ACCESSKEY");
        BS_Device = properties.getProperty("BS_Device");
        BS_OsVersion = properties.getProperty("BS_ACCESSKEY");
        BS_ChaveApp = properties.getProperty("BS_ChaveApp");
        BS_OsVersion = properties.getProperty("BS_OsVersion");
        BS_Url= properties.getProperty("BS_Url");


        BS_DeviceiOS = properties.getProperty("BS_DeviceiOS");
        BS_OsVersioniOS = properties.getProperty("BS_OsVersioniOS");
        BS_ChaveAppiOS = properties.getProperty("BS_ChaveAppiOS");




    }
}
