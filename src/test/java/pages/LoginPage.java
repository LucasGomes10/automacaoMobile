package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.LoginMaps;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMaps {
    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void realizarLogin(String email, String senha) {
        inpEmail.sendKeys(email);
        inpPassword.sendKeys(senha);
        btnEntrar.click();
    }

    public String getTxtEmailError() {

        try {
            return txtEmailError.getText();
        } catch (Exception e) {
            return txtAuthEmailError.getText();
        }

    }

    public String getTxtPasswordError() {
        try {
            return txtPasswordError.getText();
        } catch (Exception e) {
            return txtAuthPasswordError.getText();
        }
    }

    public void clickLinkNaoTemConta() {

        linkNaoTemConta.click();
    }
}


