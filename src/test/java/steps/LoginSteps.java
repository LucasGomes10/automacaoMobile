package steps;

import core.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void inicializaTeste() throws MalformedURLException {
        Driver.inicializaDriver();
    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public String stringType(String cell){
        return cell;
    }

    @Dado("que esteja na página de login")
    public void queEstejaNaPaginaDeLogin() {
        loginPage = new LoginPage();
    }

    @Quando("for realizado login com os seguintes dados")
    public void forRealizadoLoginComOsSeguintesDados(Map<String, String> map) {
        loginPage.realizarLogin(map.get("email"), map.get("senha"));

    }

    @Então("valido que no campo erro email exibe a mensagem {string}")
    public void validoQueNoCampoErroEmailExibeAMensagem(String msg) {
        assertEquals(msg, loginPage.getTxtEmailError());
    }

    @Então("valido que no campo senha exibe a mensagem {string}")
    public void validoQueNoCampoSenhaExibeAMensagem(String msg) {
        assertEquals(msg, loginPage.getTxtPasswordError());
    }
}
