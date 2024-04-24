package steps;

import io.cucumber.java.pt.Quando;
import pages.DetalhesCursoPage;

public class DetalhesCursoSteps {
    DetalhesCursoPage detalhesCursoPage;

    @Quando("clico em ir para pagamento")
    public void clicoEmIrParaPagamento() {
        detalhesCursoPage = new DetalhesCursoPage();
        detalhesCursoPage.clickBtnIrParaPagamento();
    }
}
