package testsChornos;

import core.Driver;
import org.junit.jupiter.api.Test;
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

        loginPage = new LoginPage();
        produtosPage = new ProdutosPage();

        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());
    }

}
