package steps;

import core.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void inicializaTeste() throws MalformedURLException {
        Driver.inicializaDriver();
    }

    @Dado("que esteja na página de login")
    public void queEstejaNaPaginaDeLogin() {
        loginPage = new LoginPage();
    }

    @Quando("for realizado login com os seguintes dados")
    public void forRealizadoLoginComOsSeguintesDados(Map<String, String> map) {
        loginPage.realizarLogin(map.get("email"), map.get("senha"));

    }
}
