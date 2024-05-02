package core;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

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

    public static void inicializaDriverPerfecto() throws MalformedURLException {

        String cloudName = "trial";
        String securityToken = "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE3MTQ2MDMzNTgsImp0aSI6ImVjZGY2NjViLWY5Y2QtNGY2Zi05YThkLWE0NTY4ZTgwOWYwNCIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6IjgyYWM2NjJkLTI5NzgtNDU4MC05ZTQyLTY2MjY1OWQ2YWM0YSIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMzZiZjljNmEtZGRlNi00YjU0LTg5YzAtNzRjNDQ5MmNiODNhIiwic2Vzc2lvbl9zdGF0ZSI6Ijk1N2VkNzgwLWQ5MzYtNGRmZi1hNjAxLTAyMDM1NjM2YjRjYiIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ.zJRA_69Q3Jj-RCTcZgJ23F-UYs1jMLHr1GRxZfv2ug0";
        String url = "https://"+cloudName+".perfectomobile.com/nexperience/perfectomobile/wd/hub";

        BaseOptions options = new BaseOptions();

        options.setPlatformName("Android");
        options.setAutomationName("uiautomator2");
        options.setCapability("app", "PRIVATE:ChronosAcademy.apk");
        options.setCapability("model", "Pixel 8");
        options.setCapability("perfecto:securityToken", securityToken);

        appiumDriver = new AppiumDriver(new URL(url), options);
    }

    public static void swipe(int left, int top, String direction, double percent) {
        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

        ((JavascriptExecutor) Driver.getAppiumDriver()).executeScript("mobile: scrollGesture",
                ImmutableMap.of("left", left, "top", top, "width",
                        dimension.getWidth() / 2, "height", dimension.getHeight() / 2, "direction",
                        direction, "percent", percent));
    }
}
