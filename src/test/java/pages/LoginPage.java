package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @AndroidFindBy(accessibility = "inputEmail")
    public WebElement inpEmail;

    @AndroidFindBy(accessibility = "inputPassword")
    public WebElement inpPassword;

    @AndroidFindBy(accessibility = "btnEntrar")
    public WebElement btnEntrar;

    public LoginPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void realizarLogin(String email, String senha) {
        inpEmail.sendKeys(email);
        inpPassword.sendKeys(senha);
        btnEntrar.click();
    }
}


