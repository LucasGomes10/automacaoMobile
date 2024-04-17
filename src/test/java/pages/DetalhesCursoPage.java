package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.DetalhesCursoMap;
import org.openqa.selenium.support.PageFactory;

public class DetalhesCursoPage extends DetalhesCursoMap {

    public DetalhesCursoPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void clickBtnIrParaPagamento(){
        btnIrParaPagamento.click();
    }
}
