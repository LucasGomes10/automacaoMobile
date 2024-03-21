package testsChornos;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.ProdutosPage;
import java.net.MalformedURLException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {

    LoginPage loginPage;
    ProdutosPage produtosPage;

    @Test
    public void realizarLoginValido() throws MalformedURLException {

        Driver.inicializaDriver();
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
        loginPage = new LoginPage();
        produtosPage = new ProdutosPage();

        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());
    }

}
