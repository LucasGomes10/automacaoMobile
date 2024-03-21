package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProdutosPage {
    @AndroidFindBy(accessibility = "conhecaTodosOsNossoCursos")
    public WebElement txtTituloProdutos;

    public ProdutosPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public String getTextTituloProdutos(){
        return txtTituloProdutos.getText();
    }
}
