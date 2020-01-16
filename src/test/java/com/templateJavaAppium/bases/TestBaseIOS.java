package com.templateJavaAppium.bases;
import com.templateJavaAppium.GlobalParameters;
import com.templateJavaAppium.utils.DriveFactory;
import com.templateJavaAppium.utils.ExtentReportUtils;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBaseIOS {
    private static String log4jConfigurationPath = System.getProperty("user.dir")+"\\src\\test\\java\\com.templateJavaAppium\\";
    private WebDriverWait wait;
    private AppiumDriverLocalService service;
    private AppiumServiceBuilder builder;

    @BeforeSuite
    public void beforeSuite(){
        new GlobalParameters();

        builder = new AppiumServiceBuilder();
        builder.withIPAddress(GlobalParameters.AppiumIPAddress);
        builder.usingPort(GlobalParameters.AppiumPort);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);

        //Caso queira deixar somente logs de erro no terminal
        //builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
        service = AppiumDriverLocalService.buildService(builder);
        service.start();

        ExtentReportUtils.createReport();
        System.setProperty("log4j.configurationFile",log4jConfigurationPath);
    }
    @BeforeMethod
    public void beforeTest(Method method) throws Exception {
       ExtentReportUtils.addTest(method.getName(), method.getDeclaringClass().getSimpleName());
        DriveFactory.InitApp("IOS");
       // DriveFactory.InitApp("IOSDeviceFarm");
        wait = new WebDriverWait(DriveFactory.getDriver(), 10);
    }
    @AfterMethod
    public void afterTest(ITestResult result){
       ExtentReportUtils.addTestResult(result);
        DriveFactory.getDriver().quit();
    }
    @AfterSuite
    public void afterSuite(){
        ExtentReportUtils.generateReport();
        service.stop();
    }
}
