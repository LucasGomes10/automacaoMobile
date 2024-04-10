package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.LoginMaps;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMaps {
    public LoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void realizarLogin(String email, String senha) {
        inpEmail.sendKeys(email);
        inpPassword.sendKeys(senha);
        btnEntrar.click();
    }

    public String getTxtEmailError(){
        return txtEmailError.getText();
    }

    public String getTxtPasswordError(){
        return txtPasswordError.getText();
    }

    public void clickLinkNaoTemConta(){
        linkNaoTemConta.click();
    }
}


