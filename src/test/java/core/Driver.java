package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.options.BaseOptions;
import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private static AppiumDriver appiumDriver;

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void inicializaDriver() throws MalformedURLException {

        String url = "http://127.0.0.1:4723";
        BaseOptions options = new BaseOptions();
        options.setPlatformName("Android");
        options.setAutomationName("uiautomator2");
        options.setCapability("deviceName", "AutomacaoMobile");
        options.setCapability("appPackage", "br.com.chronosacademy");
        options.setCapability("appActivity", "br.com.chronosacademy.MainActivity");

        appiumDriver = new AppiumDriver(new URL(url), options);
    }
}
