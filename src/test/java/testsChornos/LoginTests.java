package testsChornos;

import core.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProdutosPage;
import java.net.MalformedURLException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTests {

    LoginPage loginPage;
    ProdutosPage produtosPage;

    @BeforeEach
    public void inicializaTesteLogin() throws MalformedURLException {
        Driver.inicializaDriver();

        loginPage = new LoginPage();
    }

    @Test
    public void realizarLoginValido() {
        produtosPage = new ProdutosPage();

        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());
    }

    @Test
    public void realizarLoginEmailInvalido() {
        loginPage.realizarLogin("teste", "123456");

        assertEquals("O email não é válido.", loginPage.getTxtEmailError());
    }

}
